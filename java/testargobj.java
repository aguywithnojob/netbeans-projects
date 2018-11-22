class objectargument
{
	int a,b;
	public objectargument(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	public boolean equals(objectargument o)
	{
		boolean ret=false;
		if(o.a == a && o.b == b)
		{
			ret = true;
		}
		else
		{
			ret = false;
		}
		return ret;
	}
}
class testargobj
{
	
	public static void main(String args[])
	{
		objectargument obj = new objectargument(100,222);
		objectargument obj1 = new objectargument(101,222);
		System.out.println(obj.equals(obj1));
	}
}