public class MultiCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = args.length;
			int b=Integer.parseInt(args[1]);
			int c=a/b;
			
			
		}
		
		
		catch(ArithmeticException ae)
		{
			System.out.println("Divided by 0 : "+ae);
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Array Index out of bunds : "+aiob);
		}
		catch(Exception e)
		{
		
		}
		
		System.out.println("After try/catch block");
	}
}