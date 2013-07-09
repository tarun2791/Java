class Test2
{
	int a,b;
	Test2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void meth(Test2 o)
	{
		o.a*=2;
		o.b/=2;
	}
}

public class PassByRef
{
	public static void main(String args[])
	{
		Test2 ob=new Test2(5,10);
		
		System.out.println("a and b before calling : "+ob.a+" , "+ob.b);
		
		ob.meth(ob);
		System.out.println("a and b after calling : "+ob.a+" , "+ob.b);
	}
	
}