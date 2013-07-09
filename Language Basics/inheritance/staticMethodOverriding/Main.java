 class A
 {
	public static void classMethod()
	{
		System.out.println("Class A: I am classMethod()");
	}
	public void instanceMethod()
	{
		System.out.println("Class A: I am instanceMethod()");
	}
 }
 class B extends A
 {
	public static void classMethod()
	{
		System.out.println("Class B: I am classMethod()");
	}	
	public void instanceMethod()
	{
		System.out.println("Class B: I am instanceMethod()");
	}
 }

 public class Main
 {
	public static void main(String args[])
	{
		A a=new B();
		a.instanceMethod();
		a.classMethod();	//static methods are hidden not overridden
		
		B b=new B();
		b.classMethod();
		//we can access static method using the class name as follows:
		B.classMethod();
		
		
		
	}
 }