import java.util.Scanner;
class fprime
{
  public static void main(String[]arg)
  {
    Scanner Scan=new Scanner(System.in);
	int i,j,f;
	System.out.print("prime number between 1-50 is " + " 1  ");
	for(i=3;i<=50;i++)
	{ 
       f=0;
	 for(j=2;j<i;j++)
	 {
	   if(i%j==0)
	   f=1;
	 }
	 if(f==0)
	 System.out.print(i + " ");
	}
}
}