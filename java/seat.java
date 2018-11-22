import java.util.Scanner;
import java.io.*;
class seat
{
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		DataInputStream in=new DataInputStream(System.in);
		int s,r,c,i,j,d,f;
		int a[][]=new int[100][100];
		String e;
		System.out.println(" enter number os students ");
		s=Scan.nextInt();
		if(s%5==0)
		{
			r=s/5;
			c=5;
		}
		else
		{
			r=s/5+1;
			c=5;
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				try
				{
				d=0;
				System.out.println("enter eepartment of stueent ");
				e=in.readLine();
				if(e=="cs")
				{
					d=1;
					a[j][i]=d;
				}
				if(e=="it")
				{
					d=2;
					a[j][i]=d;
				}
				if(e=="me")
				{
					d=3;
					a[j][i]=d;
				}
				if(e=="ec")
				{
					d=4;
					a[j][i]=d;
				}
				
				}
				catch(Exception obj)
				{
					System.out.println(obj);
				}
			}
			if(s%5!=0)
			{
				c=s%5;
			}
		}
		if(s%5==0)
		{
			r=s/5;
			c=5;
		}
		else
		{
			r=s/5+1;
			c=5;
		}
		f=0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
			if(s%5!=0)
			{
				c=s%5;
			}
		}
		/*for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(a[j][i]==a[j+1][i] || a[j][i]==a[i][j+1])
				{
					System.out.println(" i = " + i + " j = " + j);
					f=1;
					break;
				}
			}
			if(s%5!=0)
			{
				c=s%5;
			}
		}*/
		
		if(f==0)
		System.out.println(" valid ");
		else
		System.out.println(" invalid ");
	}
}