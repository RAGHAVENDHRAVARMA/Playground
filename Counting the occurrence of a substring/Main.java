import java.util.Scanner;
class Main{
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int a=s1.length();
    int b=s2.length();
    int c=a-b;
    int count=1;
    for(int i=0;i<c;i++)
    {
      if((s1.substring(i,i+b)).equals(s2))
      {
        count++;
      }
    }
    System.out.println(count);
  } 
}