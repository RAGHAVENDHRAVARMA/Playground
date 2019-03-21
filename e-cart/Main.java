//import required packages here
import java.util.*;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product)
  {
    this.product=product;
  }
  public String getProduct()
  {
    return product;
  }
  public void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
  public int getQuantity()
  {
    return quantity;
  }
}


class Bill
{
  //implement your logic to calculate total price
  public int result(int p,int q)
  {
    int result=p*q;
    return result;
  }
  
}
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String product=sc.nextLine();
    int price=sc.nextInt();
    
    int quantity=sc.nextInt();
    Item i = new Item();
    i.setPrice(price);
   Customer c = new Customer();
    c.setProduct(product);
     c.setQuantity(quantity);
    int p=c.getQuantity();
    int q=i.getPrice();
    Bill obj = new Bill();
    int r=obj.result(p,q);
    System.out.println("Total Price is : "+r);
 
    
    
  }
}