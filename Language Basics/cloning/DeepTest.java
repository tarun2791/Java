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
	public Subject(String name)
	{
		this.name=name;
	}
}
class Student implements Cloneable
{
	private String name;
	private Subject sub;
	
	public String getName()
	{
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Subject getSub()
	{
		return sub;
	}
	public Student(String name, String sub)
	{
		this.name=name;
		this.sub=new Subject(sub);
	}
	public Object clone()
	{
		Student s=new Student(name, sub.getName());
		return s;
	}
}
public class DeepTest
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
	/**
	* This is main method
	*/
}