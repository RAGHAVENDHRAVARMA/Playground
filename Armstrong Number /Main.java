import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int b=n;
      int d=n;
      double sum=0.0;
      while(n>0)
      {
        int a=n%10;
        count++;
        n=n/10;
      }
      while(b>0)
      {
        int c=b%10;
       sum=sum+Math.pow(c,count);
         b=b/10;
      }
      if(d==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
	}
}
}