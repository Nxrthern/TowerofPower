/**
 *		Name: 	Bradley Bowden
 *		Date: 	January 23 2012
 *		Class Purpose:	This class, although extremely long,
 *						will construct the game screen with
 *						its components. Also, it contains
 *						the action performed which determines
 *						to proceed when a component is activated.
 */

//Required imports
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;

public class GameScreen extends JFrame implements ActionListener
{
    //Create an empty image object
	Image imgBg;

	//Creates buttons for frame
    static JButton cmdMenu = new JButton("Menu");
    static JButton cmdInstructions = new JButton("Instructions");
    static JButton cmdHistory = new JButton("Game History");
    static JButton cmdReset = new JButton("Reset");

	//Declare and initialize arrays
	static int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	static String [] cards;

   	//Creates buttons for cards, TRIED an array but got too confusing, not that this length is much of an upgrade
    static JButton cmdRow11;
    static JButton cmdRow12;
    static JButton cmdRow13;
    static JButton cmdRow14;
    static JButton cmdRow15;
    static JButton cmdRow16;
    static JButton cmdRow17;
    static JButton cmdRow21;
    static JButton cmdRow22;
    static JButton cmdRow23;
    static JButton cmdRow24;
    static JButton cmdRow25;
    static JButton cmdRow26;
    static JButton cmdRow31;
    static JButton cmdRow32;
    static JButton cmdRow33;
    static JButton cmdRow34;
    static JButton cmdRow35;
    static JButton cmdRow41;
    static JButton cmdRow42;
    static JButton cmdRow43;
    static JButton cmdRow44;
    static JButton cmdRow51;
    static JButton cmdRow52;
    static JButton cmdRow53;
    static JButton cmdRow61;
    static JButton cmdRow62;
    static JButton cmdRow71;
    static JButton cmdDeck24;
    static JButton cmdDeck23;
    static JButton cmdDeck22;
    static JButton cmdDeck21;
    static JButton cmdDeck20;
    static JButton cmdDeck19;
    static JButton cmdDeck18;
    static JButton cmdDeck17;
    static JButton cmdDeck16;
    static JButton cmdDeck15;
    static JButton cmdDeck14;
    static JButton cmdDeck13;
    static JButton cmdDeck12;
    static JButton cmdDeck11;
    static JButton cmdDeck10;
    static JButton cmdDeck09;
    static JButton cmdDeck08;
    static JButton cmdDeck07;
    static JButton cmdDeck06;
    static JButton cmdDeck05;
    static JButton cmdDeck04;
    static JButton cmdDeck03;
    static JButton cmdDeck02;
    static JButton cmdDeck01;

    //Create labels for score
    static JLabel lblScoreHead = new JLabel("Score:");
    static JLabel lblScore = new JLabel();

	//Creates an instance for the layout manager
    static SpringLayout layout = new SpringLayout();

