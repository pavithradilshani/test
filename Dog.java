class Dog{
public void dogBark(){
System.out.println ("Dog is Barking");
}
}
class Puppy extends Dog{
public void puppyBark(){
System.out.println("Puppy is Barking");
}

public static void main (String[]arg){
Puppy obj = new Puppy();
obj.dogBark();  // dog is barking
obj.puppyBark();//puppy is barking
}
}
