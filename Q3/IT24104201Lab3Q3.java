import java.util.Scanner;   // import statement

 public class IT24104201Lab3Q3 {     //class definition
  public static void main(String[] args) {    //main method

  //define variables
  int count5000=0; 
  int count1000=0;
  int count500=0;
  int count200=0;
  int count100=0;
  int count50=0;
  int count20=0;
  int count10=0;
  int count5=0;
  int count2=0;
  int count1=0;

  Scanner input=new Scanner(System.in);
 
  System.out.print("Enter the Rupee amount:");  //input amount
  int rupeeamount=input.nextInt();

  count5000=rupeeamount/5000;   //calculate the integer quotient
  rupeeamount=rupeeamount%5000;  //calculate the remainder

  count1000=rupeeamount/1000;
  rupeeamount=rupeeamount%1000;

  count500=rupeeamount/500;
  rupeeamount=rupeeamount%500;

  count200=rupeeamount/200;
  rupeeamount=rupeeamount%200;

  count100=rupeeamount/100;
  rupeeamount=rupeeamount%100;

  count50=rupeeamount/50;
  rupeeamount=rupeeamount%50;

  count20=rupeeamount/20;
  rupeeamount=rupeeamount%20;

  count10=rupeeamount/10;
  rupeeamount=rupeeamount%10;

  count5=rupeeamount/5;
  rupeeamount=rupeeamount%5;

  count2=rupeeamount/2;
  rupeeamount=rupeeamount%2;
  
  count1=rupeeamount/1;
  rupeeamount=rupeeamount%1;

  //Output the required notes and coins
  System.out.println("5000 Notes:"+ count5000);
  System.out.println("1000 Notes:"+ count1000);
  System.out.println("500 Notes:"+ count500);
  System.out.println("200 Notes:"+ count200);
  System.out.println("100 Notes:"+ count100);
  System.out.println("50 Notes:"+ count50);
  System.out.println("20 Notes:"+ count20);
  System.out.println("10 Notes:"+ count10);
  System.out.println("05 Notes:"+ count5);
  System.out.println("02 Notes:"+ count2);
  System.out.println("01 Notes:"+ count1);
    }
}



  