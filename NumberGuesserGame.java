/**
 * DanielNguyen
 * StartDate: 04042018
 * EndDate: 06042018
 * Version 4.0.2
 * Copyright 2018
 */
import java.util.Scanner;
public class Guesser4 {
	/**
	 * This program generates a random number in between 0 and 500, 
	 * lets the user guess what it is 
	 * and then marks him/her based on his/her performance
	 */
	public static void main(String[] args) {
		 int secretNumber,range=500,opRound=0,guess,round,numGuess=0,score,toNumGuess=0,numRound=0;
		 boolean correct=false;
		 Scanner in = new Scanner(System.in);
		 
		 //This calculates the optimal number of guesses 
		 do {range = range/2;
		 opRound++;
		 }while(range >= 2);
		 
		 //This is the title of the game
		 System.out.format("%85s %n\n\n", "WELCOME TO THE GUESSING GAME!");
		 
		 //This get the number of round that the user wants to play
	     System.out.println("Please input the number of rounds that you want to play.");
	     round=in.nextInt();
	     
	     //This loops everything that is inside is until it reaches the amount of rounds required
	     while(round>0){
	    	 //This generates a random number from 0 to 500
	    	 secretNumber = (int) (Math.random() * 499 + 1);
	    	 System.out.println("Secret number is " + secretNumber+"\n");
	    	 //This gets the guess from the user, compares it with the random number and keeps looping until the user is right
	    	 System.out.println("Please make a guess between 0 and 500\n");
		     do{
		    	 correct=false;
		    	 guess=in.nextInt();
		    	 if(guess!=secretNumber){
		    		 if(guess>secretNumber){
		    			 System.out.println("Please guess lower.");
		    			 numGuess++;
		    			 toNumGuess++;
	  	             }
	  	             else{
	  	            	System.out.println("Please guess higher.");
	  	             	numGuess++;
	  	             	toNumGuess++;
	  	             }
	 	         }
	 	         else{
	 	        	correct=true;
	 	         	System.out.println("You Won.\n");
	 	         	numGuess++;
	 	         	toNumGuess++;
	 	         	
	 	         	//This calculates and outputs the score of every round
	 	         	score=((opRound-numGuess)*1000)+13000;
	 	         	System.out.format("Your score is %d points.\n\n", score);
	 	         	numGuess=0;
	             	
	 	         }
		      }while(!correct);
		      round--;
		      numRound++;
	     }
	     
	     //This calculates the average score of the user.
	     if(numRound==1) {
	  	   System.out.format("Your average score for 1 round is %d points.\n\n",(opRound-toNumGuess)*1000+13000);
	  	   if(((opRound-toNumGuess)*1000+13000)==13000)
	  		   System.out.println("You did an excellent job and got the perfect score!\nCongratulation!\n\n");
	  	   else if((((opRound-toNumGuess)*1000+13000)<=13000)&&((((opRound-toNumGuess)*1000+13000)>=0)))
	  		   System.out.println("You did a great job and almost got the perfect score.\nBetter luck next time!\n\n");
	  	   else if((((opRound-toNumGuess)*1000+13000)>=13000)&&((((opRound-toNumGuess)*1000+13000)!=20000)))
	  		   System.out.println("You are a guessing master!!!\nCongratulation for excelling the perfect score!\n\n");
	  	   else if(((opRound-toNumGuess)*1000+13000)<=0)
	  		   System.out.println("You nailed the game but you took to many guesses.\nBetter luck next time!\n\n");
	  	   else if(((opRound-toNumGuess)*1000+13000)==20000)
	  		   System.out.println("Are you sure you didn't cheat?\nBecause you are a guessing GOD!!!\nCongratulation for getting the maximum point in the game!\n\n");
	     }  
	     else if((numRound!=0)&&(numRound!=1)) {
	  	   System.out.format("Your average score for %d rounds is %d points.\n\n",numRound,((numRound*opRound)-toNumGuess)*1000+13000);
	  	 if(((opRound-toNumGuess)*1000+13000)==13000)
	  		   System.out.println("You did an excellent job and got the perfect score.\nCongratulation!\n\n");
	  	   else if((((opRound-toNumGuess)*1000+13000)<=13000)&&((((opRound-toNumGuess)*1000+13000)>=0)))
	  		   System.out.println("You did a great job and almost got the perfect score.\nBetter luck next time!\n\n");
	  	   else if((((opRound-toNumGuess)*1000+13000)>=13000)&&((((opRound-toNumGuess)*1000+13000)!=20000)))
	  		   System.out.println("You are a guessing master.\nCongratulation for excelling the perfect score!\n\n");
	  	   else if(((opRound-toNumGuess)*1000+13000)<=0)
	  		   System.out.println("You nailed the game but you took to many guesses.\nBetter luck next time!\n\n");
	  	   else if(((opRound-toNumGuess)*1000+13000)==20000)
	  		   System.out.println("Are you sure you didn't cheat?\nBecause you are a guessing GOD.\nCongratulation for getting the maximum point in the game!\n\n");
	     }  
	     else if(numRound<=0)
	  	   System.out.println("See you next time.");
	        	

	 
	     in.close();
	 }
}
