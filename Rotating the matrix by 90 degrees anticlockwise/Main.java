import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    int tran[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        tran[j][i]=a[i][j];
      }
    }
     for(int i=row-1;i>=0;i--)
    {
      for(int j=0;j<col;j++)
      {
        System.out.print(tran[i][j]+" ");
      }
       System.out.println();
    }
  }
      
}
