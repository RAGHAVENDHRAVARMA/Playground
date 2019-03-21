import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
     int b[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    int flag=-1;
      for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
     	 if(a[i][j]!=b[i][j])
         {
           flag=0;
         }
      }
    }
    if(flag==0)
    {
      System.out.println("No");
    }
    else 
    {
      System.out.println("Yes");
    }
  }
}