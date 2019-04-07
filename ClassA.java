class ClassA{
 private static String msg = "ClassA-(Outer class) static variable Responds";
 
 private static class ClassB{
 public void showMsg(){
    System.out.println(msg);
 }
 }
 
 public static void main(String[]args){
 ClassA.ClassB objB = new ClassA.ClassB();
 objB.showMsg();
 }
 }
