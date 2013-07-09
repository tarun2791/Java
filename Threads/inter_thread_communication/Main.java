class SharedBox
{
	int n;
	boolean valueSet=false;
	
	synchronized int get()
	{
		
		while(!valueSet)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		System.out.println("Got : "+n);
		valueSet=false;
		notify();
		return n;
		
	}
	synchronized void put(int n)
	{
		while(valueSet)
		{
			try
			{	
				wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		this.n=n;
		valueSet=true;
		System.out.println("Put : "+n);
		notify();
		
	}
}

class Producer implements Runnable
{
	SharedBox box;
	Producer(SharedBox box)
	{
		this.box=box;
		new Thread(this, "Producer").start();
	}
	public void run()
	{
		int i=0;
		while(i<20)
		{
			try
			{
				box.put(i++);
				Thread.sleep(2000);
			}
			catch(Exception e)
			{}
		}
	}
}

class Consumer implements Runnable
{
	SharedBox box;
	Consumer(SharedBox box)
	{
		this.box=box;
		new Thread(this, "Consumer").start();
		
	}
	public void run()
	{
		while(true)
		{
			try
			{
				box.get();
				Thread.sleep(2000);
			}
			catch(Exception e){}

		}
	}
	
}



public class Main
{
	public static void main(String args[]) throws Exception
	{
		SharedBox box=new SharedBox();
		Producer p=new Producer(box);
		Thread.sleep(2000);
		
		Consumer q=new Consumer(box);
		
		
	}
}