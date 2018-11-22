import java.util.Scanner;
class primef
{
		public static void prime(int n)
		{
			int i,f=1;
			for(i=2;i<n;i++)
			{
			if(n%i==0)
			f=0;
			}
			if(f==1)
			System.out.println(" prime number ");
			else 
			System.out.println(" not prime number");
		}
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int n;
			System.out.println(" enter a number ");
			n=Scan.nextInt();
			prime(n);
		}
}