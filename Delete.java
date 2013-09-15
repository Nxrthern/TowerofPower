/**
 * 		Name: 	Bradley Bowden
 *		Date:	January 23 2012
 *		Class Description:	This class sets the visibility of
 *							paired cards to false so the user can
 *							continue up the pyramid.
 */


public class Delete
{
	//Method will delete both cards if a pair is matched
    public static void pair(String evt2)
	{
		//Test the first card
		if(CardProcessor.evt1.equals("d24"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck24.setVisible(false);
    		CardProcessor.deck[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("d23"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck23.setVisible(false);
    		CardProcessor.deck[1] = true;
    	}
    	else if(CardProcessor.evt1.equals("d22"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck22.setVisible(false);
    		CardProcessor.deck[2] = true;
    	}
    	else if(CardProcessor.evt1.equals("d21"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck21.setVisible(false);
    		CardProcessor.deck[3] = true;
    	}
    	else if(CardProcessor.evt1.equals("d20"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck20.setVisible(false);
    		CardProcessor.deck[4] = true;
    	}
    	else if(CardProcessor.evt1.equals("d19"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck19.setVisible(false);
    		CardProcessor.deck[5] = true;
    	}
    	else if(CardProcessor.evt1.equals("d18"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck18.setVisible(false);
    		CardProcessor.deck[6] = true;
    	}
    	else if(CardProcessor.evt1.equals("d17"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck17.setVisible(false);
    		CardProcessor.deck[7] = true;
    	}
    	else if(CardProcessor.evt1.equals("d16"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck16.setVisible(false);
    		CardProcessor.deck[8] = true;
    	}
    	else if(CardProcessor.evt1.equals("d15"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck15.setVisible(false);
    		CardProcessor.deck[9] = true;
    	}
    	else if(CardProcessor.evt1.equals("d14"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck14.setVisible(false);
    		CardProcessor.deck[10] = true;
    	}
    	else if(CardProcessor.evt1.equals("d13"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck13.setVisible(false);
    		CardProcessor.deck[11] = true;
    	}
    	else if(CardProcessor.evt1.equals("d12"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck12.setVisible(false);
    		CardProcessor.deck[12] = true;
    	}
    	else if(CardProcessor.evt1.equals("d11"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck11.setVisible(false);
    		CardProcessor.deck[13] = true;
    	}
    	else if(CardProcessor.evt1.equals("d10"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck10.setVisible(false);
    		CardProcessor.deck[14] = true;
    	}
    	else if(CardProcessor.evt1.equals("d09"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck09.setVisible(false);
    		CardProcessor.deck[15] = true;
    	}
    	else if(CardProcessor.evt1.equals("d08"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck08.setVisible(false);
    		CardProcessor.deck[16] = true;
    	}
    	else if(CardProcessor.evt1.equals("d07"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck07.setVisible(false);
    		CardProcessor.deck[17] = true;
    	}
    	else if(CardProcessor.evt1.equals("d06"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck06.setVisible(false);
    		CardProcessor.deck[18] = true;
    	}
    	else if(CardProcessor.evt1.equals("d05"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck05.setVisible(false);
    		CardProcessor.deck[19] = true;
    	}
    	else if(CardProcessor.evt1.equals("d04"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck04.setVisible(false);
    		CardProcessor.deck[20] = true;
    	}
    	else if(CardProcessor.evt1.equals("d03"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck03.setVisible(false);
    		CardProcessor.deck[21] = true;
    	}
    	else if(CardProcessor.evt1.equals("d02"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck02.setVisible(false);
    		CardProcessor.deck[22] = true;
    	}
    	else if(CardProcessor.evt1.equals("d01"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck01.setVisible(false);
    		CardProcessor.deck[23] = true;
    	}
		else if(CardProcessor.evt1.equals("r11"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow11.setVisible(false);
    		CardProcessor.row1[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("r12"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow12.setVisible(false);
    		CardProcessor.row1[1] = true;
    	}
    	else if(CardProcessor.evt1.equals("r13"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow13.setVisible(false);
    		CardProcessor.row1[2] = true;
    	}
    	else if(CardProcessor.evt1.equals("r14"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow14.setVisible(false);
    		CardProcessor.row1[3] = true;
    	}
    	else if(CardProcessor.evt1.equals("r15"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow15.setVisible(false);
    		CardProcessor.row1[4] = true;
    	}
    	else if(CardProcessor.evt1.equals("r16"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow16.setVisible(false);
    		CardProcessor.row1[5] = true;
    	}
    	else if(CardProcessor.evt1.equals("r17"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow17.setVisible(false);
    		CardProcessor.row1[6] = true;
    	}
    	else if(CardProcessor.evt1.equals("r21"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow21.setVisible(false);
    		CardProcessor.row2[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("r22"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow22.setVisible(false);
    		CardProcessor.row2[1] = true;
    	}
    	else if(CardProcessor.evt1.equals("r23"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow23.setVisible(false);
    		CardProcessor.row2[2] = true;
    	}
    	else if(CardProcessor.evt1.equals("r24"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow24.setVisible(false);
    		CardProcessor.row2[3] = true;
    	}
    	else if(CardProcessor.evt1.equals("r25"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow25.setVisible(false);
    		CardProcessor.row2[4] = true;
    	}
    	else if(CardProcessor.evt1.equals("r26"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow26.setVisible(false);
    		CardProcessor.row2[5] = true;
    	}
    	else if(CardProcessor.evt1.equals("r31"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow31.setVisible(false);
    		CardProcessor.row3[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("r32"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow32.setVisible(false);
    		CardProcessor.row3[1] = true;
    	}
    	else if(CardProcessor.evt1.equals("r33"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow33.setVisible(false);
    		CardProcessor.row3[2] = true;
    	}
    	else if(CardProcessor.evt1.equals("r34"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow34.setVisible(false);
    		CardProcessor.row3[3] = true;
    	}
    	else if(CardProcessor.evt1.equals("r35"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow35.setVisible(false);
    		CardProcessor.row3[4] = true;
    	}
    	else if(CardProcessor.evt1.equals("r41"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow41.setVisible(false);
    		CardProcessor.row4[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("r42"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow42.setVisible(false);
    		CardProcessor.row4[1] = true;
    	}
    	else if(CardProcessor.evt1.equals("r43"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow43.setVisible(false);
    		CardProcessor.row4[2] = true;
    	}
    	else if(CardProcessor.evt1.equals("r44"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow44.setVisible(false);
    		CardProcessor.row4[3] = true;
    	}
    	else if(CardProcessor.evt1.equals("r51"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow51.setVisible(false);
    		CardProcessor.row5[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("r52"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow52.setVisible(false);
    		CardProcessor.row5[1] = true;
    	}
    	else if(CardProcessor.evt1.equals("r53"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow53.setVisible(false);
    		CardProcessor.row5[2] = true;
    	}
    	else if(CardProcessor.evt1.equals("r61"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow61.setVisible(false);
    		CardProcessor.row6[0] = true;
    	}
    	else if(CardProcessor.evt1.equals("r62"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow52.setVisible(false);
    		CardProcessor.row6[1] = true;
    	}
    	else
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow71.setVisible(false);
    		CardProcessor.row7[0] = true;
    	}//End of testing what the first card of the pair is to be deleted

    	//Test what the second was and remove it
    	if(evt2.equals("d24"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck24.setVisible(false);
    		CardProcessor.deck[0] = true;
    	}
    	else if(evt2.equals("d23"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck23.setVisible(false);
    		CardProcessor.deck[1] = true;
    	}
    	else if(evt2.equals("d22"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck22.setVisible(false);
    		CardProcessor.deck[2] = true;
    	}
    	else if(evt2.equals("d21"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck21.setVisible(false);
    		CardProcessor.deck[3] = true;
    	}
    	else if(evt2.equals("d20"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck20.setVisible(false);
    		CardProcessor.deck[4] = true;
    	}
    	else if(evt2.equals("d19"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck19.setVisible(false);
    		CardProcessor.deck[5] = true;
    	}
    	else if(evt2.equals("d18"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck18.setVisible(false);
    		CardProcessor.deck[6] = true;
    	}
    	else if(evt2.equals("d17"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck17.setVisible(false);
    		CardProcessor.deck[7] = true;
    	}
    	else if(evt2.equals("d16"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck16.setVisible(false);
    		CardProcessor.deck[8] = true;
    	}
    	else if(evt2.equals("d15"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck15.setVisible(false);
    		CardProcessor.deck[9] = true;
    	}
    	else if(evt2.equals("d14"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck14.setVisible(false);
    		CardProcessor.deck[10] = true;
    	}
    	else if(evt2.equals("d13"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck13.setVisible(false);
    		CardProcessor.deck[11] = true;
    	}
    	else if(evt2.equals("d12"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck12.setVisible(false);
    		CardProcessor.deck[12] = true;
    	}
    	else if(evt2.equals("d11"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck11.setVisible(false);
    		CardProcessor.deck[13] = true;
    	}
    	else if(evt2.equals("d10"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck10.setVisible(false);
    		CardProcessor.deck[14] = true;
    	}
    	else if(evt2.equals("d09"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck09.setVisible(false);
    		CardProcessor.deck[15] = true;
    	}
    	else if(evt2.equals("d08"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck08.setVisible(false);
    		CardProcessor.deck[16] = true;
    	}
    	else if(evt2.equals("d07"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck07.setVisible(false);
    		CardProcessor.deck[17] = true;
    	}
    	else if(evt2.equals("d06"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck06.setVisible(false);
    		CardProcessor.deck[18] = true;
    	}
    	else if(evt2.equals("d05"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck05.setVisible(false);
    		CardProcessor.deck[19] = true;
    	}
    	else if(evt2.equals("d04"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck04.setVisible(false);
    		CardProcessor.deck[20] = true;
    	}
    	else if(evt2.equals("d03"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck03.setVisible(false);
    		CardProcessor.deck[21] = true;
    	}
    	else if(evt2.equals("d02"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck02.setVisible(false);
    		CardProcessor.deck[22] = true;
    	}
    	else if(evt2.equals("d01"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdDeck01.setVisible(false);
    		CardProcessor.deck[23] = true;
    	}
		else if(evt2.equals("r11"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow11.setVisible(false);
    		CardProcessor.row1[0] = true;
    	}
    	else if(evt2.equals("r12"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow12.setVisible(false);
    		CardProcessor.row1[1] = true;
    	}
    	else if(evt2.equals("r13"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow13.setVisible(false);
    		CardProcessor.row1[2] = true;
    	}
    	else if(evt2.equals("r14"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow14.setVisible(false);
    		CardProcessor.row1[3] = true;
    	}
    	else if(evt2.equals("r15"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow15.setVisible(false);
    		CardProcessor.row1[4] = true;
    	}
    	else if(evt2.equals("r16"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow16.setVisible(false);
    		CardProcessor.row1[5] = true;
    	}
    	else if(evt2.equals("r17"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow17.setVisible(false);
    		CardProcessor.row1[6] = true;
    	}
    	else if(evt2.equals("r21"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow21.setVisible(false);
    		CardProcessor.row2[0] = true;
    	}
    	else if(evt2.equals("r22"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow22.setVisible(false);
    		CardProcessor.row2[1] = true;
    	}
    	else if(evt2.equals("r23"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow23.setVisible(false);
    		CardProcessor.row2[2] = true;
    	}
    	else if(evt2.equals("r24"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow24.setVisible(false);
    		CardProcessor.row2[3] = true;
    	}
    	else if(evt2.equals("r25"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow25.setVisible(false);
    		CardProcessor.row2[4] = true;
    	}
    	else if(evt2.equals("r26"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow26.setVisible(false);
    		CardProcessor.row2[5] = true;
    	}
    	else if(evt2.equals("r31"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow31.setVisible(false);
    		CardProcessor.row3[0] = true;
    	}
    	else if(evt2.equals("r32"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow32.setVisible(false);
    		CardProcessor.row3[1] = true;
    	}
    	else if(evt2.equals("r33"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow33.setVisible(false);
    		CardProcessor.row3[2] = true;
    	}
    	else if(evt2.equals("r34"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow34.setVisible(false);
    		CardProcessor.row3[3] = true;
    	}
    	else if(evt2.equals("r35"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow35.setVisible(false);
    		CardProcessor.row3[4] = true;
    	}
    	else if(evt2.equals("r41"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow41.setVisible(false);
    		CardProcessor.row4[0] = true;
    	}
    	else if(evt2.equals("r42"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow42.setVisible(false);
    		CardProcessor.row4[1] = true;
    	}
    	else if(evt2.equals("r43"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow43.setVisible(false);
    		CardProcessor.row4[2] = true;
    	}
    	else if(evt2.equals("r44"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow44.setVisible(false);
    		CardProcessor.row4[3] = true;
    	}
    	else if(evt2.equals("r51"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow51.setVisible(false);
    		CardProcessor.row5[0] = true;
    	}
    	else if(evt2.equals("r52"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow52.setVisible(false);
    		CardProcessor.row5[1] = true;
    	}
    	else if(evt2.equals("r53"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow53.setVisible(false);
    		CardProcessor.row5[2] = true;
    	}
    	else if(evt2.equals("r61"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow61.setVisible(false);
    		CardProcessor.row6[0] = true;
    	}
    	else if(evt2.equals("r62"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow62.setVisible(false);
    		CardProcessor.row6[1] = true;
    	}
    	else
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		GameScreen.cmdRow71.setVisible(false);
    		CardProcessor.row7[0] = true;
    	}//End of finding the second card of the pair to be deleted
	}//End of pair method

	//The king method will set the visibility of a confirmed king to false
	public static void king()
	{
		//Test which button was clicked that equals 13
		if(CardProcessor.evt1.equals("d24"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[0] = true;
    		GameScreen.cmdDeck24.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d23"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[1] = true;
    		GameScreen.cmdDeck23.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d22"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[2] = true;
    		GameScreen.cmdDeck22.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d21"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[3] = true;
    		GameScreen.cmdDeck21.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d20"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[4] = true;
    		GameScreen.cmdDeck20.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d19"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[5] = true;
    		GameScreen.cmdDeck19.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d18"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[6] = true;
    		GameScreen.cmdDeck18.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d17"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[7] = true;
    		GameScreen.cmdDeck17.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d16"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[8] = true;
    		GameScreen.cmdDeck16.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d15"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[9] = true;
    		GameScreen.cmdDeck15.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d14"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[10] = true;
    		GameScreen.cmdDeck14.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d13"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[11] = true;
    		GameScreen.cmdDeck13.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d12"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[12] = true;
    		GameScreen.cmdDeck12.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d11"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[13] = true;
    		GameScreen.cmdDeck11.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d10"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[14] = true;
    		GameScreen.cmdDeck10.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d09"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[15] = true;
    		GameScreen.cmdDeck09.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d08"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[16] = true;
    		GameScreen.cmdDeck08.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d07"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[17] = true;
    		GameScreen.cmdDeck07.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d06"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[18] = true;
    		GameScreen.cmdDeck06.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d05"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[19] = true;
    		GameScreen.cmdDeck05.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d04"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[20] = true;
    		GameScreen.cmdDeck04.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d03"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[21] = true;
    		GameScreen.cmdDeck03.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d02"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[22] = true;
    		GameScreen.cmdDeck02.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("d01"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.deck[23] = true;
    		GameScreen.cmdDeck01.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r11"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[0] = true;
    		GameScreen.cmdRow11.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r12"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[1]= true;
    		GameScreen.cmdRow12.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r13"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[2] = true;
    		GameScreen.cmdRow13.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r14"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[3] = true;
    		GameScreen.cmdRow14.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r15"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[4] = true;
    		GameScreen.cmdRow15.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r16"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[5] = true;
    		GameScreen.cmdRow16.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r17"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row1[6] = true;
    		GameScreen.cmdRow17.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r21"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row2[0] = true;
    		GameScreen.cmdRow21.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r22"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row2[1] = true;
    		GameScreen.cmdRow22.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r23"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row2[2] = true;
    		GameScreen.cmdRow23.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r24"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row2[3] = true;
    		GameScreen.cmdRow24.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r25"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row2[4] = true;
    		GameScreen.cmdRow25.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r26"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row2[5] = true;
    		GameScreen.cmdRow26.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r31"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row3[0] = true;
    		GameScreen.cmdRow31.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r32"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row3[1] = true;
    		GameScreen.cmdRow32.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r33"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row3[2] = true;
    		GameScreen.cmdRow33.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r34"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row3[3] = true;
    		GameScreen.cmdRow34.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r35"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row3[4] = true;
    		GameScreen.cmdRow35.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r41"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row4[0] = true;
    		GameScreen.cmdRow41.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r42"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row4[1] = true;
    		GameScreen.cmdRow42.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r43"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row4[2] = true;
    		GameScreen.cmdRow43.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r44"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row4[3] = true;
    		GameScreen.cmdRow44.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r51"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row5[0] = true;
    		GameScreen.cmdRow51.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r52"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row5[1] = true;
    		GameScreen.cmdRow52.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r53"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row5[2] = true;
    		GameScreen.cmdRow53.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r61"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row6[0] = true;
    		GameScreen.cmdRow61.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r62"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row6[1] = true;
    		GameScreen.cmdRow62.setVisible(false);
    	}
    	else if(CardProcessor.evt1.equals("r71"))
    	{
    		//Set the visibility to false but also change boolean array value to show a card has been removed
    		CardProcessor.row7[0] = true;
    		GameScreen.cmdRow71.setVisible(false);
    	}//End of king to be deleted test 
	}//End of king method
}//End of class