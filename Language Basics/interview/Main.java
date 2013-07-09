class Main
{
	public void method(Object o)
	{
		System.out.println("Object version");
		
	}
	public void method(String s)
	{
		System.out.println("String version");
	}
	public static void main(String args[])
	{
		Main m=new Main();
		m.method(null);
	}
}
