import java.util.*;
class TestException
{
	int arr[] = new int[10];
	int x,y;
	Scanner scan = new Scanner(System.in);
	
	public void getAction()
	{
		try
		{
			x = scan.nextInt();
			y = scan.nextInt();
			if(y>=5 && y<=8)
			{
					throw new ArithmeticException("Bhai ye meri Exception Dyan se zara");
			}
			arr[10] = x/y;
		}
		
		catch(ArithmeticException ax)
		{
			System.out.println(ax);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Try and Catch work");
	}
}
class usemulticatch
{
	public static void main(String[] args)
	{
		TestException obj = new TestException();
		obj.getAction();
	}
}