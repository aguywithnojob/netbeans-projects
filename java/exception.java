import java.util.Scanner;
class exception
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		try
		{
			int z = x/y;
			System.out.println(z);
		}
		catch(Exception e)
		{
			System.out.println("There is an Error ");
		}
		finally
		{
			System.out.println("I am always run whether there is error or not");
		}
		
		System.out.println("Hello this is end line of this programm");
	}

}
