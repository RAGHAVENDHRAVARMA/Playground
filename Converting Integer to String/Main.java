import java.util.*;
class Main
{
  public static void main(String args[])
  {
 Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
   int b=a;
    int count=0;
    while(a!=0)
    {
      count++;
      a=a/10;
  }
    
   //System.out.println(count);
    if(b>0)
    {
       char ch[]=new char[count];
    int i1=count-1;
    for(int i=count-1;i>=0;i--)
    {
       int c1=b%10;
       ch[i1]=(char)(c1+'0');
        b=b/10;
        i1--;
     }
      System.out.println(ch);
    }
    else if(b<0)
    {
      b=-b;
    char ch[]=new char[count+1];
    int i1=count;
    for(int i=count;i>0;i--)
    {
       int c1=b%10;
       ch[i1]=(char)(c1+'0');
        b=b/10;
        i1--;
     }
     ch[0]=(char)('-');
        System.out.println(ch);
    }
  
    }
}
    
