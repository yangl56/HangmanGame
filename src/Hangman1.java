import java.util.Scanner;

public class Hangman1 {
	public static void main(String[] args) 
	{
		boolean bContinue = true;
		Scanner scan = new Scanner(System.in);

		int count = 0;
		do
		{   HangmanGame hg = new HangmanGame();
			count++;
			bContinue = hg,Play();
			System.out.println("You have played " + count + " times.");
			
		}while(bContinue);
		
		System.out.println("Thanks for playing.");
	}
}
