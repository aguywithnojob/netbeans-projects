import java.util.*;
class st
{
	static int x=0;
	public static void display()
	{
		x++;
		System.out.println(x);
	}
}
class statictest1
{
	public static void main(String[]arg)
	{
		st.display();
	}
} 