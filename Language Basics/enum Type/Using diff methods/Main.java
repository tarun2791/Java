enum Direction
{
	East, South, West, North
}

public class Main
{
	public static void main(String args[])
	{
		Direction ap1, ap2, ap3;
		
		for(Direction a:Direction.values())
		{
			System.out.println(a+"  "+a.ordinal());
		}
		
		ap1=Direction.West;
		ap2=Direction.East;
		ap3=Direction.West;
		System.out.println("\n******************* Demosntration of compareTo() method ********************");
		
		if(ap1.compareTo(ap2)<0)
		{
			System.out.println(ap1+" comes before "+ap2);
			
		}
		
		if(ap1.compareTo(ap2)>0)
		System.out.println(ap1+" comes after "+ap2);
		if(ap1.compareTo(ap3)==0)
		System.out.println(ap1+" and "+ap3+" are equal");
		
		System.out.println("\n******************* Demosntration of equals() method ********************");
		if(ap1.equals(ap2))
		System.out.println("Error !");
		if(ap1.equals(ap3))
		System.out.println(ap1+" equals "+ap3);
		if(ap1==ap3)
		System.out.println(ap1+" == "+ap3);
		
	}
}

