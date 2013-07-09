public class Main
{
	public static void demoproc()
	{
		NullPointerException e=new NullPointerException("top Layer");
		e.initCause(new ArithmeticException("cause"));
		throw e;
	}
	public static void main(String args[])
	{
		try
		{
			demoproc();
		}
		catch(NullPointerException ne)
		{
			System.out.println("Caught "+ne);
			System.out.println("Original Cause "+ne.getCause());
		}
	}
}