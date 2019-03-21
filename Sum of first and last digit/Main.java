import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int c=a%10;
      int d=0;
      int e=0;
      while(a>0)
      {
        d=a%10;
        e=d;
        a=a/10;
      }
      System.out.println(e+c);
        
	}
}