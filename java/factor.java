import java.util.Scanner;
class factor
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int n,i;
			System.out.println(" enter a number ");
			n=Scan.nextInt();
			System.out.print(" factor is = ");
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				System.out.print(i + " * ");
			}
		}
}