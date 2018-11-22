//WE CAN CAN ACHIVE MULTITHREADING BY EXTENDING CLASS AND BY IMPLEMENTING INTERFACE HERE IS THE EXAMPLE OF MULTITHREAD USING INTERFACE

class mynewthread implements Runnable//extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("first class loop "+i);
		}
		System.out.println("first class loop end");
	}
}
class newthread implements Runnable
{
	public void run()
	{
		for(int i=21;i<40;i++)
		{
			System.out.println("second class loop "+i);
		}
		System.out.println("second class loop end");
	}
}
class newthread1 implements Runnable
{
	public void run()
	{
		for(int i=41;i<60;i++)
		{
			System.out.println("third class loop "+i);
		}
		System.out.println("third class loop end");
	}
}
class newthread2 implements Runnable
{
	public void run()
	{
		for(int i=61;i<80;i++)
		{
			System.out.println("fourth class loop "+i);
		}
		System.out.println("fourth class loop end");
	}
}
public class mythread 
{
	public static void main(String[] args)
	{
		mynewthread t1 = new mynewthread();
		Thread t2 = new Thread(t1);
		t2.start();
		newthread n1 = new newthread();
		Thread t3 = new Thread(n1);
		t3.start();
		newthread1 m1 = new newthread1();
		Thread t4 = new Thread(m1);
		t4.start();
		newthread2 m2 = new newthread2();
		Thread t5 = new Thread(m2);
		t5.start();	
	}
}