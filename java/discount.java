import java.util.Scanner;
class discount
{
 public static void main(String[]arg)
 {
  Scanner Scan=new Scanner(System.in);
  int a,b,d=0;
  System.out.println(" enter age and fair of passenger");
  a=Scan.nextInt();
  b=Scan.nextInt();
  if(a<14)
  {
  d=b/2;
  System.out.println(" fair after 50% discount is " + d);
  }
  else if(a>50)
  {
  d=(b-(b/5));
  System.out.println(" fair after 20% discount is " + d);
  }
  else
  {
	  d=(b-(b/10));
  System.out.println(" 10% discount and fair is " + d);
  }
  }
}