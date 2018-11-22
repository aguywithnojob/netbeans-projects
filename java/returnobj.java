class testretobj
{
	int a,b;
	public testretobj(int x,int y)
	{
		a=x;//200
		b=y;//100
	}
	public testretobj getObject()
	{
		testretobj obj = new testretobj(10,20);
		return obj;
	}
}
class returnobj
{
	public static void main(String[] args)
	{
			testretobj obj1 = new testretobj(200,100);
			testretobj obj2;
			
			obj2 = obj1.getObject();
			System.out.println("value of a "+obj2.b);
	}
}