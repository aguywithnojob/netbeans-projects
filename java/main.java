class rectangle
{
	int a,b;
	public void setval()
	{
		a=b=10;
	}
	public void getval()
	{
		System.out.println(a + " " + b);
		
	}
}
class main
{
	public static void main(String[]args)
	{
		rectangle robj = new rectangle();
		robj.setval();
		robj.getval();
	}
}