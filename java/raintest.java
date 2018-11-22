class rain extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<10;i++)
		{	
			
			try{
			if(i%2==0)
			{
			Thread.sleep(1000);
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("'''''''''''''''''");
			}
		}
			
	}
	
}
class raintest
{
	public static void main(String[]arg)
	{
		rain obj=new rain();
		rain.start();
	}
}