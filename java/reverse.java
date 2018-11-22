import java.util.Scanner;
class reverse
{
 public static void main(String[]arg)
 {
 Scanner Scan=new Scanner(System.in);     //reverse and palindrom number
 int n,r,s=0;
 System.out.println("enter a number ");
 n=Scan.nextInt();
 int c=n;
 while(n>=1)
 {
  r=n%10;
  s=(s*10)+r;
  n=n/10;
 }
 System.out.println("reverse of number is " + s);
 if(c==s)
	 System.out.println("number is palindrom");
 else
	 System.out.println("number is not palindrom");
 }
 }