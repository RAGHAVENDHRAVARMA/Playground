import java.util.*;
//import java.util.Strings;
class Main{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      StringBuilder s2=new StringBuilder(s1);
      s2.reverse();
      String s3=String.valueOf(s2);
      if(s1.equals(s3))
      {
        System.out.println("Yes");
      }
      else
      {
      System.out.println("No");
      }
    } 
    }
