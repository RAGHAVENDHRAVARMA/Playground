import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
     Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String replace=sc.nextLine();
      String included=sc.nextLine();
      int a=s1.indexOf(replace);
      int c=a+replace.length();
     // System.out.println(c);
      StringBuffer sc1=new StringBuffer(s1);
      sc1.replace(a,c,included);
      System.out.println(sc1);
    }
}