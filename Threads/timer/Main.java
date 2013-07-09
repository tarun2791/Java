import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask
{
	public void run()
	{
		System.out.println("Timer Task==> Hi...! I am executer"); 
	}
}

public class Main
{
	public static void main(String args[])
	{
		MyTimerTask myTask=new MyTimerTask();
		Timer timer=new Timer();
		timer.schedule(myTask,5000,5000);
		try
		{
			Thread.sleep(5000);
			
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);		
		}
		timer.cancel();
	}	
}
