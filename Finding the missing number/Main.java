import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      int max=a[0];
       for(int i=1;i<a.length;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
        }
       }
      int min=a[0];
      int c=a[0];
      for(int i=1;i<a.length;i++)
      {
        if(a[i]<min)
        {
         c=a[i];
        }
      }
      int b[]=new int[n];
      int j=0;
      //System.out.println(c+" "+max);
     for(int i=c;i<=max;i++)
      {
        b[j]=i;
        j++;
      }
      for(int i=0;i<a.length;i++)
      {
        for(int j1=0;j1<b.length;j1++)
        {
          if(a[i]==b[j1])
          {
            a[i]='%';
            b[j1]='%';
            
          }
        }
      }
        for(int i=0;i<b.length;i++)
        {
          if(b[i]!='%')
          {
          System.out.println(b[i]);
          }
        }
      
        
    }
}