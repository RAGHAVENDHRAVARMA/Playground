import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int count=0;
    for(int i=1;i<=a;i++)
    {
      count++;
      System.out.print(i);
      if(count%3==0)
      {
        System.out.print(",");
      }
    }
    
  }
}