import java.util.Scanner;
class stringtest
{
	public static void main(String[]arg)
	{
		Scanner scan=new Scanner(System.in);
		String ch[]=new String[5];
		String temp;
		int i;
		System.out.println(" enter 3 student name ");
		for(i=0;i<3;i++)
		{
			ch[i]=scan.next();
		}
		
		/*System.out.println(" student name in ascending order is ");
		for(i=0;i<3;i++)
		{
			if(ch[i].compareTo(ch[i+1]))
			{
				temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
			}
		}*/
		
		for(i=0;i<3;i++)
		{
			System.out.print(ch[i] + "  ");
		}
	}
}