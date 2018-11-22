import java.util.Scanner;
class farmstrom
{
  public static void main(String[]arg)
  { 
    Scanner Scan=new Scanner(System.in);
	int i,j,r,c,s;
	System.out.print(" armstrom number  between 1-1000 is ");
	for(i=1;i<=1000;i++)
	{
	  s=0;
	  c=i;
	  while(c!=0)
	  {
	   r=c%10;
	   s=s+(r*r*r);
	   c/=10;
	   }
	   if(s==i)
	   System.out.print(i + " ");
	}
}
}