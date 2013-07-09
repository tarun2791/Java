public class Main
{
	public static void main(String args[])
	{
		int i=10,k;
		k=i<0?-i:i;
		
		System.out.println("Absolute value of [ i<0 ? -i : i ] for 10 is : "+k);
		System.out.println("\n\n\n");
		
		i=-10;
		k=i<0?-i:i;
		System.out.println("Absolute value of [ i<0 ? -i : i ] for -10 is : "+k);
	}	
}