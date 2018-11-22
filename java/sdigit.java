import java.util.Scanner;
class sdigit
{
 public static void main(String[]arg)
 {
   Scanner Scan=new Scanner(System.in);
   int n,s=0,r;
   System.out.println("enter a number ");
   n=Scan.nextInt();
   while(n>=1)       
   {
    r=n%10;
	s+=r;
	n=n/10;
   }
  
   System.out.println("sum of digit of number is  " + s);
   }
   }