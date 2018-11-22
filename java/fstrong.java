import java.util.Scanner;
class fstrong
{
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		int i,j,n,s,f,r;
		System.out.print(" strong number between 1-1000 is ");
		for(i=1;i<=1000;i++)
		   {
				s=0;
				n=i;
				while(n!=0)
			    {
				    f=1;
					r=n%10;
					for(j=1;j<=r;j++)
					{
							f=f*j;
					}
					s=s+f;
					n=n/10;
				}
				if(s==i)
				System.out.print(i + " ");
				
			}
	}
	 
}