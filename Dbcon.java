import java.sql.*;


public class Dbcon {
final String driver="com.mysql.jdbc.Driver";
final String DB_URL ="jdbc:mysql://localhost/test";
final String USER ="root";
final String PASS ="";

	Connection connection = null;
	Statement satatement = null;
	ResultSet result = null;
	
	public Connection databasecConnect(){
		try {
			Class.forName(driver);
			try {
				connection = DriverManager.getConnection(DB_URL, USER, PASS);
				System.out.println("Connection sucessful");
				return connection;
				
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		catch(Exception e) {
		 e.printStackTrace();
		 return null;
		 }
	}
	
	public void insertData(String index, String name, String contact, String email) {
		try {
			satatement = connection.createStatement();
			System.out.println("statement create successful");
			String qry ="insert into studentregform values ('"+index+"','"+name+"','"+contact+"','"+email+"')";
			satatement.executeUpdate(qry);
			System.out.println("Querry ok");
		}
		catch(Exception e) {
			e.printStackTrace();		
			}
		
	}
	
	public String[] getData(String index) {
		String[] dataSet = new String[4];
		ResultSet data = null;
		
		try {
			System.out.println("Creating Statement...");
			satatement = connection.createStatement();
			System.out.println("Executing SQL...");
			String querry;
			querry = "SELECT * FROM studentregform WHERE indexNo='" + index+"'";
			data = satatement.executeQuery(querry);
			System.out.println("Retrived Recode Successfully...");

			while (data.next()) {
				dataSet[0] = data.getString("indexNo");
				dataSet[1] = data.getString("stdName");
				dataSet[2] = data.getString("mNumber");
				dataSet[3] = data.getString("E-mail");
				System.out.println("data extracted Successfully...");
				
			}
			return dataSet;
		} catch (Exception e) {
			e.printStackTrace();
			dataSet[0] = "-1";
			return dataSet;
		}

	}
	
}
