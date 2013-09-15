/**
 *		Name:	Bradley bowden
 *		Date:	January 23 2012
 *		Class Purpose: 	This class is reponsible for saving and
 *						resetting all variables.
 */

//Required imports
import java.io.*;

public class Save
{
	//This method resets all crucial variables
	public static void reset()
	{
		//Declare and initialize the array used to reset another array
		int [] values2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

		//Reset all variables
        GameScreen.lblScore.setText("");
        GlobalVars.gameOver = false;
        GlobalVars.clicks = 0;
        GlobalVars.moves = 0;
        GlobalVars.cardsRemoved = 0;
        CardProcessor.evt1 = "";
        CardProcessor.currentVal = 0;

        //Reset boolean arrays to false
        for(int x = 0; x < CardProcessor.row1.length; x++)
        	CardProcessor.row1[x] = false;
        for(int x = 0; x < CardProcessor.row2.length; x++)
        	CardProcessor.row2[x] = false;
        for(int x = 0; x < CardProcessor.row3.length; x++)
        	CardProcessor.row3[x] = false;
        for(int x = 0; x < CardProcessor.row4.length; x++)
        	CardProcessor.row4[x] = false;
        for(int x = 0; x < CardProcessor.row5.length; x++)
        	CardProcessor.row5[x] = false;
        for(int x = 0; x < CardProcessor.row6.length; x++)
        	CardProcessor.row6[x] = false;
        for(int x = 0; x < CardProcessor.row7.length; x++)
        	CardProcessor.row7[x] = false;
        for(int x = 0; x < CardProcessor.deck.length; x++)
        	CardProcessor.deck[x] = false;

        //Reset values array
        for(int x = 0; x < values2.length; x++)
        	GameScreen.values[x] = values2[x];
	}//End of reset method

	//This method will save the current user's name and score to a file
    public static void save()
    {
    	//Use a try catch to avoid and IO error
		try
		{
            //Construct write objects
            PrintWriter playerInfo = new PrintWriter(new PrintWriter (new FileWriter(GlobalVars.path + "txt\\savegame.txt",true)), true);

            //Saves the name and score of the player
            if(GlobalVars.name.equals(""))
            {
            	//This empty if is to test if the name is empty
            	//The name will only be empty in the case of an error
            	//Don't save the info if the name is empty
            }
            else
            {
            	//Save the player info to the file
            	playerInfo.println(GlobalVars.name);
            	playerInfo.println(GlobalVars.score);
            }//End of empty name check

            //Close the file
            playerInfo.close();
		}//End of try statement
		catch (Exception a)
		{
            //Outputs an error message about the bad file
            System.out.println("File error: " + a.toString());
		}//End of exception catcher
    }//End of save method
}//End of save class