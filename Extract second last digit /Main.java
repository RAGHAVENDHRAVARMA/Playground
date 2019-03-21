import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int n=a%10;
      a=a/10;
      int c=a%10;
      System.out.println(c);
	}
}