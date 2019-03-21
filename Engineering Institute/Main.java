//import required packages
import java.util.*;
class Faculty
{
  public void salary(int salary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+salary);
  }
}
class CSE extends Faculty
{
  public void salary(int salary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(salary+3000));
  }
}
class IT extends Faculty
{
  public void salary(int salary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(salary+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int salary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(salary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int salary=sc.nextInt();
    if(salary<=0)
    {
      System.out.println("null");
    }
    else
    {
      Faculty F=new Faculty();
      F.salary(salary);
      CSE C=new CSE ();
      C.salary(salary);
      IT I=new IT();
      I.salary(salary);
      ECE obj = new ECE();
      obj.salary(salary);
    //implement your required concept here
  }
}
}