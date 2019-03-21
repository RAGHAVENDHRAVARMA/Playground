import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s7[]=s1.split(" ");
   	for(int i=0;i<s7.length;i++)
    {
      for(int j=i+1;j<s7.length;j++)
      {
        if(s7[i].equals(s7[j]))
        {
          s7[i]="$";
        }
      }
    }
    for(int i=0;i<s7.length;i++)
    {
      if(!(s7[i].equals("$")))
      System.out.print(s7[i]+" ");
    }
  }
}