import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=n;
      int sum=1;
      int mul=0;
      while(n>0)
      {
        int b=n%10;
        for(int i=1;i<=b;i++)
        {
          sum=sum*i;
        }
        mul=mul+sum;
        n=n/10;
        sum=1;
      }
       if(mul==a)
       {
         System.out.print("Yes");
       }
      else
      {
        System.out.print("No");
      }
          
        
	}
}