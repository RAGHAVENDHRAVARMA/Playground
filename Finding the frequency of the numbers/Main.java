import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int k=sc.nextInt();
   	 int a[]=new int[n];
       int b[]=new int[k+1];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
     
      for(int i=0;i<n;i++)
      {
        int c=a[i];
       // System.out.println(c);
        b[c]++;
      }
      for(int i=1;i<=k;i++)
      {
        
        
         System.out.println(i+" "+b[i]);
        
      }
    }
}