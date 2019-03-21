import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int max=0;
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      max=a[0];
      for(int j=1;j<a.length;j++)
      {
        if(max<a[j])
        {
          max=a[j];
        }
      }
      System.out.println(max);
    
  
      
    }
}