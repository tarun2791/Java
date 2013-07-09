class Z
{
	public static void show()
	{
		System.out.println("Hi i am show");
	}
}
public class ZMain
{
	public static void main(String args[])
	{
		Z z=new Z();
		z.show();
		
		Z.show();
	}
}