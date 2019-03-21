import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      switch(i)
      {
        case 1:
      		int s=sc.nextInt();
      		System.out.println(s*s);
     			 break;
      case 2:
      		int s1=sc.nextInt();
      		int s2=sc.nextInt();
      		System.out.println(s1*s2);
      			break;
       case 3:
      		int s11=sc.nextInt();
      		int s21=sc.nextInt();
          	int c=s11*s21;
          	c=c/2;
      		System.out.println(c);
      			break;
        case 4:
          		double a=sc.nextDouble();
          		double b=3.14*a*a;
          System.out.println(b);
          break;
      }
    }
}
