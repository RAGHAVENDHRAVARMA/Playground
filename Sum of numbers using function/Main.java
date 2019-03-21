import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int s1=0;
    for(int i=1;i<=n;i++)
    {
      s1=s1+i;
    }
    return s1;
  }
      
	public static void main (String[] args){
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sum(n1);
      System.out.println(n2);
	   
	}
}