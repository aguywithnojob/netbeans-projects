import java.util.Scanner;
class tprime
{
			public static boolean prime(int n)
			{
				int i,f=1;
				boolean ret;
				for(i=2;i<n;i++)
				{
					if(n%i==0)
					f=0;
				}
				if(f==1)
				{
					ret=true;
					return ret;
				}
				else
				{
					ret=false;
					return ret;
				}
			}
			public static int reverse(int n)
			{
				int r,s=0;
				while(n!=0)
				{
					r=n%10;
					s=((s*10)+r);
					n=n/10;
				}
				return s;
			}
			public static void main(String[]arg)
			{
				Scanner Scan=new Scanner(System.in);
				int n;
				System.out.println(" enter a number ");
				n=Scan.nextInt();
				if(prime(n))
				{
					//System.out.println(" prime number ");
					if(prime(reverse(n)))
					System.out.println(" twisted prime number  :-) ");
					else
					System.out.println(" not twisted prime number ");
				}
				else
				System.out.println(" not even a prime number :-( ");
			}
}