import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s11=sc.nextLine();
	  StringBuilder s1=new StringBuilder(s11);
       int count=sc.nextInt();
    	String temp="";
    	StringBuilder s2=new StringBuilder(temp);
    	for(int i=0;i<s1.length();i++)
    	{
    	    if(s1.charAt(i)==' ')
    	    {
    	       i++;
    	    }
    	    if(s1.charAt(i)!=' ')
    	    {
    	     s2.append(s1.charAt(i));
    	    }
    	}
    
       int len=s2.length();
       	int row=len/count;
       //System.out.println(row);
       if((len%count)>0)
       {
           row++;
       }
      for(int c=0;c<count;c++)
      {
          for(int r=0;r<row;r++)
          {
              int col=c+(r*count);
              if(r%2==1)
              {
                  int c_col=(count-1)+(r*count);
                  col=c_col-c;
              }
              char ch=' ';
              if(col>=len)
              {
                  ch='X';
              }
              else
              {
              ch=s2.charAt(col);
              }
              System.out.print(ch);
          }
      }
      
    
	
	}
}
