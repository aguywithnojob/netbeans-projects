abstract class myIdea
{
	int x,y;
	abstract public void display();
	public 	void getdisplay()
	{
		System.out.println("Now I am working");
	}
}


class abs extends myIdea
{
	public void display()
	{
		System.out.println("Now I am working");
	}
}
class myabs
{
	public static void main(String [] args)
	{
		abs obj = new abs();
		obj.display();
	}
}