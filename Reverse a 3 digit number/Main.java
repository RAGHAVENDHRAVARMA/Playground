import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a;
    a=sc.nextInt();
   int n=0;
    int sum=0;
    while(a>0)
    {
		n=a%10;
     sum=sum*10+n;
      a=a/10;
    }
    System.out.println(sum);
  }
}