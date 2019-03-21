/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s11=sc.nextLine();
    StringBuilder s1=new StringBuilder(s11);
    String s22=sc.nextLine();
    StringBuilder s2=new StringBuilder(s22);
    StringBuilder s3=new StringBuilder("");
    int flag=0;
    for(int i=0;i<s1.length();i++)
    {
        for(int j=0;j<s2.length();j++)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                s1.setCharAt(i,'$');
                
            }
           
        }
    }
    for(int i=0;i<s1.length();i++)
    {
        if(s1.charAt(i)!='$')
        {
            s3.append(s1.charAt(i));
        }
    }
    System.out.print(s3);
	}
}
