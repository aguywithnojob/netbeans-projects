import java.util.Scanner;
class geometry
{
		public static void main(String[]arg)
		{
			Scanner Scan=new Scanner(System.in);
			int a,b,c,d,l1,l2,l3,l4,l5,l6;
			System.out.println("enter coordiinate of 1 point ");
			a=Scan.nextInt();
			b=Scan.nextInt();
			System.out.println(" enter distance on two axis ");
			l1=Scan.nextInt();
			l2=Scan.nextInt();
			System.out.println(" enter coordinate of 2nd point ");
			c=Scan.nextInt();
			d=Scan.nextInt();
			System.out.println(" enter distance on two axis ");
			l3=Scan.nextInt();
			l4=Scan.nextInt();
			b=b+l2;
			d=d+l4;
			l5=l2-(b-d);
			a=a+l1;
			c=c+l3;
			l6=l1-(a-c);
			a=a-l1;
			b=b-l2;
			System.out.println(" coordinate is " + a + " , " + b);
			System.out.println(" distance on two axis is " + l5 + " , " + l6);
		}
}