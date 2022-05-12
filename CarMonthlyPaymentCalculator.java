import java.util.Calendar;
import java.util.Scanner;

public class Assignment2 {

 public static void main(String[] args) {

  float intCost,intRate,downPay;
  int numMonths;
  Scanner in = new Scanner(System.in);

  System.out.println("Please input the price of the car.");
  intCost= in.nextFloat();
 	System.out.format("The price of the car is $%, .2f%n%n", intCost);
 	System.out.println("Please input the interest rate.");
 	intRate= in.nextFloat();
 	System.out.format("The interest rate is %.2f%%\n\n", intRate);
 	System.out.println("Please input the down payment.");
 	downPay= in.nextFloat();
 	System.out.format("The down payment is $%, .2f%n%n", downPay);
 	System.out.println("Please input the term in months.");
 	numMonths= in.nextInt();
 	System.out.println("The term is "+numMonths+" months.\n\n");

 	Calendar c = Calendar.getInstance();
 	System.out.format("%tB %te, %tY%n\n", c, c, c);
 	System.out.format("The initial cost of the car is $%, .2f%n%n", intCost);
 	System.out.format("The down payment is $%, .2f%n%n", downPay);
 	System.out.format("The principle is $%, .2f%n%n",  intCost-downPay);
 	System.out.println("The term is "+numMonths+" months.\n");
 	System.out.format("The interest rate is %.2f%%\n\n", intRate);
 	System.out.format("The monthly payments are $%, .2f%n%n", ((numMonths*intRate/(100*numMonths)+1)*prin)/numMonths);
 
 	
 	
 	
 	
 	

 	
   	in.close();


  
 }
}


