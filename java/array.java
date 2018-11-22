import java.util.Scanner;
class array
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int arr[]=new int[10];
			int i,s=0,p=0,l=arr[0],t;
			System.out.println("enter element of array ");
			for(i=0;i<5;i++)
			{
				arr[i]=Scan.nextInt();
			}
				System.out.println("element of array is ");
			for(i=0;i<5;i++)
			{
				s+=arr[i];
				System.out.print(" " + arr[i]);
			}
			p=s/5;
			System.out.println(" sum  of elemnt is " + s + " average is " + p);
			t=arr[0];
			for(i=1;i<5;i++)  									//samllest element code
			{
				
					if(arr[i]<t)
					{
						t=arr[i];
						p=i+1;
					}
			}
			System.out.println(" smallest element is " + t + " location of it is  " + p);
			for(i=1;i<5;i++)									//largest element code
			{
				if(l<arr[i])
				{
					l=arr[i];
					p=i+1;
				}
			}
			System.out.println("largest element is " + l + " and location of it is  " + p);
		}
}