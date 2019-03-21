import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
       int n3=sc.nextInt();
      int result=GCD(n1,n2);
      System.out.print(GCD(result,n3));
    }
      public static int GCD(int num1,int num2)
      {
        int min=0;
        int gc=0;
        if(num1>num2)
        {
          min=num2;
        }
        else
        {
          min=num1;
        }
        for(int i=min;i>=1;i--)
        {
          if((num1%min==0)&&(num2%min==0))
          {
            	gc=min;
            	break;
          }
        }
        return gc;
      }
	}
