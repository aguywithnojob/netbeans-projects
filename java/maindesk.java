interface linux
{
	public void hey();
}
interface windows
{
	public void hey1();
}
class desktop implements linux,windows
{
	public void hey()
	{
		System.out.println(" linux ");
	}
	public void hey1()
	{
		System.out.println(" windows ");
	}
}
class maindesk
{
	public static void main(String[]arg)
	{
		desktop obj=new desktop();
		obj.hey();
	}
}