/*
 *		Name:	Bradley Bowden
 *		Date:	January 23 2012
 *		Class Description:	This class creates a music playing object
 *							where a timer is instantiated and the path
 *							to an mp3 is played with the mp3 class.
 */

//Required imports
import javax.swing.*;
import java.awt.event.*;

public class Music
{
	//Construct a music playing object
    public Music()
    {
    	//Initialize timer as the length of the song
    	GlobalVars.timer = new Timer(215400, new ActionListener()
    	{
    		//This action performed's sole purpose is to play an mp3
    		public void actionPerformed(ActionEvent e)
    		{
    			//Upon repeat close the mp3 first
    			GlobalVars.mp3.close();

    			//Play the mp3 file
    			GlobalVars.mp3.play();
    		}//End of action performed method
    	});	//End of timer action

   		//Play the mp3 file
   		GlobalVars.mp3.play();

   		//Reset timer
   		GlobalVars.timer.start();
    }//End of music method
}//End of class