class Box
{
	int height=10;
	int width=20;
	
}
public class Main
{
	public static void main(String args[])
	{
		Box b1=new Box();
		Box b2=new Box();
		
		System.out.println("Height of b1 is "+b1.height);
		System.out.println("Height of b2 is "+b2.height);
		
		b1.height=30;
		System.out.println("After changing height of b1");
		
		System.out.println("Height of b1 is "+b1.height);
		System.out.println("Height of b2 is "+b2.height);
	}
}