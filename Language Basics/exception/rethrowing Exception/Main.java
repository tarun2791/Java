public class Main
{
	public static void method()
	{
		try
		{
			System.out.println("Throwing exception");
			throw new NullPointerException("demo");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside demo");
			//rethrow exception
			throw e;
		}
		
	}
	public static void main(String args[])
	{
		try
		{
			method();
		}
		catch(NullPointerException e)
		{
			System.out.println("Recaught : "+e);
		}
	}
}