	//Constructor method which constructs the game screen
    public GameScreen() throws IOException
    {
    	if(GlobalVars.flag == false)
    	{
			//Set multiple calls flag to true to prevent another call
    		GlobalVars.flag = true;

	    	//Initialize here because of a weird IO error
	    	cards = new String[CardStartState.getFileLength("txt\\cards.txt")];

	    	//Call the starting state of the cards
	    	CardStartState.startState();

	       	//Get the appropriate image
			imgBg = Toolkit.getDefaultToolkit().getImage("Images/Backgrounds/35877.jpg");

	    	//Create a jpanel and put as content pane
	   		this.setContentPane(new JPanel()
	   			{
	   				//Paint a background
	    			public void paintComponent(Graphics g)
	    			{
	    				//Paint the image to the screen
	    				g.drawImage(imgBg, 0,0, this);
	   				}
	   			}
	   		);	//End of drawing the background

	    	//Adds buttons and labels to the frame, initialization on buttons includes card images
	    	this.add(cmdMenu);
	    	this.add(cmdInstructions);
	    	this.add(cmdHistory);
	    	this.add(cmdRow11 = new JButton(new ImageIcon(cards[0])));
	    	this.add(cmdRow12 = new JButton(new ImageIcon(cards[1])));
	    	this.add(cmdRow13 = new JButton(new ImageIcon(cards[2])));
	    	this.add(cmdRow14 = new JButton(new ImageIcon(cards[3])));
	    	this.add(cmdRow15 = new JButton(new ImageIcon(cards[4])));
	    	this.add(cmdRow16 = new JButton(new ImageIcon(cards[5])));
	    	this.add(cmdRow17 = new JButton(new ImageIcon(cards[6])));
	    	this.add(cmdRow21 = new JButton(new ImageIcon(cards[7])));
	    	this.add(cmdRow22 = new JButton(new ImageIcon(cards[8])));
	    	this.add(cmdRow23 = new JButton(new ImageIcon(cards[9])));
	    	this.add(cmdRow24 = new JButton(new ImageIcon(cards[10])));
	    	this.add(cmdRow25 = new JButton(new ImageIcon(cards[11])));
	    	this.add(cmdRow26 = new JButton(new ImageIcon(cards[12])));
	    	this.add(cmdRow31 = new JButton(new ImageIcon(cards[13])));
	    	this.add(cmdRow32 = new JButton(new ImageIcon(cards[14])));
	    	this.add(cmdRow33 = new JButton(new ImageIcon(cards[15])));
	    	this.add(cmdRow34 = new JButton(new ImageIcon(cards[16])));
	    	this.add(cmdRow35 = new JButton(new ImageIcon(cards[17])));
	    	this.add(cmdRow41 = new JButton(new ImageIcon(cards[18])));
	    	this.add(cmdRow42 = new JButton(new ImageIcon(cards[19])));
	    	this.add(cmdRow43 = new JButton(new ImageIcon(cards[20])));
	    	this.add(cmdRow44 = new JButton(new ImageIcon(cards[21])));
	    	this.add(cmdRow51 = new JButton(new ImageIcon(cards[22])));
	    	this.add(cmdRow52 = new JButton(new ImageIcon(cards[23])));
	    	this.add(cmdRow53 = new JButton(new ImageIcon(cards[24])));
	    	this.add(cmdRow61 = new JButton(new ImageIcon(cards[25])));
	    	this.add(cmdRow62 = new JButton(new ImageIcon(cards[26])));
	    	this.add(cmdRow71 = new JButton(new ImageIcon(cards[27])));
	    	this.add(cmdDeck24 = new JButton(new ImageIcon(cards[28])));
	    	this.add(cmdDeck23 = new JButton(new ImageIcon(cards[29])));
	    	this.add(cmdDeck22 = new JButton(new ImageIcon(cards[30])));
	    	this.add(cmdDeck21 = new JButton(new ImageIcon(cards[31])));
	    	this.add(cmdDeck20 = new JButton(new ImageIcon(cards[32])));
	    	this.add(cmdDeck19 = new JButton(new ImageIcon(cards[33])));
	    	this.add(cmdDeck18 = new JButton(new ImageIcon(cards[34])));
	    	this.add(cmdDeck17 = new JButton(new ImageIcon(cards[35])));
	    	this.add(cmdDeck16 = new JButton(new ImageIcon(cards[36])));
	    	this.add(cmdDeck15 = new JButton(new ImageIcon(cards[37])));
	    	this.add(cmdDeck14 = new JButton(new ImageIcon(cards[38])));
	    	this.add(cmdDeck13 = new JButton(new ImageIcon(cards[39])));
	    	this.add(cmdDeck12 = new JButton(new ImageIcon(cards[40])));
	    	this.add(cmdDeck11 = new JButton(new ImageIcon(cards[41])));
	    	this.add(cmdDeck10 = new JButton(new ImageIcon(cards[42])));
	    	this.add(cmdDeck09 = new JButton(new ImageIcon(cards[43])));
	    	this.add(cmdDeck08 = new JButton(new ImageIcon(cards[44])));
	    	this.add(cmdDeck07 = new JButton(new ImageIcon(cards[45])));
	    	this.add(cmdDeck06 = new JButton(new ImageIcon(cards[46])));
	    	this.add(cmdDeck05 = new JButton(new ImageIcon(cards[47])));
	    	this.add(cmdDeck04 = new JButton(new ImageIcon(cards[48])));
	    	this.add(cmdDeck03 = new JButton(new ImageIcon(cards[49])));
	    	this.add(cmdDeck02 = new JButton(new ImageIcon(cards[50])));
	    	this.add(cmdDeck01 = new JButton(new ImageIcon(cards[51])));
	    	this.add(cmdReset = new JButton(new ImageIcon("Images\\Backgrounds\\classic_playing_cards.JPG")));
	    	this.add(lblScoreHead);
	    	this.add(lblScore);

	    	//Set the size of the image to reshape button
	    	cmdRow71.setPreferredSize(new Dimension(70, 96));
			cmdRow61.setPreferredSize(new Dimension(70, 96));
			cmdRow62.setPreferredSize(new Dimension(70, 96));
			cmdRow51.setPreferredSize(new Dimension(70, 96));
			cmdRow52.setPreferredSize(new Dimension(70, 96));
			cmdRow53.setPreferredSize(new Dimension(70, 96));
			cmdRow41.setPreferredSize(new Dimension(70, 96));
			cmdRow42.setPreferredSize(new Dimension(70, 96));
			cmdRow43.setPreferredSize(new Dimension(70, 96));
			cmdRow44.setPreferredSize(new Dimension(70, 96));
			cmdRow31.setPreferredSize(new Dimension(70, 96));
			cmdRow32.setPreferredSize(new Dimension(70, 96));
			cmdRow33.setPreferredSize(new Dimension(70, 96));
			cmdRow34.setPreferredSize(new Dimension(70, 96));
			cmdRow35.setPreferredSize(new Dimension(70, 96));
			cmdRow21.setPreferredSize(new Dimension(70, 96));
			cmdRow22.setPreferredSize(new Dimension(70, 96));
			cmdRow23.setPreferredSize(new Dimension(70, 96));
			cmdRow24.setPreferredSize(new Dimension(70, 96));
			cmdRow25.setPreferredSize(new Dimension(70, 96));
			cmdRow26.setPreferredSize(new Dimension(70, 96));
			cmdRow11.setPreferredSize(new Dimension(70, 96));
			cmdRow12.setPreferredSize(new Dimension(70, 96));
			cmdRow13.setPreferredSize(new Dimension(70, 96));
			cmdRow14.setPreferredSize(new Dimension(70, 96));
			cmdRow15.setPreferredSize(new Dimension(70, 96));
			cmdRow16.setPreferredSize(new Dimension(70, 96));
			cmdRow17.setPreferredSize(new Dimension(70, 96));
			cmdDeck24.setPreferredSize(new Dimension(70, 96));
			cmdDeck23.setPreferredSize(new Dimension(70, 96));
			cmdDeck22.setPreferredSize(new Dimension(70, 96));
			cmdDeck21.setPreferredSize(new Dimension(70, 96));
			cmdDeck20.setPreferredSize(new Dimension(70, 96));
			cmdDeck19.setPreferredSize(new Dimension(70, 96));
			cmdDeck18.setPreferredSize(new Dimension(70, 96));
			cmdDeck17.setPreferredSize(new Dimension(70, 96));
			cmdDeck16.setPreferredSize(new Dimension(70, 96));
			cmdDeck15.setPreferredSize(new Dimension(70, 96));
			cmdDeck14.setPreferredSize(new Dimension(70, 96));
			cmdDeck13.setPreferredSize(new Dimension(70, 96));
			cmdDeck12.setPreferredSize(new Dimension(70, 96));
			cmdDeck11.setPreferredSize(new Dimension(70, 96));
			cmdDeck10.setPreferredSize(new Dimension(70, 96));
			cmdDeck09.setPreferredSize(new Dimension(70, 96));
			cmdDeck08.setPreferredSize(new Dimension(70, 96));
			cmdDeck07.setPreferredSize(new Dimension(70, 96));
			cmdDeck06.setPreferredSize(new Dimension(70, 96));
			cmdDeck05.setPreferredSize(new Dimension(70, 96));
			cmdDeck04.setPreferredSize(new Dimension(70, 96));
			cmdDeck03.setPreferredSize(new Dimension(70, 96));
			cmdDeck02.setPreferredSize(new Dimension(70, 96));
			cmdDeck01.setPreferredSize(new Dimension(70, 96));
			cmdReset.setPreferredSize(new Dimension(70, 96));

	    	//Add the action listener to different objects
	    	cmdMenu.addActionListener(this);
	    	cmdInstructions.addActionListener(this);
	    	cmdHistory.addActionListener(this);
	    	cmdRow11.addActionListener(this);
	    	cmdRow12.addActionListener(this);
	    	cmdRow13.addActionListener(this);
	    	cmdRow14.addActionListener(this);
	    	cmdRow15.addActionListener(this);
	    	cmdRow16.addActionListener(this);
	    	cmdRow17.addActionListener(this);
	    	cmdRow21.addActionListener(this);
	    	cmdRow22.addActionListener(this);
	    	cmdRow23.addActionListener(this);
	    	cmdRow24.addActionListener(this);
	    	cmdRow25.addActionListener(this);
	    	cmdRow26.addActionListener(this);
	    	cmdRow31.addActionListener(this);
	    	cmdRow32.addActionListener(this);
	    	cmdRow33.addActionListener(this);
	    	cmdRow34.addActionListener(this);
	    	cmdRow35.addActionListener(this);
	    	cmdRow41.addActionListener(this);
	    	cmdRow42.addActionListener(this);
	    	cmdRow43.addActionListener(this);
	    	cmdRow44.addActionListener(this);
	    	cmdRow51.addActionListener(this);
	    	cmdRow52.addActionListener(this);
	    	cmdRow53.addActionListener(this);
	    	cmdRow61.addActionListener(this);
	    	cmdRow62.addActionListener(this);
	    	cmdRow71.addActionListener(this);
	    	cmdDeck24.addActionListener(this);
	    	cmdDeck23.addActionListener(this);
	    	cmdDeck22.addActionListener(this);
	    	cmdDeck21.addActionListener(this);
	    	cmdDeck20.addActionListener(this);
	    	cmdDeck19.addActionListener(this);
	    	cmdDeck18.addActionListener(this);
	    	cmdDeck17.addActionListener(this);
	    	cmdDeck16.addActionListener(this);
	    	cmdDeck15.addActionListener(this);
	    	cmdDeck14.addActionListener(this);
	    	cmdDeck13.addActionListener(this);
	    	cmdDeck12.addActionListener(this);
	    	cmdDeck11.addActionListener(this);
	    	cmdDeck10.addActionListener(this);
	    	cmdDeck09.addActionListener(this);
	    	cmdDeck08.addActionListener(this);
	    	cmdDeck07.addActionListener(this);
	    	cmdDeck06.addActionListener(this);
	    	cmdDeck05.addActionListener(this);
	    	cmdDeck04.addActionListener(this);
	    	cmdDeck03.addActionListener(this);
	    	cmdDeck02.addActionListener(this);
	    	cmdDeck01.addActionListener(this);
	    	cmdReset.addActionListener(this);

	    	//Set word to reference the action performed
	    	cmdMenu.setActionCommand("menu");
	    	cmdInstructions.setActionCommand("instruct");
	    	cmdHistory.setActionCommand("history");
	    	cmdRow11.setActionCommand("r11");
	    	cmdRow12.setActionCommand("r12");
	    	cmdRow13.setActionCommand("r13");
	    	cmdRow14.setActionCommand("r14");
	    	cmdRow15.setActionCommand("r15");
	    	cmdRow16.setActionCommand("r16");
	    	cmdRow17.setActionCommand("r17");
	    	cmdRow21.setActionCommand("r21");
	    	cmdRow22.setActionCommand("r22");
	    	cmdRow23.setActionCommand("r23");
	    	cmdRow24.setActionCommand("r24");
	    	cmdRow25.setActionCommand("r25");
	    	cmdRow26.setActionCommand("r26");
	    	cmdRow31.setActionCommand("r31");
	    	cmdRow32.setActionCommand("r32");
	    	cmdRow33.setActionCommand("r33");
	    	cmdRow34.setActionCommand("r34");
	    	cmdRow35.setActionCommand("r35");
	    	cmdRow41.setActionCommand("r41");
	    	cmdRow42.setActionCommand("r42");
	    	cmdRow43.setActionCommand("r43");
	    	cmdRow44.setActionCommand("r44");
	    	cmdRow51.setActionCommand("r51");
	    	cmdRow52.setActionCommand("r52");
	    	cmdRow53.setActionCommand("r53");
	    	cmdRow61.setActionCommand("r61");
	    	cmdRow62.setActionCommand("r62");
	    	cmdRow71.setActionCommand("r71");
	    	cmdDeck24.setActionCommand("d24");
	    	cmdDeck23.setActionCommand("d23");
	    	cmdDeck22.setActionCommand("d22");
	    	cmdDeck21.setActionCommand("d21");
	    	cmdDeck20.setActionCommand("d20");
	    	cmdDeck19.setActionCommand("d19");
	    	cmdDeck18.setActionCommand("d18");
	    	cmdDeck17.setActionCommand("d17");
	    	cmdDeck16.setActionCommand("d16");
	    	cmdDeck15.setActionCommand("d15");
	    	cmdDeck14.setActionCommand("d14");
	    	cmdDeck13.setActionCommand("d13");
	    	cmdDeck12.setActionCommand("d12");
	    	cmdDeck11.setActionCommand("d11");
	    	cmdDeck10.setActionCommand("d10");
	    	cmdDeck09.setActionCommand("d09");
	    	cmdDeck08.setActionCommand("d08");
	    	cmdDeck07.setActionCommand("d07");
	    	cmdDeck06.setActionCommand("d06");
	    	cmdDeck05.setActionCommand("d05");
	    	cmdDeck04.setActionCommand("d04");
	    	cmdDeck03.setActionCommand("d03");
	    	cmdDeck02.setActionCommand("d02");
	    	cmdDeck01.setActionCommand("d01");
			cmdReset.setActionCommand("reset");

			//Add the layout manager. **Use null here because I had to make my own layout where the button were movable
			this.getContentPane().setLayout(null);

	    	//Set the positions of the buttons on the frame using coordinates and sizes
	    	cmdMenu.setBounds(650, 50, 100, 25);
	    	cmdInstructions.setBounds(650, 100, 115, 25);
	    	cmdHistory.setBounds(650, 150, 120, 25);
	    	lblScoreHead.setBounds(450, 100, 100, 25);
	    	lblScore.setBounds(500, 100, 100, 25);
	    	cmdDeck24.setBounds(10, 10, 70, 96);
	    	cmdDeck23.setBounds(10, 10, 70, 96);
	    	cmdDeck22.setBounds(10, 10, 70, 96);
	    	cmdDeck21.setBounds(10, 10, 70, 96);
	    	cmdDeck20.setBounds(10, 10, 70, 96);
	    	cmdDeck19.setBounds(10, 10, 70, 96);
	    	cmdDeck18.setBounds(10, 10, 70, 96);
	    	cmdDeck17.setBounds(10, 10, 70, 96);
	    	cmdDeck16.setBounds(10, 10, 70, 96);
	    	cmdDeck15.setBounds(10, 10, 70, 96);
	    	cmdDeck14.setBounds(10, 10, 70, 96);
	    	cmdDeck13.setBounds(10, 10, 70, 96);
	    	cmdDeck12.setBounds(10, 10, 70, 96);
	    	cmdDeck11.setBounds(10, 10, 70, 96);
	    	cmdDeck10.setBounds(10, 10, 70, 96);
	    	cmdDeck09.setBounds(10, 10, 70, 96);
	    	cmdDeck08.setBounds(10, 10, 70, 96);
	    	cmdDeck07.setBounds(10, 10, 70, 96);
	    	cmdDeck06.setBounds(10, 10, 70, 96);
	    	cmdDeck05.setBounds(10, 10, 70, 96);
	    	cmdDeck04.setBounds(10, 10, 70, 96);
	    	cmdDeck03.setBounds(10, 10, 70, 96);
	    	cmdDeck02.setBounds(10, 10, 70, 96);
	    	cmdDeck01.setBounds(10, 10, 70, 96);
	    	cmdReset.setBounds(10, 10, 70, 96);
	    	cmdRow71.setBounds(300, 25, 70, 96);
	    	cmdRow61.setBounds(270, 75, 70, 96);
	    	cmdRow62.setBounds(340, 75, 70, 96);
	    	cmdRow51.setBounds(240, 125, 70, 96);
	    	cmdRow52.setBounds(310, 125, 70, 96);
	    	cmdRow53.setBounds(380, 125, 70, 96);
	    	cmdRow41.setBounds(210, 175, 70, 96);
	    	cmdRow42.setBounds(280, 175, 70, 96);
	    	cmdRow43.setBounds(350, 175, 70, 96);
	    	cmdRow44.setBounds(420, 175, 70, 96);
	    	cmdRow31.setBounds(180, 225, 70, 96);
	    	cmdRow32.setBounds(250, 225, 70, 96);
	    	cmdRow33.setBounds(320, 225, 70, 96);
	    	cmdRow34.setBounds(390, 225, 70, 96);
	    	cmdRow35.setBounds(460, 225, 70, 96);
	    	cmdRow21.setBounds(150, 275, 70, 96);
	    	cmdRow22.setBounds(220, 275, 70, 96);
	    	cmdRow23.setBounds(290, 275, 70, 96);
	    	cmdRow24.setBounds(360, 275, 70, 96);
	    	cmdRow25.setBounds(430, 275, 70, 96);
	    	cmdRow26.setBounds(500, 275, 70, 96);
	    	cmdRow11.setBounds(120, 325, 70, 96);
	    	cmdRow12.setBounds(190, 325, 70, 96);
	    	cmdRow13.setBounds(260, 325, 70, 96);
	    	cmdRow14.setBounds(330, 325, 70, 96);
	    	cmdRow15.setBounds(400, 325, 70, 96);
	    	cmdRow16.setBounds(470, 325, 70, 96);
	    	cmdRow17.setBounds(540, 325, 70, 96);

	    	//Set the layout for the frame
	    	this.setTitle("Tower of Power");
	    	this.setSize(800, 500);
	    	this.setLocationRelativeTo(null);							//Centres screen
	    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);				//Sets the x button to close program
	    	this.setVisible(true);

	    	//Make the score labels background invisible
	    	lblScore.setForeground(Color.white);
	    	lblScoreHead.setForeground(Color.white);

	    	//Set gameboard buttons to be invisible except for the image on top
			cmdRow11.setOpaque(false);
			cmdRow11.setBorderPainted(false);
			cmdRow11.setContentAreaFilled(false);
			cmdRow12.setOpaque(false);
			cmdRow12.setBorderPainted(false);
			cmdRow12.setContentAreaFilled(false);
			cmdRow13.setOpaque(false);
			cmdRow13.setBorderPainted(false);
			cmdRow13.setContentAreaFilled(false);
			cmdRow14.setOpaque(false);
			cmdRow14.setBorderPainted(false);
			cmdRow14.setContentAreaFilled(false);
			cmdRow15.setOpaque(false);
			cmdRow15.setBorderPainted(false);
			cmdRow15.setContentAreaFilled(false);
			cmdRow16.setOpaque(false);
			cmdRow16.setBorderPainted(false);
			cmdRow16.setContentAreaFilled(false);
			cmdRow17.setOpaque(false);
			cmdRow17.setBorderPainted(false);
			cmdRow17.setContentAreaFilled(false);
			cmdRow21.setOpaque(false);
			cmdRow21.setBorderPainted(false);
			cmdRow21.setContentAreaFilled(false);
			cmdRow22.setOpaque(false);
			cmdRow22.setBorderPainted(false);
			cmdRow22.setContentAreaFilled(false);
			cmdRow23.setOpaque(false);
			cmdRow23.setBorderPainted(false);
			cmdRow23.setContentAreaFilled(false);
			cmdRow24.setOpaque(false);
			cmdRow24.setBorderPainted(false);
			cmdRow24.setContentAreaFilled(false);
			cmdRow25.setOpaque(false);
			cmdRow25.setBorderPainted(false);
			cmdRow25.setContentAreaFilled(false);
			cmdRow26.setOpaque(false);
			cmdRow26.setBorderPainted(false);
			cmdRow26.setContentAreaFilled(false);
			cmdRow31.setOpaque(false);
			cmdRow31.setBorderPainted(false);
			cmdRow31.setContentAreaFilled(false);
			cmdRow32.setOpaque(false);
			cmdRow32.setBorderPainted(false);
			cmdRow32.setContentAreaFilled(false);
			cmdRow33.setOpaque(false);
			cmdRow33.setBorderPainted(false);
			cmdRow33.setContentAreaFilled(false);
			cmdRow34.setOpaque(false);
			cmdRow34.setBorderPainted(false);
			cmdRow34.setContentAreaFilled(false);
			cmdRow35.setOpaque(false);
			cmdRow35.setBorderPainted(false);
			cmdRow35.setContentAreaFilled(false);
			cmdRow41.setOpaque(false);
			cmdRow41.setBorderPainted(false);
			cmdRow41.setContentAreaFilled(false);
			cmdRow42.setOpaque(false);
			cmdRow42.setBorderPainted(false);
			cmdRow42.setContentAreaFilled(false);
			cmdRow43.setOpaque(false);
			cmdRow43.setBorderPainted(false);
			cmdRow43.setContentAreaFilled(false);
			cmdRow44.setOpaque(false);
			cmdRow44.setBorderPainted(false);
			cmdRow44.setContentAreaFilled(false);
			cmdRow51.setOpaque(false);
			cmdRow51.setBorderPainted(false);
			cmdRow51.setContentAreaFilled(false);
			cmdRow52.setOpaque(false);
			cmdRow52.setBorderPainted(false);
			cmdRow52.setContentAreaFilled(false);
			cmdRow53.setOpaque(false);
			cmdRow53.setBorderPainted(false);
			cmdRow53.setContentAreaFilled(false);
			cmdRow61.setOpaque(false);
			cmdRow61.setBorderPainted(false);
			cmdRow61.setContentAreaFilled(false);
			cmdRow62.setOpaque(false);
			cmdRow62.setBorderPainted(false);
			cmdRow62.setContentAreaFilled(false);
			cmdRow71.setOpaque(false);
			cmdRow71.setBorderPainted(false);
			cmdRow71.setContentAreaFilled(false);
			cmdDeck24.setOpaque(false);
			cmdDeck24.setBorderPainted(false);
			cmdDeck24.setContentAreaFilled(false);
			cmdDeck23.setOpaque(false);
			cmdDeck23.setBorderPainted(false);
			cmdDeck23.setContentAreaFilled(false);
			cmdDeck22.setOpaque(false);
			cmdDeck22.setBorderPainted(false);
			cmdDeck22.setContentAreaFilled(false);
			cmdDeck21.setOpaque(false);
			cmdDeck21.setBorderPainted(false);
			cmdDeck21.setContentAreaFilled(false);
			cmdDeck20.setOpaque(false);
			cmdDeck20.setBorderPainted(false);
			cmdDeck20.setContentAreaFilled(false);
			cmdDeck19.setOpaque(false);
			cmdDeck19.setBorderPainted(false);
			cmdDeck19.setContentAreaFilled(false);
			cmdDeck18.setOpaque(false);
			cmdDeck18.setBorderPainted(false);
			cmdDeck18.setContentAreaFilled(false);
			cmdDeck17.setOpaque(false);
			cmdDeck17.setBorderPainted(false);
			cmdDeck17.setContentAreaFilled(false);
			cmdDeck16.setOpaque(false);
			cmdDeck16.setBorderPainted(false);
			cmdDeck16.setContentAreaFilled(false);
			cmdDeck15.setOpaque(false);
			cmdDeck15.setBorderPainted(false);
			cmdDeck15.setContentAreaFilled(false);
			cmdDeck14.setOpaque(false);
			cmdDeck14.setBorderPainted(false);
			cmdDeck14.setContentAreaFilled(false);
			cmdDeck13.setOpaque(false);
			cmdDeck13.setBorderPainted(false);
			cmdDeck13.setContentAreaFilled(false);
			cmdDeck12.setOpaque(false);
			cmdDeck12.setBorderPainted(false);
			cmdDeck12.setContentAreaFilled(false);
			cmdDeck11.setOpaque(false);
			cmdDeck11.setBorderPainted(false);
			cmdDeck11.setContentAreaFilled(false);
			cmdDeck10.setOpaque(false);
			cmdDeck10.setBorderPainted(false);
			cmdDeck10.setContentAreaFilled(false);
			cmdDeck09.setOpaque(false);
			cmdDeck09.setBorderPainted(false);
			cmdDeck09.setContentAreaFilled(false);
			cmdDeck08.setOpaque(false);
			cmdDeck08.setBorderPainted(false);
			cmdDeck08.setContentAreaFilled(false);
			cmdDeck07.setOpaque(false);
			cmdDeck07.setBorderPainted(false);
			cmdDeck07.setContentAreaFilled(false);
			cmdDeck06.setOpaque(false);
			cmdDeck06.setBorderPainted(false);
			cmdDeck06.setContentAreaFilled(false);
			cmdDeck05.setOpaque(false);
			cmdDeck05.setBorderPainted(false);
			cmdDeck05.setContentAreaFilled(false);
			cmdDeck04.setOpaque(false);
			cmdDeck04.setBorderPainted(false);
			cmdDeck04.setContentAreaFilled(false);
			cmdDeck03.setOpaque(false);
			cmdDeck03.setBorderPainted(false);
			cmdDeck03.setContentAreaFilled(false);
			cmdDeck02.setOpaque(false);
			cmdDeck02.setBorderPainted(false);
			cmdDeck02.setContentAreaFilled(false);
			cmdDeck01.setOpaque(false);
			cmdDeck01.setBorderPainted(false);
			cmdDeck01.setContentAreaFilled(false);

			//Call the disable method to set certain buttons to be inactive
			CardStartState.disabled();
    	}
    	else
    	{
    		//Empty to else to stop the multiple calls glitch from creating errors
    	}//End of loading constructor once test
    }//End of method

	//Action performed method determines which component was clicked and how to proceed
    public void actionPerformed(ActionEvent evt)
    {
    	//Test which buttons were clicked on the frame
    	if (evt.getActionCommand().equals("menu"))
    	{
    		//Declare and initialize a response variable
    		int response = 0; //Holds the yes or no value of the option pane

            //Display and option pane to continue or not
            response = JOptionPane.showConfirmDialog(null,
                    "This will end your current game. \n"
                    + "Are you sure you want to continue?",
                    "", JOptionPane.YES_NO_OPTION);

            //Determine if the user wishes to proceed
            if (response == JOptionPane.YES_OPTION)
            {
            	//Call the save method
            	Save.save();

            	//Call reset method
            	Save.reset();

            	//Disable starting buttons on menu screen
            	MenuScreen.cmdStart.setEnabled(false);
            	MenuScreen.cmdEnter.setEnabled(false);

            	//Switch frames
            	this.setVisible(false);
    			MenuScreen frame = new MenuScreen();
            }//End of user decision check
    	}
    	else if(evt.getActionCommand().equals("instruct"))
    	{
    		//Declare and initialize a response variable
    		int response = 0;	//Holds the yes or no value of the option pane

            //Display and option pane to continue or not
            response = JOptionPane.showConfirmDialog(null,
                    "This will end your current game. \n"
                    + "Are you sure you want to continue?",
                    "", JOptionPane.YES_NO_OPTION);

            //Test if the user clicked yes and move ahead
            if (response == JOptionPane.YES_OPTION)
            {
            	//Call the save method
            	Save.save();

            	//Call the reset method
            	Save.reset();

				//Disable starting buttons on menu screen
            	MenuScreen.cmdStart.setEnabled(false);
            	MenuScreen.cmdEnter.setEnabled(false);

            	//Switch frames
            	this.setVisible(false);
    			InstructScreen frame = new InstructScreen();
            }//End of user decision check
    	}
    	else if(evt.getActionCommand().equals("history"))
    	{
    		//Declare and initialize a response variable
    		int response = 0;	//Holds the yes or no value of the option pane

            //Display and option pane to continue or not
            response = JOptionPane.showConfirmDialog(null,
                    "This will end your current game. \n"
                    + "Are you sure you want to continue?",
                    "", JOptionPane.YES_NO_OPTION);

            //Test if the user clicked yes and move ahead
            if (response == JOptionPane.YES_OPTION)
            {
            	//Call the save method
            	Save.save();

            	//Call the reset method
            	Save.reset();

            	//Disable starting buttons on menu screen
            	MenuScreen.cmdStart.setEnabled(false);
            	MenuScreen.cmdEnter.setEnabled(false);

            	//Switch frames
            	this.setVisible(false);
    			HighScores frame = new HighScores();
            }//End of user decision check
    	}
    	else if(evt.getActionCommand().equals("d24"))
    	{
    		//Increment clicks immediately
    		GlobalVars.clicks++;

    		//Declare and initialize a value holder of the card to be passed
    		int cardVal = values[28];

    		//Declare and initialize a string to identify which button was clicked
    		String button = "d24";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d23"))
    	{
    		//Increment clicks immediately
    		GlobalVars.clicks++;

    		//Declare and initialize a value holder of the card to be passed
    		int cardVal = values[29];

    		//Declare and initialize a string to identify which button was clicked
    		String button = "d23";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d22"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[30];
    		String button = "d22";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d21"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[31];
    		String button = "d21";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d20"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[32];
    		String button = "d20";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d19"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[33];
    		String button = "d19";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d18"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[34];
    		String button = "d18";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d17"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[35];
    		String button = "d17";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d16"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[36];
    		String button = "d16";

			//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d15"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[37];
    		String button = "d15";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d14"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[38];
    		String button = "d14";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d13"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[39];
    		String button = "d13";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d12"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[40];
    		String button = "d12";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d11"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[41];
    		String button = "d11";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d10"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[42];
    		String button = "d10";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d09"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[43];
    		String button = "d09";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d08"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[44];
    		String button = "d08";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d07"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[45];
    		String button = "d07";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d06"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[46];
    		String button = "d06";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d05"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[47];
    		String button = "d05";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d04"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[48];
    		String button = "d04";

    		//Call the card processor method to do all further tests
      		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d03"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[49];
    		String button = "d03";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d02"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[50];
    		String button = "d02";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("d01"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[51];
    		String button = "d01";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("reset"))
    	{
    		//Declare and initialize the identifier to reset for the move deck call
    		String evt2 = "reset";

    		//Call the move deck method to automatically reset deck
    		CardProcessor.moveDeck(evt2);
    	}
    	else if(evt.getActionCommand().equals("r11"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[0];
    		String button = "r11";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r12"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[1];
    		String button = "r12";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r13"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[2];
    		String button = "r13";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r14"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[3];
    		String button = "r14";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r15"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[4];
    		String button = "r15";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r16"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[5];
    		String button = "r16";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r17"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[6];
    		String button = "r17";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r21"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[7];
    		String button = "r21";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r22"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[8];
    		String button = "r22";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r23"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[9];
    		String button = "r23";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r24"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[10];
    		String button = "r24";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r25"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[11];
    		String button = "r25";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r26"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[12];
    		String button = "r26";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r31"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[13];
    		String button = "r31";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r32"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[14];
    		String button = "r32";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r33"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[15];
    		String button = "r33";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r34"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[16];
    		String button = "r34";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r35"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[17];
    		String button = "r35";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r41"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[18];
    		String button = "r41";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r42"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[19];
    		String button = "r42";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r43"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[20];
    		String button = "r43";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r44"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[21];
    		String button = "r44";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r51"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[22];
    		String button = "r51";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r52"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[23];
    		String button = "r52";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r53"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[24];
    		String button = "r53";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r61"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[25];
    		String button = "r61";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r62"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[26];
    		String button = "r62";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}
    	else if(evt.getActionCommand().equals("r71"))
    	{
    		//Increment clicks
    		GlobalVars.clicks++;

    		//Declare and initialize card indenitifiers
    		int cardVal = values[27];
    		String button = "r71";

    		//Call the card processor method to do all further tests
    		CardProcessor.cardProcessor(cardVal, button);
    	}//End of testing which button was clicked to assign appropriate identifiers and call the processor
    }//End of action performed method
}//End of class