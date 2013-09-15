/**
 *		Name:	Bradley Bowden
 *		Date:	January 23 2012
 *		Class Description:	Holds the variables that are used
 *							throughout the program and required
 *							to be declared as global.
 */

//Required import
import javax.swing.*;

public class GlobalVars
{
	//Declare and initialize global variables
	public static String name = "";			//Holds the user's name
	public static int score = 0;			//Holds the user's final score
	public static boolean gameOver = false; //Holds the flag that indicates a game is over
	public static boolean flag = false;		//Holds an indicator of a constructor being loaded
	public static boolean flag2 = false;	//Holds an indicator of a constructor being loaded
	public static int clicks = 0;			//Holds the amount of clicks a user has made
	public static int moves = 0;			//Holds the amount of time the user has gone though the deck
	public static int cardsRemoved = 0;		//Holds the amount of cards removed during play time

	public static String path = "";			//String that can be used to access files outside the program
    public static MP3 mp3 = new MP3(GlobalVars.path + "Music\\bangarang.mp3"); //Stores an MP3 object
    public static Timer timer;				//Holds a value in milliseconds that will be the length of the song
}//End of global vars class