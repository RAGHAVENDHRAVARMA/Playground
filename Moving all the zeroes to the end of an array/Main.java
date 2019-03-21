import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    zeros( n , a);
      
    }
  public static void zeros(int n ,int a[])
  {
    int j=0;
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    {
      if(a[i]!=0)
      {
        b[j]=a[i];
        j++;
      }
    }
    for(int j1=0;j1<n;j1++)
      {
        System.out.print(b[j1]+" ");
      }
}
}