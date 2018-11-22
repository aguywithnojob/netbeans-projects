class Rectangle
{
	int length,breadth,area;
	public Rectangle(int x)// declaring constructor
	{
		length = breadth = x;
			System.out.println("yes i am constructor");
	}
	public Rectangle(int x,int y)// declaring constructor
	{
		length =x;
		breadth = y;
			System.out.println("yes i am constructor");
	}
	public void getArea()
	{
		area = length*breadth;
		System.out.println(area);
	}
}
class constest
{
	public static void main(String[]arg)
	{
		Rectangle rect = new Rectangle(4);
		
		rect.getArea();
	}
}

