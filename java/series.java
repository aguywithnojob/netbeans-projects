import java.util.Scanner;
class series
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int n,i,j;
   System.out.println(" enter number of digit ");
   n=Scan.nextInt();
   for(i=1;i<=n;i++)
   {
	   
    for(j=1;j<=i;j++)
	{
	System.out.print("1  ");
	}
	System.out.print(" ,");
	}
}
}