class multiplecatch
{
	public static void main(String[]arg)
	{
		int x=0;
		int arr[]=new int[5];
		try
		{
			arr[5]=10/x;
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}