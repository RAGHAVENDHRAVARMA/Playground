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
    int max=a[0];
    int c=0;
    for(int i=0;i<a.length;i++)
    {
      if(max<a[i])
      {
        max=a[i];
        c=i;
      }
    }
      System.out.println(c);
    
  }
  }
