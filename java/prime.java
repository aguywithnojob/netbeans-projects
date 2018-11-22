import java.util.Scanner;
class prime
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int n,i,f=0;
   System.out.println("enter a number ");
   n=Scan.nextInt();
   for(i=2;i<n;i++)
   {
	   if(n%i==0)
		f=1;
   }
   if(f==0)
	System.out.println("prime number ");
   else 
	System.out.println(" not prime number");
   
}
}