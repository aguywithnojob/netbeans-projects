import java.util.Scanner;
class result
{
 public static void main(String[]arg)
 {
 Scanner Scan=new Scanner(System.in);
 int s1,s2,s3,s4,s5,sum=0,p;
 System.out.println(" enter 5 subjects marks ");
 s1=Scan.nextInt();
 s2=Scan.nextInt();
 s3=Scan.nextInt();
 s4=Scan.nextInt();
 s5=Scan.nextInt();
 sum=(s1+s2+s3+s4+s5);
 p=(sum/5);
 System.out.println(" total marks of 5 subject is " + sum);
 System.out.println(" percentage is " + p);
 if(p>=75)
 System.out.println("distinct ");
 else if(p>=60&&p<75)
 System.out.println(" Ist ");
 else if(p>=45&&p<60)
 System.out.println(" IInd ");
 else if(p>=33&&p<45)
 System.out.println(" IIIrd ");
 else
 System.out.println(" fail");
 }
}