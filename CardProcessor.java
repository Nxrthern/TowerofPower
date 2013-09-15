/**
 *	Name: 		Bradley Bowden
 *	Date:		January 23 2012
 *	Class Description: When a card is clicked all of the possible outcomes and actions
 *					   are tested and done here. Whether it be method calls or other class
 *					   calls processing for cards and score are done here.
 */

//Required imports
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;

public class CardProcessor
{
	//Declare and initialize variables
	static int currentVal = 0;		//Holds the current value of a card and is used to add cards together
	static boolean gameOver = false;//Used to test for an end game scenario
	static String evt1 = "";		//Holds the identifier of the first button clicked

	//Declare and initialize constants
	static final int ROW_BONUS = 25; 	//Holds the row bonus for all rows
	static final int ROW1_SCORE = 1;	//Holds the score value of all row 1 cards
	static final int ROW2_SCORE = 3;	//Holds the score value of row 2 cards
	static final int ROW3_SCORE = 6;	//Holds the score value of row 3 cards
	static final int ROW4_SCORE = 12;	//Holds the score value of row 4 cards
	static final int ROW5_SCORE = 24;	//Holds the score value of row 5 cards
	static final int ROW6_SCORE = 48;	//Holds the score value of row 6 cards
	static final int ROW7_SCORE = 96;	//Holds the score value of the row 7 card
	static final int DECK_SCORE = 1;	//Holds the score value of the cards in the deck

	//Declare and initialize arrays
	static boolean [] row1 = new boolean[7];	//Used in determining which cards have been deleted from row 1
	static boolean [] row2 = new boolean[6];	//Used in determining which cards have been deleted from row 2
	static boolean [] row3 = new boolean[5];	//Used in determining which cards have been deleted from row 3
	static boolean [] row4 = new boolean[4];	//Used in determining which cards have been deleted from row 4
	static boolean [] row5 = new boolean[3];	//Used in determining which cards have been deleted from row 5
	static boolean [] row6 = new boolean[2];	//Used in determining which cards have been deleted from row 6
	static boolean [] row7 = new boolean[1];	//Used in determining which card has been deleted from row 7
	static boolean [] deck = new boolean[24];	//Used in determining which cards have been deleted from the deck

	//The is valid method will determine if a
	//card clicked is valid for further testing
	public static boolean isValid(String evt2)
    {
    	//Determine if the card clicked falls under appropriate circumstances
    	if(GlobalVars.clicks == 2 && currentVal == 13)
    		return true;	//Return true
    	else if(GlobalVars.clicks == 2 && evt1.equals(evt2))
    		return true;	//Return true
    	else if(currentVal == 13 && GlobalVars.clicks == 1)
    		return true;	//Return true
    	else if(currentVal != 13 && GlobalVars.clicks == 1)
    		return true;	//Return true
    	else
    		return false;	//Return false
    }//End of validity check method

	//The activated method called after each click
	//will check whether to activate a high card or not
	public static void activated()
    {
    	//Activation code for row 2
    	if(row1[0] == true && row1[1] == true)
    		GameScreen.cmdRow21.setEnabled(true);
    	if(row1[1] == true && row1[2] == true)
   			GameScreen.cmdRow22.setEnabled(true);
   		if(row1[2] == true && row1[3] == true)
   			GameScreen.cmdRow23.setEnabled(true);
   		if(row1[3] == true && row1[4] == true)
   			GameScreen.cmdRow24.setEnabled(true);
   		if(row1[4] == true && row1[5] == true)
   			GameScreen.cmdRow25.setEnabled(true);
   		if(row1[5] == true && row1[6] == true)
   			GameScreen.cmdRow26.setEnabled(true);

   		//Activation code for row 3
   		if(row2[0] == true && row2[1] == true)
    		GameScreen.cmdRow31.setEnabled(true);
    	if(row2[1] == true && row2[2] == true)
   			GameScreen.cmdRow32.setEnabled(true);
   		if(row2[2] == true && row2[3] == true)
   			GameScreen.cmdRow33.setEnabled(true);
   		if(row2[3] == true && row2[4] == true)
   			GameScreen.cmdRow34.setEnabled(true);
   		if(row2[4] == true && row2[5] == true)
   			GameScreen.cmdRow35.setEnabled(true);

   		//Activation code for row 4
   		if(row3[0] == true && row3[1] == true)
    		GameScreen.cmdRow41.setEnabled(true);
    	if(row3[1] == true && row3[2] == true)
   			GameScreen.cmdRow42.setEnabled(true);
   		if(row3[2] == true && row3[3] == true)
   			GameScreen.cmdRow43.setEnabled(true);
   		if(row3[3] == true && row3[4] == true)
   			GameScreen.cmdRow44.setEnabled(true);

   		//Activation code for row 5
   		if(row4[0] == true && row4[1] == true)
    		GameScreen.cmdRow51.setEnabled(true);
    	if(row4[1] == true && row4[2] == true)
   			GameScreen.cmdRow52.setEnabled(true);
   		if(row4[2] == true && row4[3] == true)
   			GameScreen.cmdRow53.setEnabled(true);

   		//Activation code for row 6
   		if(row5[0] == true && row5[1] == true)
    		GameScreen.cmdRow61.setEnabled(true);
    	if(row5[1] == true && row5[2] == true)
   			GameScreen.cmdRow62.setEnabled(true);

   		//Activation code for row 7
   		if(row6[0] == true && row6[1] == true)
    		GameScreen.cmdRow71.setEnabled(true);
    }//End of the activate method

