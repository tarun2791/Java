class Subject
{
	private String name;
	
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Subject(String s)
	{
	 name=s;
	}
	
}

class Student implements Cloneable
{
	private Subject sub;
	private String name;
	
	public Subject getSub()
	{
		return sub;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Student(String name, String sub)
	{
		this.name=name;
		this.sub=new Subject(sub);
	}
	public Object clone() 
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException cnse)
		{
			return null;
		}
	}
}

public class ShallowTest
{
	public static void main(String args[])
	{
		//Original Object
		Student stu=new Student("Tarun", "Java");
		System.out.println("Original object :\t"+stu.getName()+" reads "+stu.getSub().getName()+"\n");
		
		//clone Object
		Student clonedStu=(Student)stu.clone();
		System.out.println("Cloned Object :\t"+clonedStu.getName()+" reads "+clonedStu.getSub().getName()+"\n");
		
		//Original Object is updated
		stu.setName("Anil");
		stu.getSub().setName("C++");
		
		System.out.println("Original object after updation :\t"+stu.getName()+" reads "+stu.getSub().getName()+"\n");
		
		System.out.println("Cloned Object after updating original object :\t"+clonedStu.getName()+" reads "+clonedStu.getSub().getName()+"\n");
		
		
	}
}