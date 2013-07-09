import java.io.*;
import java.net.*;

public class Provider
{
	ServerSocket providerSocket;
	Socket connection=null;
	ObjectOutputStream out;
	ObjectInputStream in;
	String message;
	String serverMsg;
	public Provider()
	{
		
	}
	void run()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			providerSocket=new ServerSocket(2004,10);
			System.out.println("Waiting for connection...");
			connection=providerSocket.accept();
			System.out.println("Connection Received from "+connection.getInetAddress().getHostName());
			out=new ObjectOutputStream(connection.getOutputStream());
			sendMessage("Connection Successfull..!");
			out.flush();
			in=new ObjectInputStream(connection.getInputStream());
			
			do
			{
				message=(String)in.readObject();
				System.out.println("Client > "+message);
				if(message.equals("bye"))
				{
					sendMessage("bye");
				}
				serverMsg=br.readLine();
				sendMessage(serverMsg);
				
			}while(!message.equals("bye"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
				out.close();
				providerSocket.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
	void sendMessage(String message)
		{
			try
			{
			
				out.writeObject(message);
				out.flush();
				System.out.println("Server > "+message);
			}
			catch(Exception e)
			{
					e.printStackTrace();
			}
			
		}
		
		public static void main(String args[])
		{
			Provider server=new Provider();
			while(true)
			{
				server.run();
			}
		}
}