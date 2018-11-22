import java.util.Scanner;
class array2d
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int arr[][]=new int[3][3];
			int i,j,rsum=0,csum=0,d1=0,d2=0,p;
			System.out.println(" enter element of 2d array ");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					arr[i][j]=Scan.nextInt();
				}
			}
			System.out.println(" 2d array is ");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" " + arr[i][j]);
				}
				System.out.println(" ");
			}
			for(i=0;i<3;i++)
			{
				rsum=csum=0;
				for(j=0;j<3;j++)
				{
					rsum=rsum+arr[i][j];
					csum=csum+arr[j][i];
					if(i==j)
					d1=d1+arr[i][j];
					if(i+j==2)
					d2=d2+arr[i][j];
				}
				p=i+1;
				System.out.println(" sum of " + p + " row is " + rsum);
				System.out.println(" sum of " + p + " column is " + csum);
			}
			System.out.println(" sum of 1 diagonal is " + d1);
			System.out.println(" sum of 2 diagonal is " + d2);
		}
}