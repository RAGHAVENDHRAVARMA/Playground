import java.util.Scanner;
class Main
{
  public static int square(int n)
  {
    int sq=n*n;
    return sq;
  }
	public static void main (String[] args)
    {
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=square(n1);
      System.out.println(n2);
	} 
}