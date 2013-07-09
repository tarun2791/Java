class TwoD
{
	int x, y;
	TwoD(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
}


class ThreeD extends TwoD
{
	int z;
	
	ThreeD(int x, int y, int z)
	{
		super(x,y);
		this.z=z;
	}
	
}
class Map<T extends TwoD>
{
	T[] cords;
	Map(T[] o)
	{
		cords=o;
	}
}	

public class Main
{
	public static void showXY(Map<?> c)
	{
		for(int i=0;i<c.cords.length;i++)
		{
			System.out.println(c.cords[i].x+" , "+c.cords[i].y);
		}
	}
	
	public static void showXYZ(Map<? extends ThreeD> c)
	{
		for(int i=0;i<c.cords.length;i++)
		{
			System.out.println(c.cords[i].x+" , "+c.cords[i].y+" , "+c.cords[i].z);
		}
	}
	public static void main(String args[])
	{
		TwoD td[] = {new TwoD(0,0),new TwoD(-1,-2)};
		Map<TwoD> map=new Map<TwoD>(td);
		
		System.out.println("Contents of td location are: ");
		showXY(map);
		
		
		
		
	}
}