class even
{
		public static int even(int a)
		{
			
			System.out.println(a);
			if(a==100)
			{
				
			}
			even(a+1);
		}
		public static void main(String[]arg)
		{
			int a=1,b;
			System.out.print("even number is ");
			b=even(a);
			System.out.print(" " + b);
		}
}