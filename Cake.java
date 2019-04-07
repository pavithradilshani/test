class Cake{
	Cake(){
System.out.println("\007 Starting to bake a cake-please wait...");
	}
}	
 public Class MyCake{
 public static void main(String[]args){
	 new Cake();
	 
    try{
   Thread.sleep(14000);
 
 }catch (InterruptedException ie){
	 System.out.println(ie.getMessage());
 }
 System.out.println("\00\007\007 finishing baking the cake");
		
   
   }
   }