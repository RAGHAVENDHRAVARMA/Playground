
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int [n];
  	for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
        int value=sc.nextInt();
      subset( n,a,value);
    }
      public static void subset(int n,int a[],int value)
      {
           int sum=0;
          for(int i=0;i<n;i++)
          {
            for(int j=i+1;j<n;j++)
            {
              sum=a[i]+a[j];
              if(sum==value)
              {
              System.out.print(+a[i]+","+" "+a[j]);
              System.out.println("");
              }
             }
          }
      }
}
