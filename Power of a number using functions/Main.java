import java.util.Scanner;
class Main{
  public static double power1(int base,int exponent)
  {
    double a=Math.pow(base,exponent);
    return a;
  }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=sc.nextInt();
      double d=power1(n,n1);
      System.out.print(d);
      
      
	}
}