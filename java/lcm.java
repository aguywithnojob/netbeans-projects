import java.util.Scanner;
class lcm
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int b,a,c=1,i,d=1;
			System.out.println("enter two number ");
			a=Scan.nextInt();
			b=Scan.nextInt();
			if(a%b==0 || b%a==0)
			{
					if(a>b)
					System.out.println(" lcm is " + a);
					else
					System.out.println(" lcm is " + b);
			}
			else if(a%4==0 && b%4==0)
			{
					a=a/4;
					b=b/4;
					c=a*b*4;
					System.out.println(" lcm is " + c);
			}
			else if(a%3==0 && b%3==0)
			{
					a=a/3;
					b=b/3;
					c=a*b*3;
					System.out.println(" lcm is " + c);
			}
			else
			{
					c=a*b;
					System.out.println(" lcm is " + c);
			}
		}
}