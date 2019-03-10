import java.util.Scanner;

public class WordSearch2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		WordBoard dog = WordSearch2.findWords(10, 10, WordSearch2.promptForUserInput(s));
		System.out.println(dog);
		for (String word : dog.getDiscoveredWords())
			System.out.println(word);
		dog.checkAnswers();
	}

	public static long promptForUserInput(Scanner input) {
		System.out.println("Enter the seed number for a 10 X 10 board:");
		return input.nextLong();
	}

	public static WordBoard findWords(int rows, int cols, long seed) {
		WordBoard board = new WordBoard(rows, cols, seed);
		rows = board.getHeight();
		cols = board.getWidth();
		char[][] letters = board.getBoard();
		for (int r = -1; r <= 1; r++) // these two for loops control the direction in which the code checks
			for (int c = -1; c <= 1; c++) // r=1 and c=0 is across, r=1 and c=-1 is diagonal, r=0 and c=-1 is down,
				for (String word : board.getDictionary()) // checks for every word
					for (int i = 0; i < rows; i++) // i and rows are associated (rows go across)
						for (int j = 0; j < cols; j++) // j and cols are associated (cols go down)
							if ((rows - i >= word.length() || r != 1) && (cols - j >= word.length() || c != 1)
									&& (i + 1 >= word.length() || r != -1) && (j + 1 >= word.length() || c != -1))
								for (int a = 0; a < word.length()
										&& word.charAt(a) == letters[i + a * r][j + a * c]; a++)
									if (a == word.length() - 1) // if the for loop runs for the length of the word, we
										board.highlightWord(i, j, i + (a * r), j + (a * c));
		return board; // returns the board after we do all this shit to it
		
	}
}
