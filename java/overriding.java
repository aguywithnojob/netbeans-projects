class box
{
	int l,b;
	public box()
	{
		System.out.println(" hey base class constructor ");
	}
	public int getarea()
	{
		return l*b;
	}
}
class boxh extends box
{
	int h;
	public boxh(int x,int y,int z)
	{
		
		//super.l=x;
		//super.b=y;
		h=z;
	}
	public int getarea()
	{
		return l*b*h;
	}
}
class overriding
{
	public static void main(String[]arg)
	{
		boxh obj=new boxh(1,2,3);
		System.out.println("area is " + obj.getarea());
	}
}