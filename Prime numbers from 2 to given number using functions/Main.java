import java.util.Scanner;
class Main{
  public static void primeN(int n)
  {
    
    for(int i=1;i<=n;i++)
    {
		int c=0;
      for(int j=i;j>=1;j--)
      {
        if(i%j==0)
        {
          c=c+1;
        }
      }
      if(c==2)
      {
        System.out.println(i);
      }
      
    }
  }
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      primeN(n1);
      
  }
}