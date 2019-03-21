import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      String s11=sc.nextLine();
      StringBuilder s1=new StringBuilder(s11);
     int f[]=new int[80];
      for(int i=0;i<80;i++)
      {
        f[i]=0;
      }
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
        {
          char ch=(char)(s1.charAt(i)+32);
          s1.setCharAt(i,ch);
        }
        if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
        {
          int off=s1.charAt(i)-'a';
          f[off]++;
        }
      }
      for(int i=0;i<s1.length();i++)
      {
        if(f[s1.charAt(i)-'a']!=0)
        {
          System.out.print(s1.charAt(i)+""+f[s1.charAt(i)-'a']+" ");
          f[s1.charAt(i)-'a']=0;
        }
        
      }
    }
}