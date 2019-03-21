import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    search(a,n);
  }
  public static void search(int a[],int n)
  {
    boolean flag=false;
    int sum1=0;
    int sum=a[0]+a[1]+a[2];
    for(int i=3;i<a.length;i++)
    {
      sum1=a[a.length-3]+a[a.length-2]+a[a.length-1];
    }
    if(sum==sum1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
  }