	//Calculates the score after each turn and
	//updates the the score label
    public static void score()
    {
    	//Declare and initialize temporary variable
    	int temp = 0;		//Holds the number of cards deleted within a certain row
		int scoreCal = 0; 	//Holds the score of each new calculation

    	//Set empty label and recalculate score
    	GameScreen.lblScore.setText("");

		//Calculate score for the deck
		for(int x = 0; x < deck.length; x++)
		{
			//Increment the temp variable to determine how many cards have been removed from that row
			if(deck[x] == true)
				temp++;
		}

		//Increment score and reset temp for next row
    	scoreCal += temp * DECK_SCORE;
    	temp = 0;

		//Calculate the score for the top row
    	for(int x = 0; x < row7.length; x++)
    	{
    		//Increment the temp variable to determine how many cards have been removed from that row
    		if(row7[x] == true)
    			temp++;
    	}

		//Determine if row is cleared for a bonus
    	if(temp == row7.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temp for next row
    	scoreCal += temp * ROW7_SCORE;
    	temp = 0;

		//Calculate score for row 6
    	for(int x = 0; x < row6.length; x++)
    	{
    		//Increment the temp variable to determine how many cards have been removed from that row
    		if(row6[x] == true)
    			temp++;
    	}

		//Determine if row is cleared for a bonus
    	if(temp == row6.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temp for next score calculation
    	scoreCal += temp * ROW6_SCORE;
    	temp = 0;

		//Calculate the score for row 5
    	for(int x = 0; x < row5.length; x++)
    	{
    		//Increment the temp variable to determine how many cards have been removed from that row
    		if(row5[x] == true)
    			temp++;
    	}

		//Check for a row completion bonus
    	if(temp == row5.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temp for next row
    	scoreCal += temp * ROW5_SCORE;
    	temp = 0;

		//Calculate score for row 4
    	for(int x = 0; x < row4.length; x++)
    	{
    		//Increment the temp variable to determine how many cards have been removed from that row
    		if(row4[x] == true)
    			temp++;
    	}

		//Check for a row completion bonus
    	if(temp == row4.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temp for next row
    	scoreCal += temp * ROW4_SCORE;
    	temp = 0;

		//Calculate score for row 3
    	for(int x = 0; x < row3.length; x++)
    	{
    		//Increment the temp variable to determine how many cards have been removed from that row
    		if(row3[x] == true)
    			temp++;
    	}

		//Check for a row completion bonus
    	if(temp == row3.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temp for next row
    	scoreCal += temp * ROW3_SCORE;
    	temp = 0;

		//Calculate score for row 2
    	for(int x = 0; x < row2.length; x++)
    	{
    		//Increment the temp variable to determine how many cards have been removed from that row
    		if(row2[x] == true)
    			temp++;
    	}

		//Check for a row completion bonus
    	if(temp == row2.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temp for next row
    	scoreCal += temp * ROW2_SCORE;
    	temp = 0;

		//Determine how many cards have been deleted from row 1 with a for loop
    	for(int x = 0; x < row1.length; x++)
    	{
    		if(row1[x] == true)
    			temp++;
    	}

		//Check for a row bonus
    	if(temp == row1.length)
    		scoreCal += ROW_BONUS;

		//Increment score and reset temporary variable
    	scoreCal += temp * ROW1_SCORE;
    	temp = 0;

		//Output score to the score label
    	GameScreen.lblScore.setText("" + scoreCal);

    	//Assign scoreCal to global variable score
    	GlobalVars.score = scoreCal;
    }//End of score method

	//This method although lengthy will move the deck cards
	//over a space and when doule clicked on a pyramid
	//card the deck will reset
	public static void moveDeck(String evt2)
    {
    	//When a card is double clicked move the deck over 1
    	if(evt2.equals("d24"))
    		GameScreen.cmdDeck24.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d23"))
    		GameScreen.cmdDeck23.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d22"))
    		GameScreen.cmdDeck22.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d21"))
    		GameScreen.cmdDeck21.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d20"))
    		GameScreen.cmdDeck20.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d19"))
    		GameScreen.cmdDeck19.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d18"))
    		GameScreen.cmdDeck18.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d17"))
    		GameScreen.cmdDeck17.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d16"))
    		GameScreen.cmdDeck16.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d15"))
    		GameScreen.cmdDeck15.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d14"))
    		GameScreen.cmdDeck14.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d13"))
    		GameScreen.cmdDeck13.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d12"))
    		GameScreen.cmdDeck12.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d11"))
    		GameScreen.cmdDeck11.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d10"))
    		GameScreen.cmdDeck10.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d09"))
    		GameScreen.cmdDeck09.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d08"))
    		GameScreen.cmdDeck08.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d07"))
    		GameScreen.cmdDeck07.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d06"))
    		GameScreen.cmdDeck06.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d05"))
    		GameScreen.cmdDeck05.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d04"))
    		GameScreen.cmdDeck04.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d03"))
    		GameScreen.cmdDeck03.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d02"))
    		GameScreen.cmdDeck02.setBounds(80, 10, 70, 96);
    	else if(evt2.equals("d01"))
    		GameScreen.cmdDeck01.setBounds(80, 10, 70, 96);
    	else
    	{
    		//Reset all cards at the end of the deck
    		GameScreen.cmdDeck24.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck23.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck22.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck21.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck20.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck19.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck18.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck17.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck16.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck15.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck14.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck13.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck12.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck11.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck10.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck09.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck08.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck07.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck06.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck05.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck04.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck03.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck02.setBounds(10, 10, 70, 96);
	    	GameScreen.cmdDeck01.setBounds(10, 10, 70, 96);

	    	//Increment moves here, user will only be allowed to cycle through the deck 5 times before game ends
	    	GlobalVars.moves++;

	    	//Call game over to check moves
	    	endGame();
    	}//End of determining which card to move
    }//End of the move deck method

	//This method test for an end game scenario and does certain actions
	public static void endGame()
	{
		//Check if the game is over
		if(GlobalVars.moves == 5)
			GlobalVars.gameOver = true;
		else if(GlobalVars.cardsRemoved == 52)
			GlobalVars.gameOver = true;

		//When the game is over do the following
		if(GlobalVars.gameOver == true)
		{
			//Call the save method
            Save.save();

            //Call the reset method
            Save.reset();

			//Call disable method to diable pyramid cards
			CardStartState.disabled();

			//Disable some game screen buttons, code is too messy to close the frame
			GameScreen.cmdReset.setEnabled(false);
			GameScreen.cmdDeck01.setEnabled(false);
			GameScreen.cmdMenu.setEnabled(false);
			GameScreen.cmdHistory.setEnabled(false);
			GameScreen.cmdInstructions.setEnabled(false);

			//Disable the start button on the menu screen
			MenuScreen.cmdStart.setEnabled(false);
			MenuScreen.cmdEnter.setEnabled(false);

            //Switch frames
    		HighScores frame = new HighScores();
		}//End of game over actions
	}//End of end game method

	//This method will determine which card/cards are clicked and
	//make method calls to do the correct action
    public static void cardProcessor(int cardVal, String button)
    {
    	//Declare and initialize variable
    	String evt2 = "";	//Holds the second identifier of a button

    	//Initialize evt2 when clicks equals two for double click testing
		if(GlobalVars.clicks == 2)
			evt2 = button;

    	//Update current value to test on pair
    	currentVal += cardVal;

		//Declare and initialize a boolean based on a validity call
    	boolean valid = isValid(evt2);

		//Test which scenario has occured for cards clicked and make appropriate calls and resets
    	if(GlobalVars.clicks == 1 && currentVal == 13 && valid == true)
    	{
    		//Move button clicked into string
    		evt1 = button;

	    	//This will be a single card that equals 13 AKA a king
	    	//Call the king method
	    	Delete.king();

	    	//Increment cards removed variable
	    	GlobalVars.cardsRemoved+=1;

    		//Reset variables
    		GlobalVars.clicks = 0;
    		currentVal= 0;
    	}
    	else if(GlobalVars.clicks == 1 && currentVal!= 13 && valid == true)
    	{
    		//Add first card pressed to the event holder
    		evt1 = button;
    	}
    	else if(GlobalVars.clicks == 2 && currentVal != 13 && evt1.equals(evt2))
    	{
    		//Call the move method on a double click
    		moveDeck(evt2);

			//Reset values after moving deck
    		GlobalVars.clicks = 0;
    		currentVal = 0;
    		evt1 = "";
    	}
    	else if(GlobalVars.clicks == 2 && currentVal != 13)
    	{
    		//Reset values on a bad pair
    		GlobalVars.clicks = 0;
    		currentVal = 0;
    		evt1 = "";
    	}
    	else if(GlobalVars.clicks == 2 && currentVal == 13 && valid == true)
    	{
    		//Store the most recently clicked button
    		evt2 = button;

			//Call the pair method
			Delete.pair(evt2);

			//Increment cards removed
    		GlobalVars.cardsRemoved+=2;

    		//Reset variables
    		currentVal = 0;
    		GlobalVars.clicks = 0;
    	}//End of card outcome check

		//Call the score method to find the current score and display it
    	score();

    	//Call the activated method to turn on buttons
    	activated();

    	//Call the end game method
    	endGame();
    }//End of the card processor method
}//End of the card processor class