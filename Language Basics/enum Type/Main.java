import java.io.*;
enum Directions
{
	East, West, North, South;
}
public class Main implements Serializable
{
	public static void main(String args[]) throws Exception
	{
		Directions dir[]=Directions.values() ;
		FileOutputStream fos=new FileOutputStream("output.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		
		for(Directions d:dir)
		{
	
		oos.writeObject(d);
		}
		System.out.println("File created");
		
		fos.close();
		oos.close();
		FileInputStream fis=new FileInputStream("output.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Directions direction =(Directions)ois.readObject();
		dir=direction.values();
		for(Directions d: dir)
		{
			System.out.println(d);
		}
		fis.close();
		oos.close();
		Directions dr=null;
		System.out.println(dr.valueOf("Easthg")); // This statement throws an IllegalArgumentException which is an unchecked exception.
		
	}
}