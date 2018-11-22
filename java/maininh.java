class animal
{
	animal()
	{
		System.out.println(" a new animal is created");
	}
}
class bird extends animal
{
	bird()
	{
		System.out.println(" a new bird is created");
	}	
	public void eat()
	{
		System.out.println(" bird eat ");
	}
}
class dog extends animal
{
	dog()
	{
		System.out.println(" a new dog is created ");
	}
	public void eat()
	{
		
		System.out.println(" dog eat ");
	}
}
class maininh
{
	public static void main(String[]arg)
	{
		animal a=new animal();
		dog d=new dog();
		bird b=new bird();
		d.eat();
		b.eat();
	}
}