import java.util.Scanner;
class fpalindrom
 {
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   int i,c,r,s;
   System.out.print(" palindrom number between 100-500 is ");
   for(i=100;i<=500;i++)
   {
     s=0;
	 c=i;
     while(c!=0)
	 {
	   r=c%10;
	   s=(s*10)+r;
	   c=c/10;
	   }
	   if(s==i)
	   System.out.print(i  + " ");
	}
}
}