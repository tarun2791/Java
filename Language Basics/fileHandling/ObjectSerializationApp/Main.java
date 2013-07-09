import java.io.*;
import java.sql.*;
public class Main 
{
	public static void main(String args[]) throws Exception
	{
		Emp e=Emp.getEmp();
		FileOutputStream fos=new FileOutputStream("database.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		Connection con=DriverManager.getConnection("Jdbc:Odbc:dsn");
		FileInputStream fis=new FileInputStream("database.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp emp=(Emp)ois.readObject();
		Statement st=con.createStatement();
		st.executeUpdate("insert into Employees values("+emp.getId()+",'"+emp.getName()+"',"+emp.getSal()+")");
		System.out.println(emp);
	}
}