import java.util.*;
class st
{
	static int x=0;
	public void display()
	{
		x++;
		System.out.println(x);
	}
}
class statictest
{
	public static void main(String[]arg)
	{
		st o = new st();
		st o1 = new st();
		st o2 = new st();
		o.display();
		o1.display();
		o2.display();
	}
} 