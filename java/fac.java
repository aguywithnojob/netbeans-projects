import java.util.Scanner;
class fac
{
 public static void main(String[]arg)
 {
  Scanner Scan=new Scanner(System.in);
  int n,f=1,i;
  System.out.println("enter a number ");
  n=Scan.nextInt();
  for(i=n;i>=1;i--)
  {
  f=f*i;
  }
  System.out.println("factorial of number is " + f);
 }
 }