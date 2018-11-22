import java.util.Scanner;
class hcf
{
		public static void main(String[]arg)
		{
		   Scanner Scan=new Scanner(System.in);
		   int a,b,t,i;
		   System.out.println("enter two number "); 
		   a=Scan.nextInt();
		   b=Scan.nextInt();
		   if(a>b)
		   {
			    t=1;
				for(i=1;i<=a;i++)
				{
					if(a%i==0 && b%i==0)
					t=i;
				}
				System.out.println(" hcf is " + t);
		   }
		   else
		   {
			    t=1;
				for(i=1;i<=a;i++)
				{
					if(a%i==0 && b%i==0)
					t=i;
				}
				System.out.println(" hcf is " + t);
		   }
	
        }
}