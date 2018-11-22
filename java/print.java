import java.util.Scanner;
class print
{
			public static void main(String[]arg)
			{
					Scanner Scan=new Scanner(System.in);
					int i,j;
					char ch='A';
					for(i=1;i<=4;i++)
					{
						System.out.println(" ");
						for(j=1;j<=i;j++)
						{ 
							System.out.print(ch + " ");
							ch++;
						}
					}
					
			}
}