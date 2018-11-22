import java.util.Scanner;
class multiply
{
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		int a[][]=new int[10][10],b[][]=new int[10][10],c1[][]=new int[10][10];
		int i,j,s,r,c,l,m;
		System.out.println(" enter row and column of matrix1 ");
		r=Scan.nextInt();
		c=Scan.nextInt();
		System.out.println(" enter row and column of matrix2 ");
		l=Scan.nextInt();
		m=Scan.nextInt();
		if(c==l)
		{
		System.out.println(" enter a square matrix1 ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=Scan.nextInt();
			}
		}
		System.out.println(" matrix 1 is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			System.out.print(" " + a[i][j]);
			System.out.println(" ");
		}
		
		System.out.println(" enter square matrix2 ");
		for(i=0;i<l;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=Scan.nextInt();
			}
		}
		System.out.println(" matrix 2 is ");
		for(i=0;i<l;i++)
		{
			for(j=0;j<m;j++)
			System.out.print(" " + b[i][j]);
			System.out.println(" ");
		}
		System.out.println(" multiplication of matrix is ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<m;j++)
			{
				for(s=0;s<c;s++)
				c1[i][j]+=a[i][s]*b[s][j];
			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<m;j++)
				System.out.print(" " + c1[i][j]);
			System.out.println(" ");
		}
		}
		else
		System.out.println(" multiplication is not possible ");
	}
}