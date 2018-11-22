class Room
{
	int len=10,bred=20;
	public void getarea()
	{
		System.out.println("Area "+len*bred);
	}
}
class Room2 extends Room
{
		int height=10;
		public void getarea()
		{
			System.out.println("Area "+len*bred*height);
		}
	
}
class mainclass
{
	public static void main(String[] args)
	{
		Room2 obj = new Room2();
		obj.getarea();
	}
}