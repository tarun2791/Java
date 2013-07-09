 public class Main
 {
	public static void main(String args[])
	{
		System.out.println(System.getenv("path"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("java.compiler"));
		long start=System.currentTimeMillis();
		System.out.println("Start time "+start);
		for(int i=0;i<20;i++)
		{
			System.out.print(i);
		}	
		System.out.println();
		long end=System.currentTimeMillis();
				System.out.println("End time "+end);

		System.out.println("Elapsed Time : "+(end-start)+" ns");
		Runtime runtime=Runtime.getRuntime();
		System.out.println(runtime.availableProcessors()+" Processors");
	}
	
 }