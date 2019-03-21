import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      int parts=sc.nextInt();
      StringBuilder s11=new StringBuilder(s1);
      StringBuilder	s22=new  StringBuilder(s2);
      	s11=s22;
     String s3= String.valueOf(s11);
      String s7[]=s3.split(" ");
      for(int i=0;i<s7.length;i++)
      {
        System.out.println(s7[i]);
    }
}
}