public class Bitwise
{

	public static void main(String args[])
	{
		byte a=64,b;
		int i;
		//Left Shift operator
		i=a<<2;
		b=(byte)(a<<2);
		
		System.out.println("Original value of a : "+a);
		System.out.println(" i AND b : "+i+"\t"+b);
	//	int c=2;	for left shift
		int c=512; //for right shift
		System.out.println("Each left shift double the original ("+c+") value");
		for(int j=1;j<=8;j++)
		{
		//	c=c<<1; //right shift
			c=c>>1;//right shift
			System.out.println(j+" Time : "+c);
		}
		int e=1;
		int f=2;
		if(e==1||++e>1)
		{
			System.out.println(e);
		}
		
		if(f>2||++f==3)
		{
			System.out.println(f);
		}
		
		
	}
}