class throwstest
{
	public void getch()throws Exception
	{
		throw new Exception("throw and throws ");
		//System.out.println("++++");
	}
}
class mythrowstest
{
	public static void main(String[]arg)
	{
		throwstest obj=new throwstest();
		try
		{
		obj.getch();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}