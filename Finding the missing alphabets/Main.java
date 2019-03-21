import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s11=sc.nextLine();
		StringBuilder s1=new StringBuilder(s11);
		int f[]=new int[26];
		for(int i=0;i<f.length;i++)
		{
		    f[i]=0;
		}
		for(int i=0;i<s1.length();i++)
		{
		    if(s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
		    {
		        int off=s1.charAt(i)-'A';
		        f[off]++;
		    }
		   if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
		    {
		        int off=s1.charAt(i)-'a';
		     //  System.out.println(off);
		            f[off]++;
		    }
		}
		
		for(int i=0;i<26;i++)
		{
		    if(f[i]==0)
		    {
		     char ch= (char)(i+'a');
		     System.out.print(ch+" ");
		    }
		}
	}
}
