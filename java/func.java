class overloading
{
	int a,b;
	char ch;
	public void getval()
	{
		a=b=1;
		ch='A';
	}
	public void getval(char c)
	{
		a=b=1;
		ch=c;
	}
	public void getval(int x)
	{
		a=b=x;
		ch='A';
	}
	public void getval(int x, int y)
	{
		a=x;
		b=y;
		ch='A';
	}
	public void getval(int x,int y, char c)
	{
		a=x;
		b=y;
		ch=c;
	}
	public void dis()
	{
	System.out.println(" a = " + a + " b = " + b + " ch = " + ch);
	}
}
class func
{
	public static void main(String[]arg)
	{
		overloading b=new overloading();
		b.getval('C');
		b.dis();
	}
}