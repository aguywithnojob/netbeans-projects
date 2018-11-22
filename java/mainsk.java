interface abc
{
	int a,b;
	public void display();
}
class inter implements abc
{
	public void display()
	{
		System.out.println("akshay")
	}
}
class inter1 implements abc
{
	public void display()
	{
		System.out.println("akshay kumar")
	}
}
class mainak
{
	public static void main(String args[])
	{
		inter obj = new inter();
		inter1 obj1 = new inter1();
		obj.display();
		obj1.display();
	}
}