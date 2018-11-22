import java.util.Scanner;
class check
{
 public static void main(String[]arg)
 {
  Scanner Scan=new Scanner(System.in);
  int a,b,c;
  a=Scan.nextInt();
  b=Scan.nextInt();
  c=a+b;
  if(c==100)
  System.out.println(" sum is 100");
  else
  System.out.println(" sum is not 100");
  }
 }