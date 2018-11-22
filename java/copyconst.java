class Reactangle
{
	int len , bred;
	public Reactangle(int a,int b)
	{
		len = a;
		bred = b;
	}
	Reactangle(Reactangle r)
	{
		len  = r.len;
		bred  = r.bred;
	}
	public void getArea()
	{
		System.out.println("Area "+ (len*bred));
	}
}
class copyconst
{
	public static void main(String[] args)
	{
		Reactangle rect = new Reactangle(10,12);
		Reactangle rect1 = new Reactangle(rect);
		Reactangle rect2;
		rect2 = rect;
		rect2.getArea();
	}
}