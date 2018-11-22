import java.io.*;
import java.util.*;
class abc{
	
		abc()
		{
			System.out.println("default constructor");
		}
		
		public abc(int a)
		{
			int s= a*a;
			System.out.println("square is "+ s);
		}
		public abc(int a,int b)
		{
			int c= a+b;
			System.out.println("sum is "+ c);
		}
		public abc(int a,int b, int c)
		{
			int d= a+b+c;
			System.out.println("sum of 3 no. is "+ d);
		}
}

class consover{
	public static void main(String[]arg)
	{
	Scanner Scan=new Scanner(System.in);	
	int a,b,c;
			a=Scan.nextInt();
			b=Scan.nextInt();
			c=Scan.nextInt();
		abc obj= new abc();
		abc obj1 = new abc(a);
		abc obj2 = new abc(a,b);
		abc obj3 = new abc(a,b,c);
	
		
	}

}