import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s1[]=new String[n];
		for(int i=0;i<n;i++)
		{
		    s1[i]=sc.next();
		    
		}
		String max="";
		for(int i=0;i<s1.length;i++)
		{
		    for(int j=i+1;j<s1.length;j++)
		    {
              // StringBuilder s5=new StringBuilber(s1[i]);
             /* if(s1[i].charAt(0)>='A'&&s1[i].charAt(0)<='Z')
              {
                char ch=(char)(s1[i].charAt(0)+32);
                //System.out.println(ch);
                 System.out.println("hjhjh  jhj "+s1[i].replace(s1[i].charAt(0),ch));
              }*/
		        if(s1[i].charAt(0)>s1[j].charAt(0))
		        {
                  
		            max=s1[i];
		            s1[i]=s1[j];
		            s1[j]=max;
		        }
		    }
		}
		for(int i=0;i<s1.length;i++)
		{
		    if(s1[i].charAt(0)>='A'&&s1[i].charAt(0)<='Z')
              {
                char ch=(char)(s1[i].charAt(0)+32);
                //System.out.println(ch);
                 System.out.println(s1[i].replace(s1[i].charAt(0),ch));
              }
              else
              {
	           	System.out.println(s1[i]);
              }
		}
	}
}
