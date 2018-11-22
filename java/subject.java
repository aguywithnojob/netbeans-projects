import java.util.Scanner;
class subject
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int s1,s2,s3,s4,s5,sum=0,p;
   s1=Scan.nextInt();
   s2=Scan.nextInt();
   s3=Scan.nextInt();
   s4=Scan.nextInt();
   s5=Scan.nextInt();
   sum=(s1+s2+s3+s4+s5);
   p=(sum/5);
   System.out.println("total marks is  " + sum);
   System.out.println(" percentage is " + p);
   if(sum>=33)
   System.out.println(" passed");
   else
   System.out.println("fail");
   }
  }