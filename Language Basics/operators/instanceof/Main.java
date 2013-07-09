class Parent
{

}
interface MyInter
{

}
class Child extends Parent implements MyInter
{

}
public class Main
{
	public static void main(String args[])
	{
		Parent obj1=new Parent();
		Parent obj2=new Child();
		
		System.out.println("Obj1 instanceof Parent "+(obj1 instanceof Parent));
		System.out.println("Obj1 instanceof Child "+(obj1 instanceof Child));
		System.out.println("Obj1 instanceof MyInter "+(obj1 instanceof MyInter));
		System.out.println("Obj2 instanceof Parent "+(obj2 instanceof Parent));
		System.out.println("Obj2 instanceof Child "+(obj2 instanceof Child));
		System.out.println("Obj2 instanceof MyInter "+(obj2 instanceof MyInter));
}
}