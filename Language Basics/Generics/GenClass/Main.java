class Gen<T>
{
	T ob;
	Gen(T o)
	{
		ob=o;
	}
	T getOb()
	{
		return ob;
	}
	void showType()
	{
		System.out.println("Type of T is : "+ob.getClass().getName());
	}
}
class Emp
{
	public String toString()
	{
		return "I am Emp type";
	}
}

public class Main
{
	public static void main(String args[])
	{
		Gen<Integer> iob=new Gen<Integer>(100);
		iob.showType();
		int v=iob.getOb();
		System.out.println("Value : "+v);
		
		Gen<String> strob=new Gen<String>("Hello I am String ");
		strob.showType();
		String s=strob.getOb();
		System.out.println("Value : "+s);
		Emp e=new Emp();
		Gen<Emp> empobj=new Gen<Emp>(e);
		empobj.showType();
		e=empobj.getOb();
		System.out.println("Value : "+e);
	}	
}