import java.util.Scanner;
class fabo
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int a=0,b=1,c=0,i,n;
   System.out.println(" enter upto number of digit");
   n=Scan.nextInt();
   System.out.print(a);
   System.out.print(b);
    for(i=1;i<n;i++)
   {
	   c=a+b;
    System.out.print(" " + c);
	a=b;
	b=c;
    	
    }
}
}