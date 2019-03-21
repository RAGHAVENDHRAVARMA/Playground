
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int count[]=new int[10];
	    for(int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<10;i++)
	    {
	        count[i]=0;
	    }
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]>=0 && a[i]<=9)
	        {
	            int b=a[i]-0;
	            //System.out.print("b"+b);
	            count[b]++;
	        }
	    }
      int flag=0;
	    for(int i=0;i<count.length-1;i++)
	    {
	        if(count[i]!=0&&count[i]==count[i+1])
	        {
	          flag=1;
	        }
	        
	    }
      if(flag==1)
      {
        System.out.print(a[0]);
      }
      else
      {
	    int max=count[0];
	    int index=0;
	    for(int i=1;i<count.length;i++)
	    {
	        if(max<count[i])
	        {
	            max=count[i];
	            index=i;
	        }
	    }
	    System.out.print(max);
	}
    }
}
