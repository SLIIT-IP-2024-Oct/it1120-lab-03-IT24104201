import java.util.Scanner;   // import statement

 public class IT24104201Lab3Q4 {     //class definition
  public static void main(String[] args) {    //main method

  Scanner input=new Scanner(System.in);
 
  System.out.print("Enter a five-digit number:");  //input a five-digit number
  int number=input.nextInt();

  int number1=number/10000;   //calculate the integer quotient
  number=number%10000;        //calculate the remainder

  int number2=number/1000;
  number=number%1000;

  int number3=number/100;
  number=number%100;

  int number4=number/10;
  number=number%10;

  int number5=number/1;
  number=number%1;

  //Output the digits separately
  System.out.print(number1 +" "+number2+" "+number3+" "+number4+" "+number5+" ");
  }
}

 

  
