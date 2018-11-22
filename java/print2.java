import java.util.Scanner;
class print2
{
		public static void main(String[]arg)
		{
				int i,t,j,s;
				for(i=1;i<=4;i++)
				{
					for(s=2;s>=i;s--)
					{
						System.out.print(" ");
					}
					for(j=1;j<=i;j++)
					{
						System.out.print("*");
					}
				    for(j=2;j<=i;j++)
					System.out.print("*");
					System.out.println(" ");
					
				}
		}
}