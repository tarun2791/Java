 class Base
 {
	void callMe()
	{
		System.out.println("I am inside Base class' callMe()");
		
	}
 }
 class SubClass1 extends Base
 {
	void callMe()
	{
		System.out.println("I am inside SubClass1's callMe()");
		
	}
 }
 class SubClass2 extends Base
 {
	void callMe()
	{
		System.out.println("I am inside SubClass2's callMe()");
		
	}
 }
 public class Main
 {
	public static void main(String args[])
	{
		Base a=new Base();
		SubClass1 b=new SubClass1();
		SubClass2 c=new SubClass2();
		
		Base r;
		r=a;
		r.callMe();
		
		r=b;
		r.callMe();
		
		r=c;
		r.callMe();
		
		
	}
 }