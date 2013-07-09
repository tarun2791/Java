public class Main11{
	private int i = giveMeJ();
	private int j = 10;
	private int giveMeJ(){
		return j;
	}
	public static void main(String args[]){
	
		System.out.println((new Main11()).i);
		if("String".trim() == "String".trim())
	System.out.println("Equal");
else
	System.out.println("Not Equal");
	
	byte b = 0;
	b += 1;
	
	char c=(char)-1;
	System.out.println(c);
	
	}
	
	public Object show()
	{
		return new Exception();
	}
}