import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int result=greater(n1,n2);
      System.out.println(greater(result,n3));
    }
      public static int greater(int num1,int num2)
      {
        int max=0;
        if(num1>num2)
        {
          max=num1;
        }
        else
        {
          max=num2;
        }
        return max;
      }
	
}