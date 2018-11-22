class Rectangle
{
	int len=2,bred=4;
	public void getarea()
	{
		System.out.println("Area = "+ len*bred);
	}
}
class rate extends Rectangle
{
	int rate=4;
	public void getAmount()
	{
		System.out.println("Amount = Rs"+len*bred*rate);
	}
	
}
class abc extends rate
{
	
	
}
class inherit
{

	public static void main(String [] args)
	{
		rate rect = new  rate();
		rect.getarea();
	}
}