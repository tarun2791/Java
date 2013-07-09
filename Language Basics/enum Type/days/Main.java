enum Direction
{
	South(10)	,East(9),Norht(12),West(8);
	private int myValue;
	Direction(int p)
	{
		myValue=p;
	}
	int getMyValue()
	{
		return myValue;
	}
}

public class Main
{
	public static void main(String args[])
	{
		System.out.println(Direction.South.getMyValue());
		
		for(Direction a:Direction.values())
		{
			System.out.println(a+" Coasts "+a.getMyValue());
		}
	}
}