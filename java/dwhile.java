import java.util.Scanner;
class dwhile
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int n,s=0;
   do
   {
   System.out.println(" enter a number ");
   n=Scan.nextInt();
   s+=n;
   }while(n!=0);
   System.out.println("sum of entered number is " + s);
   }
  }