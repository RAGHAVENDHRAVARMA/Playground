import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int sum=0;
      while(a>0)
      {
        int e=a%10;
        sum=sum+e;
        a=a/10;
      }
      System.out.println(sum);
        
	}
}