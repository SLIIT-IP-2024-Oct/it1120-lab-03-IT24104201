// import statement
import java.util.Scanner;

 //class definition 
 public class IT24104201Lab3Q1B {
  public static void main(String[] args) {

  //create a Scanner object
  Scanner input=new Scanner(System.in);

  //input the price of 1kg rice
  System.out.print("Enter the price of 1kg rice:");
  double priceOf1kg=input.nextDouble();

  //input the number of kilograms you want to buy
  System.out.print("Enter the number of kilograms you want to buy:");
  double noOfKg=input.nextDouble();
   
  //calculate the total amount
  double totalAmount=priceOf1kg*noOfKg;
 

  //calculate the discount
  double discount=totalAmount*0.10;
 
  //calculate the amount with discount
  double amountWithDis=totalAmount-discount;
  System.out.println();

  //output the total amount with discount
  System.out.print("The total amount with 10% discount is: "+ amountWithDis);
  }
}
