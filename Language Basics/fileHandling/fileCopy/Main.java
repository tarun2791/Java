import java.io.*;
public class Main
{
	
	public static void copyFile(String source, String dest) throws IOException, FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(source);
	
		FileOutputStream fos=new FileOutputStream(dest, true);
	
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
			fos.write((char)ch);
			
		}
		
		
		fis.close();
		fos.close();
		
	}
	public static void createFile(String name) throws Exception
	{
		FileOutputStream fos=new FileOutputStream(name, true);
		DataInputStream dis=new DataInputStream(System.in);
		int ch;
		System.out.println("Enter the contents of a file with ^ at the end");
		while((ch=(char)dis.read())!='^')
		{
			fos.write(ch);
		}
		
	}
	public static void readFile(String name) throws Exception
	{
		FileInputStream fis=new FileInputStream(name);
		int ch;
		System.out.println("The Contents of File are \n"
					+"=======================================\n");
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
	}
	public static void main(String args[]) throws Exception
	{
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Please enter 1 to create a file\n"
								+"Enter 2 to read a file\n"
								+"Enter 3 to copy a File\n"
								+"Enter 4 to exit");
			int choice=Integer.parseInt(br.readLine());
			
				switch(choice)
				{
					case 1:
					{
						System.out.println("Enter the name of the file to be created");
						String fileName=br.readLine().trim();
						createFile(fileName);
						System.out.println("File creted");
						break;
					}
					case 2:
					{
						System.out.println("Enter the name of the file to be read");
						readFile(br.readLine());
						break;
					}
					case 3:
					{
						System.out.println("Enter the name of Source and destination files");
						String source=br.readLine();
						String dest=br.readLine();
						copyFile(source, dest);
						break;
										
					}
					case 4:
					{
						System.exit(1);
					}
					default :
					{
						System.out.println("Invalid choice");
					}
				}
				
				
			
	
	}
}