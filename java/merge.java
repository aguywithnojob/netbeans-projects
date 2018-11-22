import java.util.Scanner;
class merge
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int a[]=new int[100],b[]=new int[100];
			int i,s1,s2,s3;
			System.out.println(" enter the size of array-1 ");
			s1=Scan.nextInt();
			System.out.println(" enter the element of array-1 ascending order ");
			for(i=0;i<s1;i++)
				a[i]=Scan.nextInt();
			
			System.out.println(" enter size of array-2  ");
			s2=Scan.nextInt();
			System.out.println(" enter element of array-2 in ascending order ");
			for(i=0;i<s2;i++)
				b[i]=Scan.nextInt();
			
			s3=s1+s2;
			/*System.out.println(" 3-array after copying of two is ");	//copying of two array
			for(i=0;i<s1;i++)
			c[i]=a[i];
			for(i=0;i<s2;i++)
			c[i+s1]=b[i];
			for(i=0;i<s3;i++)
			System.out.print(" " + c[i]);*/
			
			for(i=0;i<s2;i++)
			{
				a[i+s1]=b[i];
			}
			System.out.println(" array after merge is ");
			for(i=0;i<s3;i++)
			System.out.print(" " + a[i]);
		}
}