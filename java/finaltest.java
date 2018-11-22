 class abc
{
		final public void getch()
		{
			System.out.println("hey test final ");
		}
}
class finaltest// extends abc
{
	public void getch()
	{
		System.out.println("hey overriding");
	}
	public static void main(String[]arg)
	{
		abc obj=new abc();
		obj.getch();
		final int i=10;  //final variable
		System.out.println(i);
	}
}