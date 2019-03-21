import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      int i1=1;
      int a=row;
      for(int i=row;i>=1;i--)
      {
        for(int j=col;j>=i;j--)
        {
          System.out.print(j);
          
        }
       // System.out.print("i"+(row-i1));
        for(int k=1;k<=(a-1);k++)
        {
          System.out.print(a);
        }
        i1++;
        a--;
       System.out.println();
    }
}
}