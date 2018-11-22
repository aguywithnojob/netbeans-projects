import java.util.Scanner;
class sqrt
{
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		int n,i;
		double rv=1.00,num;
		System.out.println(" enter a number ");
		n=Scan.nextInt();
		num=n;
		for(i=0;i<n;i++)
		{
			rv=0.5*(rv+num/rv);
		}
		System.out.println(" " +rv);

	}
}