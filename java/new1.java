import java.util.Scanner;
class rectangle
{
	int l,b;
	public void setval()
	{
		l=b=1;
	}
	public void setval(int x)
	{
		l=b=x;
	}
	public void setval(int x,int y)
	{
		l=x;
		b=y;
		
	}
	public void getarea()
	{
		System.out.println("Area of Rectangle = "+ l*b);
	}
}
class new1
{
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		rectangle r=new rectangle();
		r.setval();
		r.getarea();
	}
}	