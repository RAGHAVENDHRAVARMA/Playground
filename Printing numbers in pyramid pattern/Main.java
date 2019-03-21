import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=1;
      int j;
      for(int i=1;i<=n;i++)
      {
        for(j=1;j<=(n-i);j++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
			System.out.print(a+" ");
          a++;
        }
        System.out.println(" ");
    }    
}
}