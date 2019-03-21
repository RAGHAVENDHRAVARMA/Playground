import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
    String s2=sc.nextLine();
   String s3="";
    for(int i=0;i<s2.length();i++)
    {
      if(s2.charAt(i)!='a'&& s2.charAt(i)!='e'&& s2.charAt(i)!='i'&& s2.charAt(i)!='o'&& s2.charAt(i)!='u')
      {
        s3=s3+String.valueOf(s2.charAt(i));
      }
    }
    System.out.println(s3);
  }
}