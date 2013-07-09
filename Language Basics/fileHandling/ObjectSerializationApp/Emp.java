import java.io.*;
import java.util.*;
class Emp implements Serializable
{
	int id;
	String name;
	float sal;
	transient final static Scanner sc=new Scanner(System.in);
	
	private Emp(int id, String name, float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getSal()
	{
		return sal;
	}
	
	public static Emp getEmp()
	{
		System.out.println("Please enter Employee id, name and salary");
		
		return new Emp(sc.nextInt(),sc.next(),sc.nextFloat());
	}
}