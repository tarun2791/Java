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
		Box b2=b1;
		
		System.out.println("Height of b1 = "+b1.height);
		System.out.println("Height of b2 is "+ b2.height);
		
		b2.height=30;
		System.out.println("After changing the height of b2");
		System.out.println("Height of b1 = "+b1.height);
		System.out.println("Height of b2 is "+ b2.height);
		
		b1=null; 
		System.out.println("Height of b1 = "+b1.height); // This will generate null pointer exception
		System.out.println("Height of b2 is "+ b2.height);
		
		
	}
}