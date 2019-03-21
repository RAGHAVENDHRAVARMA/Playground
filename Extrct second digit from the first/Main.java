import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      while(a>=100)
      {
        a=a/10;
      }
      int e=a%10;
      System.out.println(e);
    }
}
        