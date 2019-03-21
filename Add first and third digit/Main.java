import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
     int n=a%10;
      int c=0;
      int d=0;
      while(a!=0)
      {
        c=a%10;
        d=c;
        a=a/10;
      }
      System.out.println(d+n);

	}
}