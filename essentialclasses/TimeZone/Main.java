 import java.util.TimeZone;
 class Main
 {
	public static void main(String[] args)
	{
	
		TimeZone tz=TimeZone.getDefault();
		System.out.println("Time zone is : "+tz);
		System.out.println("Time zone id is :"+tz.getID());
	}
 }