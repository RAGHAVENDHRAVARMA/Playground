import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s11=sc.nextLine();
		StringBuffer s1=new StringBuffer(s11);
		int key=sc.nextInt();
		for(int i=0;i<s1.length();i++)
		{
		    if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
		    {
		       char ch=(char)(s1.charAt(i)-key);
		       if(ch<'A')
		       {
		          ch= (char)(ch+26);
		       }
		        s1.setCharAt(i,ch);
		    }
		    
		    if(s1.charAt(i)>='a'&& s1.charAt(i)<='z')
		    {
		       char ch=(char)(s1.charAt(i)-key);
		       if(ch<'a')
		       {
		          ch= (char)(ch+26);
		       }
		        s1.setCharAt(i,ch);
		    }
		   
		}
		System.out.println(s1);
		
	}
}
