public class AutoboxUnbox
{

	public static void main(String args[])
	{
		Integer iObj=100;
		System.out.println("This is boxed into Integer object\t\t"+iObj);
		int i=iObj;
		System.out.println("This is unboxed into int type\t\t"+i);
	}
}