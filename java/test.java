import java.util.Scanner;
class test
{
	int n;
	public int reverse(int n)
	{
		int r,s=0;
		while(n!=0)
		{
		r=n%10;
		s=s*10+r;
		n=n/10;
		}
		return s;
	}
	public int get()
	{
		Scanner Scan=new Scanner(System.in);
		System.out.println(" enter  a number ");
		n=Scan.nextInt();
		return n;
	}
	public int prime(int n)
	{
		int i,k=1;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			return 0;
		}
		return n;
	}
	public void dis(int k)
	{
		if(k==0)
		System.out.println(" not twisted prime ");
		else
		System.out.println(" twisted prime ");
	}
}
class main
{
	public static void main(String[]args)
	{
		Scanner Scan=new Scanner(System.in);
		test t=new test();
		int b;
		b=t.get();
		b=t.prime(b);
		b=t.prime(t.reverse(b));
		t.dis(b);
	}
}