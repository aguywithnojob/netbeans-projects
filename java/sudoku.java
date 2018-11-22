import java.util.Scanner;
class sudoku
{
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j,k=0,t=a[0][0],s;
		System.out.println(" enter number of sudoku row wise in this way ---> ");
		for(i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{
				a[i][j]=Scan.nextInt();
			}
		}
		for(i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{	
				t=a[i][j];
				for(s=0;s<9;s++)
				{	
					if(s!=j)
					{
						if(t==a[i][s])
						{
							k=1;
							break;
						}
					}
				}
			}
		}
		if(k==0)
		System.out.println(" your sudoku is okay ");
		else 
		System.out.println(" your sudoku is wrong ");
	}
}