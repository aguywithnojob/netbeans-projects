import java.util.Scanner;
class stick
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int n,l,b,a=0;
			System.out.println("enter number of stick ");
			n=Scan.nextInt();
			if(n>=4)
			{
			if(n%2==1)
			  n=n-1;
			if(n%4==0)
			{
				l=n/4;
				a=l*l;
				System.out.println(" maximum area can be made is  " + a + " that is square of side = " + l);
			}
			else
			{
				n=n/2;
				if(n%2==1)
				{
					l=(n+1)/2;
					b=l-1;
					a=l*b;
					System.out.println(" maximum area can be made is " + a + " that is rectangle of length= " + l + " breadth = " + b);
				}
				else
				{
					l=n/2;
					b=l;
					a=l*b;
					System.out.println("maximum area can be made is " + a + " that is  sqaure of side = " + l);
				}
			}
			}
			else
			System.out.println(" stick is less than 4 ");
		}
}