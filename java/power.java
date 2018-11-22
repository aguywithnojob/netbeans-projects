import java.util.Scanner;
class power
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int i,b,p,n=1;
			System.out.println(" enter base ");
			b=Scan.nextInt();
			System.out.println(" enter power ");
			p=Scan.nextInt();
			for(i=1;i<=p;i++)
			{
				n=n*b;
			}
			System.out.println(" answer is " + n);
		}
}