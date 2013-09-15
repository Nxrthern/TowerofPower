/**
 * 		Name: 	Bradley Bowden
 *		Date: January 23 2012
 *		Class Purpose: 	This calls will set the starting state
 *						of every card at the beginning of the
 *						game.
 */
 
//Required imports
import java.util.Random;
import java.io.*;

public class CardStartState
{
	//This method will get the file length and return it to the primary method
	public static int getFileLength(String filename) throws IOException
    {
		//Declare and initialize local variable
		int fileLength = 0;	//Holds the length of the files, lines

		//Create a read object
		BufferedReader input = new BufferedReader(new FileReader(filename));

		//Determine how many lines are in the file with a loop
		while (input.readLine() != null)
		{
			//Incriment file length
			fileLength++;
		}//End of length loop

		//Close the file
		input.close();

		//Return length
		return fileLength;
    }//End of get file length method

	//This method will fill the array with the image paths
	public static void fillArray(String filename) throws IOException
	{
		//Create a read object
		BufferedReader input = new BufferedReader(new FileReader(filename));

		//Loop to get names into array
		for (int x = 0; x < GameScreen.cards.length; x++)
			GameScreen.cards[x] = input.readLine();

		//Close the file
		input.close();
	}//End of fill array method
	
	//This method will shuffle both arrays in the 
	//same way to match cards values to cards in each array
	public static void shuffle()
	{
		//Declare and initialize the local variables used in the shuffle
		String temp = "";	//Temporary string variable used in shuffling image paths
		int tempo = 0;		//Temporary number variable used in swapping card values

		//Generate an absolutely random number to shuffle
		Random x = new Random();	//Holds a random number
		int n = 52;					//Holds the start value of 52 (cards)

		//Shuffling loop
		while (n > 1)
		{
			//Get a random number
			int k = x.nextInt(n);
			
			//Decrement n
			n--;
			
			//Swap cards values
			temp = GameScreen.cards[k];
			GameScreen.cards[k] = GameScreen.cards[n];
			GameScreen.cards[n] = temp;

			//Swap the card values
			tempo = GameScreen.values[k];
			GameScreen.values[k] = GameScreen.values[n];
			GameScreen.values[n] = tempo;
		}//Loop to shuffle
	}//End of shuffle method

	//Disables all the cards covered by the pyramid rows below it
	public static void disabled()
	{
		//Disable all button at the higher part of the pyramid
		GameScreen.cmdRow21.setEnabled(false);
		GameScreen.cmdRow22.setEnabled(false);
		GameScreen.cmdRow23.setEnabled(false);
		GameScreen.cmdRow24.setEnabled(false);
		GameScreen.cmdRow25.setEnabled(false);
		GameScreen.cmdRow26.setEnabled(false);
		GameScreen.cmdRow31.setEnabled(false);
		GameScreen.cmdRow32.setEnabled(false);
		GameScreen.cmdRow33.setEnabled(false);
		GameScreen.cmdRow34.setEnabled(false);
		GameScreen.cmdRow35.setEnabled(false);
		GameScreen.cmdRow41.setEnabled(false);
		GameScreen.cmdRow42.setEnabled(false);
		GameScreen.cmdRow43.setEnabled(false);
		GameScreen.cmdRow44.setEnabled(false);
		GameScreen.cmdRow51.setEnabled(false);
		GameScreen.cmdRow52.setEnabled(false);
		GameScreen.cmdRow53.setEnabled(false);
		GameScreen.cmdRow61.setEnabled(false);
		GameScreen.cmdRow62.setEnabled(false);
		GameScreen.cmdRow71.setEnabled(false);
	}//End of diable method

	//Acts as the main method for the class and does all the starting card state processing
    public static void startState() throws IOException
    {
    	//Fill and shuffle arrays before inserting pictures to buttons
		fillArray("txt\\cards.txt");
		shuffle();
    }//End of start state method
}//End of class