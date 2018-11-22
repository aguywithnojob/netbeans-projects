import java.util.Scanner;
class tble
{
  public static void main(String[]arg)
  {
  Scanner Scan=new Scanner(System.in);
  int i,j,n;
  for(i=2;i<=20;++i)
  {
	  System.out.println(" table of " + i);
    for(j=1;j<=10;j++)
	{
	n=i*j;
	System.out.println(i + "*" + j + "=" + n);
	}
	}
}
}