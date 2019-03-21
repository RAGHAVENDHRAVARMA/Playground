import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	String s7[]=s1.split(" ");

	StringBuilder s3=new StringBuilder("");
	for(int i=0;i<s7.length;i++)
	{
	    String s22=s7[i];
	    StringBuilder s2=new StringBuilder(s22);
	    StringBuilder s4=s2.reverse();
	    s3.append(s4);
	    s3.append(" ");
	  
	}
	System.out.println(s3);
	}
}

