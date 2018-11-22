import java.util.Scanner;
class year
{
 public static void main(String[]arg)
 {
   Scanner Scan=new Scanner(System.in);
   int y;
   y=Scan.nextInt();
   if(y%400==0&&y%100==0||y%4==0)
   System.out.println(" leap year");
   else
   System.out.println("not leap year");
   }
  }