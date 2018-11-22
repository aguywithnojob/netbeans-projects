import java.io.*;
class datainputtest
{
	public static void main(String[]arg)
	{
		DataInputStream aa = new DataInputStream(System.in);
		int x;
		String name;
		try
		{
			System.out.println(" enter your name ");
			name = aa.readLine();
			System.out.println(" enter your age ");
			x=Integer.parseInt(aa.readLine());
			System.out.println("Congratulations  !!  "+name +" Your age is "+x+"  Yrs");
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
	}
}