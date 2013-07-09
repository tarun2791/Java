class Main
{
	public static void main(String args[])
	{
		MyClass o1=new MyClass(100);
		MyClass o2=new MyClass(123.45F);
		MyClass o3=new MyClass(12.6);
		o1.showVal();
		o2.showVal();
		o3.showVal();
	}
}

class MyClass
{
	private double num;
	<T extends Number> MyClass(T arg)
	{
		num=arg.doubleValue();
	}
	void showVal()
	{
		System.out.println("Val : "+num);
	
	}
}