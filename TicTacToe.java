import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	
	public static char board[][] = new char[17][17];
	
	public static char player='X';
	
	public static int slot1,slot2,slot3,slot4,slot5,slot6,slot7,slot8,slot9,turn=0;
	
	public static Scanner in  = new Scanner(System.in);
	
	public static void welcomeMenu(){
		System.out.println("               ______________________________________________________________________________________________________________________________________________");
		System.out.println("              |                                                                                                                                              |");
		System.out.println("              |                                                                                                                                              |");
		System.out.println("              |    XXXXXXXXXXXXXX                           XXXXXXXXXXXXXX                                       XXXXXXXXXXXXXX                              |");
		System.out.println("              |          XX                                       XX                                                   XX                                    |");
		System.out.println("              |          XX        OO        XXXXXXXX             XX            OOOOOOOO           XXXXXXXX            XX           OOOOOOOO    XXXXXXXXX    |");
		System.out.println("              |          XX                 XX                    XX           OO       OO        XX                   XX          OO       OO  X            |");
		System.out.println("              |          XX        OO      XX                     XX          OO         OO      XX                    XX         OO         OO X            |");
		System.out.println("              |          XX        OO      XX                     XX          OO         OO      XX                    XX         OO         OO XXXXXXX      |");
		System.out.println("              |          XX        OO      XX                     XX          OO         OO      XX                    XX         OO         OO X            |");
		System.out.println("              |          XX        OO       XX                    XX           OO        OO       XX                   XX          OO       OO  X            |");
		System.out.println("              |          XX        OO        XXXXXXXXX            XX             OOOOOOO  OOO      XXXXXXXXX           XX            OOOOOOO    XXXXXXXXX    |");
		System.out.println("              |                                                                                                                                              |");
		System.out.println("              |                                                                                                                                              |");
		System.out.println("              |                                                                                                                                              |");
		System.out.println("              |        Press 1 to play the game                                                                                                              |");
		System.out.println("              |              2 to get instruction                                                                                                            |");
		System.out.println("              |              3 to exit the game                                                                                                              |");
		System.out.println("              |                                                                                                                                              |");
		System.out.println("              |______________________________________________________________________________________________________________________________________________|\n\n\n");
		
	}
	
	public static void exitMenu(){
		System.out.println("                                                        \n _______________________________________________________");
		System.out.println("                                                        |                                                       |");
		System.out.println("                                                        |                       Thank You                       |");
		System.out.println("                                                        |                          For                          |");
		System.out.println("                                                        |                        Playing                        |");
		System.out.println("                                                        |                                                       |");
		System.out.println("                                                        |                   See You Next Time                   |");
		System.out.println("                                                        |_______________________________________________________|");
	}

	public static void instruction(){
		System.out.println("                                                           \n\n _______________________________________________________");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |   Knowing Whats What:                                 |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |       This is an X:         This is an O:             |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |              X       X          O O O                 |");
		System.out.println("                                                           |                X   X          O       O               |");
		System.out.println("                                                           |                  X            O       O               |");
		System.out.println("                                                           |                X   X          O       O               |");
		System.out.println("                                                           |              X       X          O O O                 |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |       This is the board:                              |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |                    1   |2   |3                        |");
		System.out.println("                                                           |                    ____|____|____                     |");
		System.out.println("                                                           |                    4   |5   |6                        |");
		System.out.println("                                                           |                    ____|____|____                     |");
		System.out.println("                                                           |                    7   |8   |9                        |");
		System.out.println("                                                           |                        |    |                         |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |   Goal of the game:                                   |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |                 - Have 3 of your makers in a line     |");
		System.out.println("                                                           |                   to win                              |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |   Rules of the game:                                  |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |                 - Players take turns selecting one    |");
		System.out.println("                                                           |                   of the 9 sectors to place their     |");
		System.out.println("                                                           |                   marker                              |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |                 - once a marker is placed it cannot   |");
		System.out.println("                                                           |                   be moved or replaced                |");
		System.out.println("                                                           |                                                       |");
		System.out.println("                                                           |                 - Markers can ONLY be placed in an    |");
		System.out.println("                                                           |                   unoccupied space                    |");
		System.out.println("                                                           |_______________________________________________________|\n\n\n");
		
		System.out.println("Please enter anything to return to the main menu.");
		in.next();
	}
	
	public static void setBoard(){
	  for(int i=0; i<17; i++){
	   board[i][5] = '|';
	   board[i][11] = '|';
	  }
	  
	  for(int a=0; a<17; a++){
	   board[5][a] = '-';
	   board[11][a] = '-';
	  }
	  
	}
	
	public static void printBoard() {
		for(int k=0; k<17; k++){
			System.out.println("");
			for(int j=0; j<17; j++){
				if(j==0){
					System.out.print("               	"+board[k][j]+" ");
			    }
			    else
			    	System.out.print(board[k][j]+" ");
			}
		}
	}
	
	public static void setX(int x, int y) {
		for( int k=y, j=0 ;y<=k+4; y++,x++,j++) {
			  board[x][y]='X';
			  board[x][k+4-j]='X';
			  	  
		  }
	}
	 
	public static void setO (int x, int y) {
		 for(int i=y+1,j=1; i<=y+3; i++,j++) {
			 board[x][i]='O';
			 board[x+4][i]='O';
			 board[j+x][y]='O';
			 board[j+x][y+4]='O';
		 }
	}
	 
	public static void drawX(int x) {
		switch(x) {
	 		case 1:
	 			setX(0,0);
	 			slot1=1;
	 			break;
	 		case 2:
	 			setX(0,6);
	 			slot2=2;
	 			break;
	 		case 3:
	 			setX(0,12);
	 			slot3=3;
	 			break;
	 		case 4:
	 			setX(6,0);
	 			slot4=4;
	 			break;
	 		case 5:
	 			setX(6,6);
	 			slot5=5;
	 			break;
	 		case 6:
	 			setX(6,12);
	 			slot6=6;
	 			break;
	 		case 7:
	 			setX(12,0);
	 			slot7=7;
	 			break;
	 		case 8:
	 			setX(12,6);
	 			slot8=8;
	 			break;
	 		case 9:
	 			setX(12,12);
	 			slot9=9;
	 			break;
		}
	}
	
	public static void drawO(int o) {
		switch(o) {
	 		case 1:
	 			setO(0,0);
	 			slot1=1;
	 			break;
	 		case 2:
	 			setO(0,6);
	 			slot2=2;
	 			break;
	 		case 3:
	 			setO(0,12);
	 			slot3=3;
	 			break;
	 		case 4:
	 			setO(6,0);
	 			slot4=4;
	 			break;
	 		case 5:
	 			setO(6,6);
	 			slot5=5;
	 			break;
	 		case 6:
	 			setO(6,12);
	 			slot6=6;
	 			break;
	 		case 7:
	 			setO(12,0);
	 			slot7=7;
	 			break;
	 		case 8:
	 			setO(12,6);
	 			slot8=8;
	 			break;
	 		case 9:
	 			setO(12,12);
	 			slot9=9;
	 			break;
		}
		 
	}
	
	public static int checkValid(int move) {
		boolean occ=true;
		while(occ) {
			if((move==slot1)||(move==slot2)||(move==slot3)||(move==slot4)||(move==slot5)||(move==slot6)||(move==slot7)||(move==slot8)||(move==slot9)||(move<1)||(move>9)) {
				System.out.println("Invalid move\nPlease try again");
				move=in.nextInt();
			}
			else
				occ=false;
		}
		return move;
	}
	
	public static boolean xWin(){
		if((board[0][0]=='X')&&(board[6][0]=='X')&&(board[12][0]=='X')){
			return true;
		}else if((board[0][6]=='X')&&(board[6][6]=='X')&&(board[12][6]=='X')){
			return true;
		}else if((board[0][12]=='X')&&(board[6][12]=='X')&&(board[12][12]=='X')){
			return true;
		}else if((board[0][0]=='X')&&(board[0][6]=='X')&&(board[0][12]=='X')){
			return true;
		}else if((board[6][0]=='X')&&(board[6][6]=='X')&&(board[6][12]=='X')){
			return true;
		}else if((board[12][0]=='X')&&(board[12][6]=='X')&&(board[12][12]=='X')){
			return true;
		}else if((board[0][0]=='X')&&(board[6][6]=='X')&&(board[12][12]=='X')){
			return true;
		}else if((board[0][12]=='X')&&(board[6][6]=='X')&&(board[12][0]=='X')){
			return true;
		}else		
			return false;
	}

	public static boolean oWin(){
		if((board[0][2]=='O')&&(board[0][8]=='O')&&(board[0][14]=='O')){
			return true;
		}else if((board[6][2]=='O')&&(board[6][8]=='O')&&(board[6][14]=='O')){
			return true;
		}else if((board[12][2]=='O')&&(board[12][8]=='O')&&(board[12][14]=='O')){
			return true;
		}else if((board[0][2]=='O')&&(board[6][2]=='O')&&(board[12][2]=='O')){
			return true;
		}else if((board[0][8]=='O')&&(board[6][8]=='O')&&(board[12][8]=='O')){
			return true;
		}else if((board[0][14]=='O')&&(board[6][14]=='O')&&(board[12][14]=='O')){
			return true;
		}else if((board[0][2]=='O')&&(board[6][8]=='O')&&(board[12][14]=='O')){
			return true;
		}else if((board[0][14]=='O')&&(board[6][8]=='O')&&(board[12][2]=='O')){
			return true;
		}else		
			return false;
	}
	
	public static boolean checkWin(){
		if((xWin())||(oWin())){
			return true;
		}else
			return false;
	}
	
	public static void reset() {
		for(int i=0; i<17; i++){
			for(int j=0; j<17; j++){
				if((board[i][j]=='X')||(board[i][j]=='O')){
					board[i][j]=' ';
			    }
			 }
		}
			  turn=slot1=slot2=slot3=slot4=slot5=slot6=slot7=slot8=slot9=0;
	}
	
	public static void result(){
		if(player=='X'){
			player='O';
		}
		else
			player='X';
		
		if((turn==9)&&(!checkWin())){
			System.out.println("\n\nGame over\nThis game is a tie!");
		}
		else
			System.out.println("\n\nGame over\nPlayer "+player+" won!");
		
		System.out.println("\nPlease enter anything to return to the main menu.");
		reset();
		in.next();
	}
	
	public static void draw(char i, int j) {
		if(i=='X') {
			drawX(j);
		}else
			drawO(j);
	}
	
	public static void getXO() {
		int move;
		System.out.println("\n\nPlayer "+player+"\nPlease make a move");
		move=in.nextInt();
		draw(player,checkValid(move));
		printBoard();
	}
	
	public static void play() {
		while((turn<9)&&(!checkWin())){
			try{
				if(player=='X') {					
					getXO();
					turn++;
					player='O';
				}
				else {
					getXO();
					turn++;
					player='X';
				}
			}catch(InputMismatchException e){
				System.out.println("Invalid move.");
				in.next();
			}
		}
		
		result();		
	}
	
	public static void main(String[] args) {
		int choice;
		boolean exit=false;
		
		while(!exit){
			try{
				welcomeMenu();
				choice=in.nextInt();
				switch(choice){
					case 1: 
						setBoard();
						printBoard();
						play();
						break;
					case 2: 
						instruction();
						break;
					case 3:
						exitMenu();
						exit=true;
						break;
					default:
						System.out.println("Invalid.\nPlease try again");
				}
				
			}catch(InputMismatchException e){
				System.out.println("Invalid\nPlease try again.\n\n");
				in.next();
			}
		}

	}
}
