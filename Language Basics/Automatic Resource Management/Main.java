import java.io.*;
class Main
{
	public static void main(String args[]) throws Exception
	{
		try( FileInputStream fis=new FileInputStream(args[0]);
			FileOutputStream fos=new FileOutputStream(args[1]))
			{
				int b;
				while((b=fis.read())!=-1)
				{
					fos.write((char)b);
				}
			}
	}
}