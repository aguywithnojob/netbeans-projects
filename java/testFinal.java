final class useFinal
{
	public  void display()
	{
		System.out.println("My option");
	}
}
class finalInherit extends useFinal
{
	public  void display()
	{
		System.out.println("My inherited option");
	}
}
class testFinal
{
	public static void main(String[] args)
	{
		finalInherit obj = new finalInherit();
		obj.display();
	}
}