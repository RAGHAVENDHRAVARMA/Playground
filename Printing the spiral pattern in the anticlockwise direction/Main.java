import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[][]=new int[n][n];
      int rmin=0,rmax=n-1;
      int cmin=0,cmax=n-1;
      int val=1;
      while((rmin<=rmax)&&( cmin<=cmax))
      {
      for(int i=cmax;i>=cmin;i--)
      {
        a[rmin][i]=val++;
      }
      
      for(int i=rmin+1;i<=rmax;i++)
      {
        a[i][cmin]=val++;
      }
      for(int i=cmin+1;i<=cmax;i++)
      {
        a[rmax][i]=val++;
      }
      for(int i=rmax-1;i>=rmin+1;i--)
      {
        a[i][cmax]=val++;
      }
       rmin++;cmin++;cmax--;rmax--;
    }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}