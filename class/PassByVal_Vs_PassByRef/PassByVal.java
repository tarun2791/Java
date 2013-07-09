class Test
{
	public void change(int i,int j)
	{
		i*=2;
		i/=2;
	}
}

public class PassByVal
{
	public static void main(String args[])
	{
		Test ob=new Test();
		int a=5,b=10;
		
		System.out.println("a and b before call : "+a+" , "+b);
		
		ob.change(a,b);
		
		System.out.println("a and b after call : "+a+" , "+b);
		
	}
	
	
}