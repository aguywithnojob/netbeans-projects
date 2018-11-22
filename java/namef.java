import java.util.Scanner;
class namef
{
  public static void main(String[]arg)
  {
    Scanner Scan=new Scanner(System.in);
	int i;
/*for(i=0;i<=100;i++)     //printing 1to 100
   System.out.println(" " + i);*/
 /*for(i=1;i<=100;)      //printing by+3
	{
	System.out.println(" " + i);
     i+=3;
	 }*/
	/* for(i=100;i>=1;)    //printing by -5
	 {
		 System.out.println(i);
		 i-=5;
	 }*/
	/* for(i=1;i<=10;i++)    //print table of 2
	 {
		 int n=2;
		 System.out.println(n + " * " + i + "=" +n*i);
	 }*/
	 for(i=1;i<=50;i++)      //print even no 1to 50
	 {
		 if(i%2==0)
			 System.out.println(i);
	 }
  }
}