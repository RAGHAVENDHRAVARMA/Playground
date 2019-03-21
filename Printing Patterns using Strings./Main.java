import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s11=sc.nextLine();
	StringBuilder s1=new StringBuilder(s11);

	int a=s1.length();

    int b=a/2;
    String s2="";
    s2=s11.substring(0,b);
    String s3="";
     s3= s1.substring(b);
      String s4;
      s4=s3.concat(s2);
     // System.out.print(s4);
      for(int i=0;i<s4.length();i++)
      {
          for(int j=0;j<(s4.length()-1)-i;j++)
          {
              System.out.print(" ");
          }
          for(int k=0;k<=i;k++)
          {
              System.out.print(s4.charAt(k));
          }
          System.out.println("");
      }
          
	}
}
