// class Thread{
	// public void run();
	// public void start()
	// {
		// run();
	// }
// }

class myThread extends Thread
{
	int i;
	public void run()// i am overriding run()
	{
		for(i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
}

class myThread2 extends Thread
{
	int i;
	public void run()// i am overriding run()
	{
		for(i=100;i<190;i++)
		{
			System.out.println(i+" Akshay");
		}
	}
}

class myThread3 extends Thread
{
	int i;
	public void run()// i am overriding run()
	{
		for(i=200;i<299;i++)
		{
			System.out.println(i + "Gautam");
		}
	}
}
class testThread
{
	public static void main(String [] args)
	{
		myThread obj = new myThread();
		myThread2 obj1 = new myThread2();
		myThread3 obj2 = new myThread3();
		obj.start();
		obj1.start();
		obj2.start();
	}
}