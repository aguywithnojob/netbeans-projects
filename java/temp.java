import java.util.Scanner;
class temp
{
 public static void main(String[]arg)
 {
  Scanner Scan=new Scanner(System.in);
  int c,f;
  System.out.println("enter temperature ");
  c=Scan.nextInt();
  f=(((c*9)/5)+32);
  System.out.println("temperature in f is " + f);
 }
 }