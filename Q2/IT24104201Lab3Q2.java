// import statement
import java.util.Scanner;

 //class definition 
 public class IT24104201Lab3Q2 {
  public static void main(String[] args) {

  //create a Scanner object
  Scanner input=new Scanner(System.in);

  //input the monthly salary
  System.out.print("Enter the monthly salary:");
  double mSalary=input.nextDouble();

  //input the the number of OT hours
  System.out.print("Enter the number of OT hours:");
  double OtHours=input.nextDouble();

  //input the the of OT hourly rate
  System.out.print("Enter the OT hourly rate:");
  double otHourlyRate=input.nextDouble();

  //calculate the OT amount
  double otAmount = OtHours * otHourlyRate;
  
  //calculate the total salary
  double totalSalary = mSalary + otAmount; 
 
  //output the total salary including OT
  System.out.print("The total salary including OT is:"+totalSalary);
  }
}
