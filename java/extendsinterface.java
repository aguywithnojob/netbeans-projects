interface sport
{
	
	public void display();
}
interface Football
{
	public void goal();
}
interface Cricket extends sport,Football
{
	public void runn();
	
}
class testSport implements Cricket
{
	public void runn()
	{
		System.out.println("I am being scored runs ............");
	}
	public void display()
	{
		System.out.println("My score is 120 run in 20 overs ");
	}
}
class extendsinterface
{
	public static void main(String args[])
	{
		testSport obj = new testSport();
		obj.runn();
		obj.display();
	}
}