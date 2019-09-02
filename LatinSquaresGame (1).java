
//this is the Latin Squares Class                                                                  
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class LatinSquaresGame {
    Scanner key = new Scanner(System.in);                                                               
    int n;
    int k;
    char[] charsUsed;
    boolean[][] boolGrid;
    String[] valueString; 
    int pad;
    char[][] charsGrid;
    /**
       
       The following constructor connects the txt files to the methods I use to run the game
       @param: path to the config file   
    */
    LatinSquaresGame(String config) {
	try{
	    File configFile= new File(config);
	    Scanner input = new Scanner(configFile);
	    
	    n=input.nextInt();
	    charsUsed= new char[n];
	    charsGrid=new char[n][n];
	    pad = (""+n).length() + 1;
	    
	    /**make an array of boolean values that'll replicate charsGrid*/
	    boolGrid = new boolean[n][n];
	    for (int h=0; h < boolGrid.length; h++) {
		for (int v=0; v < boolGrid.length; v++) {
		    boolGrid[h][v]=false;
		}
	    }
	    
	    /**these 2 loops fill in the whole grid with white spaces*/
	    for (int h=0; h < charsGrid.length; h++) {
		for (int v=0; v < charsGrid.length; v++) {
		    charsGrid[h][v]=' ';
		}
			}
	    for(int i=0; i < n; i++) {
		charsUsed[i]=input.next().charAt(0);
	    }
	    
	    k=input.nextInt();
	    
	    for(int j=0; j < k; j++) {
			       

		String hazim=input.next() + " " + input.next() + " " +
		    input.next().charAt(0);
		
		String randomArrays[]=new String[3];
		
		randomArrays =hazim.split(" ");
		
		int row = Integer.parseInt(randomArrays[0]);
		int col = Integer.parseInt(randomArrays[1]);
		
		
		char letter = ( randomArrays[randomArrays.length-1].charAt(0) );	
		charsGrid[col][row]= letter; 
		boolGrid[col][row] = true;
	    }
	}
	/**
	   The following will catch a file not find exception
	*/
	catch (FileNotFoundException e) {
	    
	    System.err.println(e);
	    
	    e.printStackTrace();
	}                                                                           
    }
    /** 
	the following prints the welcome 
     */
    public static void printWelcome() {
	
	//this should print welcome                                                     
       	System.out.println("  _           _   _        _____\n" + 
			   " | |         | | (_)      / ____|\n" + 
			     " | |     __ _| |_ _ _ __ | (___   __ _ _   _  __ _ _ __ ___  ___\n" + 
		       " | |    / _` | __| | '_ \\ \\___ \\ / _` | | | |/ _` | '__/ _ \\/ __|\n" + 
		       " | |___| (_| | |_| | | | |____) | (_| | |_| | (_| | | |  __/\\__ \\\n" + 
		      " |______\\__,_|\\__|_|_| |_|_____/ \\__, |\\__,_|\\__,_|_|  \\___||___/\n" + 
			   "                          CSCI 1302 | | v2019.sp\n" + 
			   "                                    |_| ");
	

    }
    /**
     * the following method displays the opening n and k values 
     * in the correct format
     */
    public void displayN() {
	System.out.print("n = " + n + " " + "{");
	//make for loop

	for (int i=0; i < charsUsed.length; i ++) {
	    
	    System.out.print(charsUsed[i]);
	    if (charsUsed[i]!=charsUsed[charsUsed.length-1]) {
		System.out.print(",");
	    }
	    
	    
	}
	System.out.print("}" + "\n");
	
	System.out.println("k = " + k);
	System.out.print("\n");
    }
    
    /**
     * The following method displays the square in its correct
     * format and displays what is inside the grid of chars with
     * the right lines, and spaces.
     */
    public void displaySquare() {
	
	System.out.print("    ");
	for (int i =0; i<n;i++ ) {
	    System.out.print(i + "   ");
	    
	}
	//
		//display CharsGrid 
	int temp=0;
	for (int r =0; r < charsGrid.length; r++) {
	    System.out.print("\n");
	    
	    System.out.print(temp);
	    for(int y = 0; y < pad - (""+temp).length(); y++) {
		System.out.print(" ");
	    }
	    temp++;
	    System.out.print("|");
	    
	    for (int c=0; c < charsGrid.length; c++) {
		
		if (boolGrid[c][r]==true) {
		    System.out.print("[" + charsGrid[c][r] + "]");
		}
		else {
		    System.out.print(" " + charsGrid[c][r] + " ");
		}
		//once per cell
		System.out.print("|");
	    }
			//once per row
	}
    }
    /**
       The promptUser method evaluates user input 
    */
    public void promptUser() {
	//Scanner key = new Scanner(System.in);
	
	System.out.print("\n" + "Latin-squares: " + "\n");
	String userInput = key.nextLine();
	System.out.println("user ; " + userInput);              
	if (userInput.equals("q")) {
	    System.exit(0);
	}
	else {
	    //row,c,char
	    
	    String randomArrays[] =userInput.split(" ");
	    //in theory, the line below will catch cray input
	    if (randomArrays.length > 3) {
		System.out.println("error: invalid input");
	    }
	    
	    /** 
	     * try illegalargumentexception here
	     * 
	     */
	    
	    try {
		int row = Integer.parseInt(randomArrays[0]);
		int col = Integer.parseInt(randomArrays[1]);
		//} //end of try 
		//catch 
		char letter = (randomArrays[randomArrays.length-1].charAt(0));	
		int count=0;
		
		for (int i=0; i < charsUsed.length; i++) {
		    if (charsUsed[i]!=letter) {	
			count++;
		    }
		}
		
		if (count >(n-1)) {
		    System.out.println("error: invalid input");	
		}
		else {
		    if (boolGrid[col][row]==false) {
			charsGrid[col][row]=letter;
		    }
		}
	    }
	    catch(IllegalArgumentException exception) {
		System.out.println("error: invalid input");	
	    }
	}
	
    }//end of else 
    
    /**
       The following prints the win message
    */
    public static void printWin() {
	
	System.out.println("       .''.             *''*    :_\\/_:     .\n" + 
			   "      :_\\/_:   .    .:.*_\\/_*   : /\\ :  .'.:.'.\n" + 
			   "  .''.: /\\ : _\\(/_  ':'* /\\ *  : '..'.  -=:o:=-\n" + 
			   " :_\\/_:'.:::. /)\\*''*  .|.* '.\\'/.'_\\(/_'.':'.'\n" + 
			   " : /\\ : :::::  '*_\\/_* | |  -= o =- /)\\    '  *\n" + 
				"  '..'  ':::'   * /\\ * |'|  .'/.\\'.  '._____\n" + 
			   "      *        __*..* |  |     :      |.   |' .---\"|\n" + 
				"       _*   .-'   '-. |  |     .--'|  ||   | _|    |\n" + 
			   "    .-'|  _.|  |    ||   '-__  |   |  |    ||      |\n" + 
			   "    |' | |.    |    ||       | |   |  |    ||      |\n" + 
			   " ___|  '-'     '    \"\"       '-'   '-.'    '`      |____\n" + 
			   "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" + 
			   "    CONGRATULATIONS! YOU COMPLETED THE LATIN SQUARE!");
	
	
	//this should print win                                     
	
	}
    /** 
     * The play method is what i am using to cal all of my methods
     * so that in the driver, I can just call the play method
     *  in order to sue them all
     * 
     */
    public void play() {

	printWelcome(); 
	displayN();

	
	//add a while loop to manage game 
	boolean isLQ=false;
		while(!isLQ) {
		    displaySquare();
		    promptUser();
		    
		    if (ifFull()) {
			isLatinSquare();
			if (isLatinSquare()) {
			    printWin();
			    System.exit(0);
			}
		    }

		    
		}
    }
    /**
     * the purpose of the ifFull method is to go through the grid
     * and see if all of the spaces are full BEFORE checking whether or not
     * the grid is a latin square
     * @return
     */
    public boolean ifFull() {
	
	
	for (int r =0; r < charsGrid.length; r++) {
	    
	    for (int c=0; c < charsGrid.length; c++) {
		if (charsGrid[r][c]==' ') {
		    return false;
		}
	    }
	    //once per row
	}
	return true;
    }
    
    /**
       
     * * This method checks to see if this is a latin square.
     * my thought process: I can use the sort method and go row to row, 
     * The sort method will put the elements in alphabetical order.
     * Which means that if theres a repeater, they'll be next to each other.
     * Hence, I can check the value at i , and the position next to it . 
     * if there the same, I know a latin square does not exist, else, there is. 
     * I also have to repeat for columns.... still under construction. 
     
     
     */
    public  boolean isLatinSquare() {
	for (int i=0; i < charsGrid.length; i++) {
	    char [] copy=charsGrid[i];
	    Arrays.sort(copy);
	    for (int j=0; j < copy.length; j++) {	 
		
		if (copy[j]!= copy[copy.length-1]) {
		    if (copy[j]==copy[j+1])
			{
			    return false;	
			}
		}
	    }
	    
	}
	/*
	 * so I think the below goes through the column, sorts it, and then checks 
	 * whether or not the value nexts to it repeats or not 
	 */
	
	for (int r=0; r < charsGrid.length; r++) {
	    for (int c=0; c < charsGrid.length; c++) {
		char [] copy=charsGrid[c];
		Arrays.sort(copy);
		for (int x=0; x < copy.length; x++) {
		    if (copy[x]!= copy[copy.length-1]) {
			if (copy[x]==copy[x+1])
			    {
				//
				return false;	
			    }
		    }
		}
		
	    }
	    
	}
	return true;
    }

    public static void main(String[] args) {
	
    }
    
}//this closes the class file :)         
