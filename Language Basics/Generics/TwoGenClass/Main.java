class TwoGen<T,V>
{
	T ob1;
	V ob2;
	
	TwoGen(T ob1, V ob2)
	{
		this.ob1=ob1;
		this.ob2=ob2;
	}
	public void showType()
	{
		System.out.println("Type of T is : "+ob1.getClass().getName());
		System.out.println("Type of V is : "+ob2.getClass().getName());
		
	}
	public T getOb1()
	{
		return ob1;
	}	
	public V getOb2()
	{
		return ob2;
	}
}
class Teacher
{
	public String toString()
	{
		return "I am Teacher";
	}
}
class Student
{
	public String toString()
	{
		return "I am Student";
	}
}

public class Main
{
	public static void main(String args[])
	{
		TwoGen<Integer, String> tg=new TwoGen<Integer, String>(100, "Tarun");
		tg.showType();
		System.out.println("first parameter : "+tg.getOb1()+"\n"
							+"Second parameter : "+tg.getOb2());
							
		
		Teacher t=new Teacher();
		Student s=new Student();
		TwoGen<Teacher, Student> tg1=new TwoGen<Teacher, Student>(t, s);
		tg1.showType();
		System.out.println("First parameter : "+tg1.getOb1()+"\n"
							+"Second parameter : "+tg1.getOb2());
	}
		
}		