import java.util.Scanner;
class calc
{
 public static void main(String[]arg)
 {
   Scanner Scan=new Scanner(System.in);
   int a,b,c;
   String ch;
   System.out.println(" enter two number");
   a=Scan.nextInt();
   b=Scan.nextInt();
   System.out.println(" enter your choice ");
   ch=Scan.next();
   switch(ch)
   {
    case "+" : c=a+b;
	          System.out.println(" sum is " + c);
			  break;
	case "-" : if(a>b)
	           c=a-b;
			   else
			   c=b-a;
			   System.out.println(" subtraction is " + c);
			   break;
	case "/" : c=a/b;
	          System.out.println(" division is " + c);
			  break;
	case "*" : c=a*b;
	          System.out.println(" multiplication is " + c);
			  break;
	case "%" : c=a%b;
	         System.out.println(" remainder is " + c);
			 break;
	default :
	        System.out.println(" wrong choice ");
			break;
    }
   }
 }
			  