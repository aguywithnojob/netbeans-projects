class wswap
{
 public static void main(String[]arg)
 {
  int a=10,b=20;
  System.out.println("a is " + a + "b is " + b); 
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("a is " + a + "b is " + b);
  }
}