import java.util.Scanner;

public class BankMachineV3 {
	
	public static Scanner in  = new Scanner(System.in);
	
	public static boolean exit1=false,exit2=false;
	
	public static float balance = (float )(Math.random() * 30000 + 1);
	
	public static void welcomeMenu() {
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                   |");
		System.out.println("|     Welcome to the BankMachine    |");
		System.out.println("|                                   |");
		System.out.println("|      Please proceed to create     |");
		System.out.println("|           your account            |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __|\n\n");
		
	}
	
	public static void createID() {
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|     Please create your ID number     |");
		System.out.println("|  with 6 numbers and no leading zero  |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	public static void createPass() {
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|     Please create your password      |");
		System.out.println("|            with numbers              |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	public static void checkID(int x) {
		boolean exit=false;
		while(!exit) {
			if((x>=100000)&&(x<=999999)) {
				exit=true;
				exit1=true;
			}else {
				System.out.println("Invalid ID number.\n\nPlease try again");
				x=in.nextInt();
			}
				
			
		}
		
	}
	
	public static void iDMenu() {
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|     Please enter your ID number      |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	public static void passMenu() {
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|      Please enter your password      |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	public static int choiceMenu () {
		int choice=0;
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __ __ ");
		System.out.println("|                                         |");
		System.out.println("|  Please press 1 to check your balance   |");
		System.out.println("|         press 2 to deposit money        |");
		System.out.println("|         press 3 to withdraw nomey       |");
		System.out.println("|         press 4 to exit the program     |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __ __|");
		choice=in.nextInt();
		return choice;
	}
	
	public static void checkNe (float x) {
		if(x<=0)
			System.out.println("Invalid number.\n");
		else
			exit2=true;
	}
	
	public static void deMenu () {
	
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|   Please enter the amount of money   |");
		System.out.println("|       that you want to deposit       |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	public static void withMenu () {
		
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|   Please enter the amount of money   |");
		System.out.println("|       that you want to withdraw      |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	
	
	public static void exitMenu () {
		System.out.println(" __ __ __ __ __ __ __ __ __ __ __ __ __");
		System.out.println("|                                      |");
		System.out.println("|   Thank you for using our program    |");
		System.out.println("|                                      |");
		System.out.println("|           Have a nice day            |");
		System.out.println("|__ __ __ __ __ __ __ __ __ __ __ __ __|");
		
	}
	
	public static void main(String[] args) {
		int iD=0,accID,pass,accPass;
		float deposit=0,withdraw=0;
		boolean exit=false;
		welcomeMenu();
		while(!exit1) {
			createID();
			iD=in.nextInt();
			checkID(iD);
		}
		createPass();
		pass=in.nextInt();
		while(!exit) {
			iDMenu();
			accID=in.nextInt();
			
			passMenu();
			accPass=in.nextInt();
			
			if((accID==iD)&&(accPass==pass)) {
				while(!exit) {
					switch(choiceMenu()) {
						case 1: 
							System.out.format("You have % .2f $ in your bank account.\n", balance+deposit-withdraw);
							break;
						case 2:
							while(!exit2) {
							deMenu();
							deposit=in.nextFloat();
							checkNe(deposit);
							}
							System.out.format("You have successfully deposited % .2f $ into your bank account.\n", deposit);
							exit2=false;
							break;
						case 3:
							while(!exit2) {
							withMenu();
							withdraw=in.nextFloat();
							checkNe(withdraw);
							}
							System.out.format("You have successfully withdrawn % .2f $ from your bank account.\n", deposit);
							exit2=false;
							break;
						case 4:
							exitMenu();
							exit=true;
							break;
						default:
							System.out.println("Invalid\n");
					
					}
					
				}
				
			}else
				System.out.println("Wrong ID number or password.\n");			
		}
		
	in.close();
	
	}
	
}
