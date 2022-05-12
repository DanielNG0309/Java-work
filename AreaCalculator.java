import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator2 {
 /**
  * This creates a menu for the user
  */
 public static void menu(){
  System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __  ");
  System.out.println("|                                                          	|");
  System.out.println("|            	Welcome to the Area CALCULATOR            	|");
  System.out.println("|                                                          	|");
  System.out.println("|   Please press 1 to calculate the area of a Rectangle    	|");
  System.out.println("|      	press 2 to calculate the area of a Circle       	|");
  System.out.println("|      	press 3 to calculate the area of a Triangle     	|");
  System.out.println("|      	press 4 to exit the program                     	|");
  System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __ __|\n\n");
 }
 /**
  * This program calculates the area of a Rectangle or Circle or Triangle
  */
 public static void main(String[] args) {
  
  int input;
  float wRec, lRec, rCir, hTri, bTri;
  boolean exit=false;
  double pi = Math.PI;
  Scanner in = new Scanner(System.in);
  
  //This loops everything inside it until the user chooses to exit.
  while(!exit){
   
   //This catches the error when the user have the wrong kind of input and tells them to do it again
   try{	
     //This is the menu
     menu(); 
     input=in.nextInt();
    
     //This checks the input of the user and calculates the area based on his/her decision or exit the loop
     switch (input){
   	case 1:
        	//This gets inputs from the user
        	System.out.println("Please input the width of the Rectangle.");
        	wRec=in.nextFloat();  
           	System.out.println("Please input the length of the Rectangle.");
           	lRec=in.nextFloat();
           	
           	//This calculates the area of the rectangle
           	System.out.format("The area of a Rectangle with length %.2f m and width %.2f m is %.2f m\u00b2.\n\n\n", lRec, wRec, lRec*wRec);
           	break;
   	case 2:
        	//This gets inputs from the user
        	System.out.println("Please input the radius of the Circle.");
        	rCir=in.nextFloat();
        	
        	//This calculates the area of the circle
        	System.out.format("The area of Circle with a radius of %.2f m is %.2f m\u00b2.\n\n\n", rCir, rCir*rCir*pi);
        	break;
   	case 3:
        	//This gets inputs from the user
        	System.out.println("Please input the height of the Triangle.");
        	hTri=in.nextFloat();
        	System.out.println("Please input the base of the Triangle.");
        	bTri=in.nextFloat();
        	
        	//This calculates the area of the triangle
        	System.out.format("The area of Triangle with a height of %.2f m and a base of %.2f m is %.2f m\u00b2.\n\n\n", hTri, bTri, hTri*bTri/2);
        	break;
   	case 4:
        	//This closes the loop and terminate the program
        	System.out.println("\nSee you next time.");
        	exit=true;
           	break; 
   	default:
        	//This tells the user to try again when they have the wrong number
        	System.out.println("Invalid\nPlease try again.\n\n");   	
     } 
   }catch(InputMismatchException e){
    System.out.println("Invalid\nPlease try again.\n\n");
    in.next();
   }
   
  } 
   
  in.close();
 }
}
