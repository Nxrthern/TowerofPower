/*
 *		Name:	Bradley Bowden
 *		Date:	January 23 2012
 *		Class Purpose:	Constructs the main menu screen and
 *						displays the option for how a user proceeds
 *						at the beginning of the program.
 */

//Required imports
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MenuScreen extends JFrame implements ActionListener
{
    //Creates buttons for frame
    static JButton cmdStart = new JButton("Start Game");
   	JButton cmdRules = new JButton("Rules");
   	JButton cmdHistory = new JButton("Game History");
   	JButton cmdExit = new JButton("Exit");

   	//Create checkbox for music control
   	JCheckBox chMusicCont = new JCheckBox("Music On/Off");

	//Creates components to add image to a label
	ImageIcon imgPyramid = new ImageIcon("Images/Backgrounds/pyramid.gif");
	JLabel lblImage = new JLabel(" ", imgPyramid, JLabel.CENTER);

	//Creates buttons for save name section
   	static JButton cmdEnter = new JButton("Enter");
   	JTextField txtName = new JTextField(10);
   	JLabel lblEnter = new JLabel("Enter name before proceeding: ");
   	JLabel lblComms = new JLabel("");

	//Creates an instance for the layout manager
    SpringLayout layout = new SpringLayout();

	//Constructs the frame
    public MenuScreen()
    {
       	//Adds buttons, text field, and check box to the frame
    	this.add(cmdStart);
    	this.add(cmdRules);
    	this.add(cmdHistory);
    	this.add(cmdExit);
    	this.add(chMusicCont);
    	this.add(cmdEnter);
    	this.add(txtName);
    	this.add(lblEnter);
    	this.add(lblImage);
    	this.add(lblComms);

		//Set background colours to green
    	this.getContentPane().setBackground(Color.green);
		chMusicCont.setBackground(Color.green);

    	//Set word to reference the action performed
    	cmdStart.setActionCommand("start");
    	cmdRules.setActionCommand("rules");
    	cmdHistory.setActionCommand("history");
    	cmdExit.setActionCommand("exit");
    	chMusicCont.setActionCommand("music");
    	cmdEnter.setActionCommand("enter");

		//Add the action listener to different objects
    	cmdStart.addActionListener(this);
    	cmdRules.addActionListener(this);
    	cmdHistory.addActionListener(this);
    	cmdExit.addActionListener(this);
    	chMusicCont.addActionListener(this);
    	cmdEnter.addActionListener(this);

		//Set the layout for the frame
		this.getContentPane().setLayout(layout);

    	//Set the positions of the buttons on the frame using coordinates
    	layout.putConstraint(SpringLayout.WEST, cmdStart, 10, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdStart, 380, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, chMusicCont, 345, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, chMusicCont, 440, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, cmdHistory, 140, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdHistory, 380, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, cmdRules, 280, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdRules, 380, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, cmdExit, 375, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdExit, 380, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, lblImage, 10, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblImage, 10, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, cmdEnter, 140, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, cmdEnter, 430, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, txtName, 10, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, txtName, 430, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblEnter, 10, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblEnter, 415, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblComms, 220, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblComms, 410, SpringLayout.NORTH, getContentPane());

    	//Set the layout for the frame
    	this.setSize(475,500);
    	this.setTitle("Menu Screen");
    	this.setLocationRelativeTo(null);				//Centres screen
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//Sets the x button to close program
    	this.setVisible(true);

    	//Set focus on the text field
    	txtName.grabFocus();

		//Test if the user has already entered a name when loading this screen
    	if(GlobalVars.name.equals(null) || GlobalVars.name.equals(""))
    		cmdStart.setEnabled(false);
    	else
    		cmdStart.setEnabled(true);
    }//End of constructor method

	//This method turns on or turns off the music based on user choice
	public void musicEnabler()
	{
		//Check if the check box is enabled or disabled to play music
		if(chMusicCont.isSelected() == true)
		{
			//Turn music off and stop timer
			GlobalVars.mp3.close();
			GlobalVars.timer.stop();
		}
		else
		{
			//Turn music on and start timer
			GlobalVars.mp3.play();
			GlobalVars.timer.start();
		}//End of check box state test
	}//End of music enable/disable method

	//Gets the user's name from a text field
	public void gettingName()
	{
		//Use the second flag to test for multiple calls and stop the errors
		if(GlobalVars.flag2 == false)
		{
			//Set the indicator of multiple calls to true
			GlobalVars.flag2 = true;

			//Declare and initialize local variables
			boolean alphabetic = true;
			String nameTest = "";

			//Get Name and set to uppercase
			nameTest = txtName.getText();
			nameTest = nameTest.toUpperCase();

			//Test if the name is alphabetic
			for(int x = 0; x < nameTest.length(); x++)
			{
				//Test if letters fall in the appropriate character range
				if(nameTest.charAt(x) < 65 || nameTest.charAt(x) > 90)
				{
					alphabetic = false;
				}
			}//End of alphabetic check loop

			//Test if the name field is blank
			if(nameTest.equals(null) || alphabetic == false || nameTest.length() == 0)
			{
				//Disable button if no characters have been enetered
				cmdStart.setEnabled(false);

				//Give the user an error message
				lblComms.setText("<html>Your name should have no<br>spaces or numbers, try again.");
			}
			else
			{
				//Assign a correct name value to global variable
				GlobalVars.name = nameTest;

				//Clear the communications label
				lblComms.setText("");
			}//End of incorrect name check

			//Test if name was set to a name to stop multiple method call glitch
			if(GlobalVars.name.length() > 0)
			{
				//Enable the start button upon valid entry
				cmdStart.setEnabled(true);

				//Reset the communications label
				lblComms.setText("Name accepted, proceed");
				System.out.println(GlobalVars.name);
			}//End of global name accepted test

			//Clear field and re-grab focus
			txtName.setText("");
			txtName.grabFocus();
		}
		else
		{
			//This empty else is so that when the multiple call glitch happens it does nothing
		}//End of multiple calls checker
	}//End of get name

	//This method determines which component has fired and how to proceed
    public void actionPerformed(ActionEvent evt)
    {
    	//Test which component of the frame was activated
    	if (evt.getActionCommand().equals("start"))
    	{
    		//Use a try catch block to avoid an IO error
    		try
    		{
    			//Switch frames
    			this.dispose();
            	GameScreen frame = new GameScreen();
    		}
    		catch(IOException a)
    		{
    			//Print exception
    			System.out.println("Fail");
    			System.out.println(a);
    		}//End of try catch block
    	}
    	else if(evt.getActionCommand().equals("rules"))
    	{
    		//Switch frames
    		this.dispose();
    		InstructScreen frame = new InstructScreen();
    	}
    	else if(evt.getActionCommand().equals("enter"))
    	{
      		//Call the get name method
    		gettingName();

			//Reset the flag after the method has been called so the user can try again
    		GlobalVars.flag2 = false;
    	}
    	else if(evt.getActionCommand().equals("music"))
    	{
    		//Call the music enable method
    		musicEnabler();
    	}
    	else if(evt.getActionCommand().equals("history"))
    	{
    		//Switch frames
    		this.dispose();
    		HighScores frame = new HighScores();
    	}
    	else if(evt.getActionCommand().equals("exit"))
    	{
    		//Exit the program
    		System.exit(0);
    	}//End of test component block
	}//End of action performed
}//End of class