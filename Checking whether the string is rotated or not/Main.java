import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      String s3=s1.concat(s1);
      int len=s2.length();
     int c= s3.length()-len;
      String s12="";
      for(int i=0;i<c;i++)
      {
        if((s3.substring(i,i+len)).equals(s2))
        {
          s12="Yes";
          break;
        }
        else
        {
          s12="No";
        }
      }
       System.out.print(s12); 
    }
}