import java.util.*;
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
    for(int i=0;i<n/2;i++)
    {
      for(int j=i+1;j<n/2;j++)
      {
        if(a[i]>a[j])
        {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=n/2;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}