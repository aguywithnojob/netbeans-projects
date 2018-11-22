import java.util.Scanner;
class fperfect
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int i,j,r,c,s;
   System.out.print(" perferct number between 1-1000 is  ");
   for(i=1;i<=1000;i++)
   {
    s=0;
     for(j=i;j>1;j--)
	 {
	   if(i%j==0)
	   {
		r=i/j;
		s+=r;
	   }
	}
	if(s==i)
	System.out.print(i + " ");
	}
}
  }