/*
 * Bradley Bowden
 * Final project for ICS 3UI - Tower of Power
 * Date Due:		January 25 2012
 * Date Completed:	January 23 2012
 *
 * Description:
 *              Tower of Power is a solo card game that is won by eliminating all the
 *				cards from the tower and three stacks. However the way to eliminate
 *				cards is by the sum of two cards equalling thirteen. In this way
 *				each card has a value aces being one and jack being eleven, queen
 *				is twelve and king is thirteen. When cards match to make thirteen
 *				they can removed from the tower meaning the king does not have a
 *				pair and can be removed on its own. Seven rows create the tower
 *				and three stacks of cards hold the remainder of the deck.
 * Purpose:
 *          The purpose of the program is to entertain a user with a mild challenge
 *			of intelligence, but also doubles as an improvement of basic math and
 *			problem solving skills.
 *
 *          To play, the user simply clicks on available pairs seen on the screen to
 *			eliminate them and earn points. If a card is blocked by a card on the row
 *			beneath it, that card must be eliminated before the card above can be
 *			eliminated. The limitations in the source code will prevent the user
 *			from making mistakes like math errors or clicking wrong cards.
 */

public class Main
{
	/********MAIN********/
    public static void main(String [] args)
    {
    	//Play mp3
    	Music music = new Music();

        //Create an instance of the next GUI screen
        MenuScreen frame = new MenuScreen();
    }//End of main method
}//End of class