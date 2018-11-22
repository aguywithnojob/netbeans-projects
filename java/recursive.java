import java.util.Scanner;
class recursive
{
		public static int fac(int n)
		{
			if(n==1)
			return 1;

			return n*fac(n-1);
		}
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int n,f=1;
			System.out.println("enter a number ");
			n=Scan.nextInt();
			f=fac(n);
			System.out.println(" factorial is " + f);
		}
}  
/*class sum
{
		public static int sum()
		{
			int n,s=0;
			if(n==0)
			{
				return n+sum();
			break;
			}
			else
			{
					return n+sum();
			}
		}
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			System.out.println("sum of all number entered is " + sum());
		}
}*/