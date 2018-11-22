import java.util.Scanner;
class count
{
   public static void main (String[]arg)
   {
    Scanner Scan=new Scanner(System.in);
	int n,c=0;
	System.out.println("enter a number ");
	n=Scan.nextInt();
	while(n!=0)
	{
		c++;
	  n=n/10;
	  
	 }
	
	 System.out.println(" number of digit in number is " + c);
}
}