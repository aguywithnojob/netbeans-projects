import java.util.Scanner;
class strong
{
  public static void main(String[]arg)
  {
  Scanner Scan=new Scanner(System.in);
  int n,c,r,f,s=0,i;
  System.out.println(" enter a number ");
  n=Scan.nextInt();
  c=n;
  while(n!=0)
  {
     f=1;
     r=n%10;
	 for(i=1;i<=r;i++)
	 {
	 f=f*i;
	 }
	 s=s+f;
     n=n/10;
	}
	if(c==s)
	System.out.println(" strong number ");
	else
	System.out.println(" not strong number");
    }
	}