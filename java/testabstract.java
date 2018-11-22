abstract class myIdea
{
	int x,y;
	abstract public void display(); 
}


class abs extends myIdea
{
	public void getdisplay()
	{
		System.out.println("Now I am working");
	}
}
class myabs
{
	public static void main()
	{
		abs obj = new abs();
		obj.getdisplay();
	}
}