class RelationalOperator
{
	public static void main(String args[])
	{
		System.out.println("Program to demonstrate the Logical Operators and Short Cuirted Operators");
		
		int a,b,c,d;
		a=b=c=d=1;
		int e=5;
		
		System.out.println("Using Simple logical operators");
		if(a!=1 & b++<e)
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(b);
		}
		
		System.out.println("Using short circuited operator");
		if(c!=1 && d++<e)
		{
			System.out.println(d);
		}
		else 
		{
			System.out.println(d);
		}
		
	}
}