import java.util.Scanner;
class perfect
{
  public static void main(String[]arg)
  {
  Scanner Scan=new Scanner(System.in);
  int i,n,r,c,s=0;
  System.out.println(" eneter a number ");
  n=Scan.nextInt();
   c=n;
  for(i=n;i>1;i--)
  {
	  if(n%i==0)
	  {
	  r=n/i;
	  s+=r;
	  }
  }
  if(s==c)
  System.out.println(" perfect number ");
else 
	System.out.println(" not perfect number");

  }
  }