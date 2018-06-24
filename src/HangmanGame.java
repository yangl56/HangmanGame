import java.util.Scanner;

public class HangmanGame {
	
	Scanner scan = new Scanner(System.in);


/**
 * 
 * @author Laura Yang
 * @date Oct 8 2015
 * 
 */

	private String[] dictionary = {"laura", "cameron", "jodi", "selina", "felicity", "mary", "ivee", "cindy"};
	private char[] word;
	private char[] guess;
	
	public HangmanGame()
	{
		int num = (int) (Math.random()*dictionary.length);
		word = new char[dictionary[num].length()];
		guess = new char[dictionary[num].length()];
		
		for (int i = 0; i < word.length; i++)
		{
			word[i] = dictionary[num].charAt(i);
			guess[i] = '-';
		}
	}
	


	public boolean GameOver()
	{
		boolean rtn = true;
		for (int i = 0; i < word.length; i++)
		{
			if (guess[i]=='-')
			{
				rtn = false;
			}
		
		}
		return rtn;
	}

	public boolean play()
	{	
		do {
			System.out.println(toString());
			System.out.println("\nPlease enter a letter");
			char input = scan.next().charAt(0);
			input = Character.toLowerCase(input);		
		
			for (int i = 0; i < guess.length; i++)
			{
				if (word[i]==input)
				{
					guess[i] = input;
				}
				System.out.print(guess[i] + " ");	
			}
		
		}while (!GameOver());	
		
		System.out.println("\nCongrats! Would you like to play agian? (Y or N)");
			
		char play = scan.next().charAt(0);
		play = Character.toLowerCase(play);	
			
		
		return play == 'y';

	}
	
	public String toString()
	{
		
		String myString = "";
		for (int i = 0; i < guess.length; i++)
		{
			myString = guess[i] + " ";
		}
		return myString;
	}

}

