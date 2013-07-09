class MyException extends Exception
{
	private int detail;
	public MyException(int detail)
	{
		this.detail=detail;
	}
	public String toString()
	{
		return "My Exception [ "+detail+" ]";
	}
}

public class Main
{
	public static void compute(int a) throws MyException
	{
		System.out.println("compute method called with "+a);
		if(a>10)
		throw new MyException(a);
		System.out.println("Normal Exit");
	}
	
	public static void main(String args[])
	{
		try
		{
			compute(1);
			compute(2);
			compute(5);
			compute(20);
			compute(9);
		}
		catch(MyException me)
		{
			System.out.println("Caught exception "+me);
		}
	}
}