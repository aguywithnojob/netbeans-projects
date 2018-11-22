import java.util.Scanner;
class farray
{
	public static int add(int a[],int s)
	{
		int i,sum=0;
		for(i=0;i<s;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[]arg)
	{
		Scanner Scan=new Scanner(System.in);
		int a[]=new int[10];
		int i,s;
		System.out.println(" enter size of array ");
		s=Scan.nextInt();
		System.out.println(" enter the element of array ");
		for(i=0;i<s;i++)
		{
			a[i]=Scan.nextInt();
		}
		System.out.println(" sume of element of array is " + add(a,s));
	}
}	