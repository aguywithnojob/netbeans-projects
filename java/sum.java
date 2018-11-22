import java.util.Scanner;
class sum
{
  public static void main(String[]arg)
  {
    Scanner Scan=new Scanner(System.in);
	int a,t;
	a=Scan.nextInt();
	if(a<100)
	{
	 t=(100-a);
	 a+=t;
	 System.out.println("no after sum is " + a);
	 }
	else
	{
		t=(a-100);
		a=(a-t);
	System.out.println("number is " + a);
}
}
}
		