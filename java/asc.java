import java.util.Scanner;
class asc
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int a[]=new int[10],i,j,t,s,e;
			System.out.println(" enter size of array ");
			s=Scan.nextInt();
			System.out.println("enter element of array ");
			for(i=0;i<s;i++)
			a[i]=Scan.nextInt();
			for(i=0;i<s;i++)								//ascending order 
			{
				for(j=i+1;j<s;j++)
				{
					if(a[i]>a[j])
					{
						t=a[j];
						a[j]=a[i];
						a[i]=t;
						
					}
				}
			}
			System.out.println(" array in ascending order is ");
			for(i=0;i<s;i++)
			System.out.print(" " + a[i]); 
			for(i=0;i<s;i++)								//descending order
			{
				for(j=s;j>i;j--)
				{
					if(a[i]<a[j])
					{
						t=a[j];
						a[j]=a[i];
						a[i]=t;
						
					}
				}
			}
			System.out.println(" array in descending order is ");
			for(i=0;i<s;i++)
			System.out.print(" " + a[i]);
		}
}