import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int s=0;
      int d=0;
      while(a>0)
      {
        s=a%10;
        d=s;
        a=a/10;
      }
      System.out.println(d);
	}
}