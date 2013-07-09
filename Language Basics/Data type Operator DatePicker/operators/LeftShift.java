class LeftShift
{
	public static void main(String args[]) throws Exception
	{
		byte a=64, b;
		int c=1;
		int i;
		i=a<<2;
		b=(byte)(a<<2);
		for(int j=0;j<10;j++)
		{
			c=c<<2;
			System.out.println(c);
			Thread.sleep(2000);
		}
		System.out.println("Original value of a :"+a);
		System.out.println("i \t and b is : "+i+"\t\t"+b);
	}
}