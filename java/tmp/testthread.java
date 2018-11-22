class testthread extends Thread
{  
 public void run()
 {  
  for(int i=1;i<5;i++)
  {  
    try
	{
		Thread.sleep(1000);
		}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[])
 {  
  testthread t1=new testthread();  
  testthread t2=new testthread();  
   
  t1.start();  
  t2.start();  
 }  
} 