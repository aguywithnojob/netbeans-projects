import java.util.Scanner;
class array2
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int a[]=new int[10],i,j,e,s,f=0,t=1;
			System.out.println("enter size of array ");
			s=Scan.nextInt();
			System.out.println("enter element of array ");
			for(i=0;i<s;i++)
			a[i]=Scan.nextInt();
			/*System.out.println(" enter element to search for ");			//searching in array
			e=Scan.nextInt();
			for(i=0;i<s;i++)
			{
				if(e==a[i])
				{
					e=i+1;
					f=1;
				}
			}
			if(f==1)
			System.out.println("elemnt found at location " + e);
			else
			System.out.println("elemnt not found ");*/
		/*	System.out.println(" enter element to be deleted ");			//deletion of element
			e=Scan.nextInt();
			for(i=0;i<s;i++)
			{
				if(e==a[i])
				{
					e=i;
					for(i=e;i<s;i++)
					{
						a[i]=a[i+1];
					}
					s--;
				}
			}
			System.out.println("array after deletion is ");
			for(i=0;i<s;i++)
			System.out.print(" " + a[i]); */
			System.out.println(" enter element to be insert and location where to insert ");			//insertion of element
			e=Scan.nextInt();
			f=Scan.nextInt();
				for(i=s+1;i>f-1;i--)
				{
				a[i]=a[i-1];
				t=1;
				}
				a[f-1]=e;
			s++;
			System.out.println("array after insertion ");
			for(i=0;i<s;i++)
			System.out.print(" " + a[i]);
		}
}
