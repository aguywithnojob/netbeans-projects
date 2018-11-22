import java.util.Scanner;
class vowel
{
  public static void main(String[]arg)
  {
   Scanner Scan=new Scanner(System.in);
   String v;
   System.out.println(" enter a alphabet ");
   v=Scan.next();
   switch(v)
   {
    case "a" : 
	case "e" :
	case "i" :
	case "o" :
	case "u" :
	          System.out.println(" vowel");
			  break;
	default: System.out.println(" consonant");
	        break;
	}
}
}