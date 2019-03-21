import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      int left=0;
      int right=a.length-1;
      boolean flag=false;
      
        while(left<right)
        {
          flag=false;
       	 if(a[left]==a[right])
         {
            left++;
            right--;
          // System.out.println(left+" "+right);
            flag=true;
        }
        else if(a[left]!=a[right])
        {
          flag=false;
           break;
       }
        }
     // System.out.println(flag);
      if(flag==false)
      {
        System.out.println("No");
      }
      else
      {
        System.out.println("Yes");
      }
      
    }
}