import java.util.Scanner;
class large
{
 public static void main(String[]arg)
 {
 Scanner Scan=new Scanner(System.in);
 int a,b,c;
 System.out.println(" enter 3 no ");
 a=Scan.nextInt();
 b=Scan.nextInt();
 c=Scan.nextInt();
 if(a>b&&a>c)
 System.out.println(" largest number is " + a);
 else if(b>a&&b>c)
 System.out.println(" largest number is " + b);
 else
 System.out.println(" largest number is " + c);
 }
}