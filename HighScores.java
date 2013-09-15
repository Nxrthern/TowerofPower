/**
 *		Name:	Bradley Bowden
 *		Date:	January 23 2012
 *		Class Purpose:	This class will construct a high score
 *						screen as well as contain the loading function
 *						of displaying the high scores from a
 *						file.
 */

//Required imports
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class HighScores extends JFrame implements ActionListener
{
	//Creates buttons for frame
    JButton cmdMenu = new JButton("Menu");
   	JButton cmdLoad = new JButton("Load");

   	//Create checkbox for music control
   	static JCheckBox chMusicCont = new JCheckBox("Music On/Off");

	//Creates the Jlabel that displays name and score
	JLabel lblFinal = new JLabel("");
	JLabel lblName = new JLabel("Name");
	JLabel lblScore = new JLabel("Score");
	static JLabel lblCurName = new JLabel("");
	static JLabel lblCurScore = new JLabel("");
	JLabel lblHighScoreHead = new JLabel("HIGH SCORES");
	static JLabel lblRank = new JLabel("");
	static JLabel lblNameTable = new JLabel("<html>");
	static JLabel lblScoreTable = new JLabel("<html>");

	//Declare and initialize arrays
	static String [] names;
	static String [] scores2;
	static String [] data;
	static int [] scores;

	//Creates buttons for save name section
   	JButton cmdExit = new JButton("Exit");

   	//Create an instance of the layout manager
   	SpringLayout layout = new SpringLayout();

	//Constructs screen
    public HighScores()
    {
    	//Adds buttons, text field, and check box to the frame
    	this.add(cmdMenu);
    	this.add(cmdLoad);
    	this.add(chMusicCont);
    	this.add(cmdExit);
    	this.add(lblFinal);
    	this.add(lblName);
    	this.add(lblScore);
    	this.add(lblCurName);
    	this.add(lblCurScore);
    	this.add(lblHighScoreHead);
    	this.add(lblRank);
    	this.add(lblNameTable);
    	this.add(lblScoreTable);

		//Set background colours to green
    	this.getContentPane().setBackground(Color.red);
		chMusicCont.setBackground(Color.red);

    	//Set word to reference the action performed
    	cmdMenu.setActionCommand("menu");
    	cmdLoad.setActionCommand("loader");
    	cmdExit.setActionCommand("exit");
    	chMusicCont.setActionCommand("music");

		//Add the action listener to different objects
    	cmdMenu.addActionListener(this);
    	cmdLoad.addActionListener(this);
    	cmdExit.addActionListener(this);
    	chMusicCont.addActionListener(this);

		//Set the layout for the frame
		this.getContentPane().setLayout(layout);

    	//Set the positions of the buttons on the frame using coordinates
    	layout.putConstraint(SpringLayout.WEST, cmdMenu, 380, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdMenu, 50, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, chMusicCont, 345, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, chMusicCont, 330, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, cmdExit, 380, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdExit, 150, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, cmdLoad, 380, SpringLayout.WEST, getContentPane());
    	layout.putConstraint(SpringLayout.NORTH, cmdLoad, 100, SpringLayout.NORTH, getContentPane());

    	layout.putConstraint(SpringLayout.WEST, lblFinal, 55, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblFinal, 35, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblName, 50, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblName, 10, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblScore, 170, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblScore, 10, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblCurName, 60, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblCurName, 30, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblCurScore, 180, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblCurScore, 30, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblHighScoreHead, 145, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblHighScoreHead, 80, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblRank, 50, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblRank, 280, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblNameTable, 120, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblNameTable, 100, SpringLayout.NORTH, getContentPane());

		layout.putConstraint(SpringLayout.WEST, lblScoreTable, 200, SpringLayout.WEST, getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblScoreTable, 100, SpringLayout.NORTH, getContentPane());

    	//Set the layout for the frame
    	this.setSize(475,400);
    	this.setTitle("HIGH SCORE");
    	this.setLocationRelativeTo(null);				//Centres screen
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//Sets the x button to close program
    	this.setVisible(true);
    }//End of constructor method

	//This method will return the length of the file to the loader method
    public static int getFileLength(String filename) throws IOException
    {
    	//Declare and initialize local variable
		int fileLength = 0;

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

	//This method will find the current user's info to display their rank
    public static int searchName()
    {
    	//Declare and initialize rank and temp
    	int rank = 0;

    	//Search the array with a loop for the user's name
    	for(int x = 0; x < names.length; x++)
    	{
    		//Test if the user's current info matches the array info
    		if(names[x].equals(GlobalVars.name) && scores[x] == GlobalVars.score)
    		{
    			//Test if the score is top score
    			if(GlobalVars.score == 566)
    				rank = 1;		//Give the player rank 1
    			else
    				rank = x + 1;	//Determine the rank of player
    		}
    		else if(rank == 0)
    			rank = 500;		//Set rank to 500 if info doesn't match
    	}//End of search loop

    	//Return rank
    	return rank;
    }//End of search name method

	//This method will turn the music on or off based on user choice
    public static void musicEnabler()
    {
    	//Check if the check box is enabled or disabled to play music
		if(chMusicCont.isSelected() == true)
		{
			//Stop music
			GlobalVars.mp3.close();
			GlobalVars.timer.stop();
		}
		else
		{
			//Play music
			GlobalVars.mp3.play();
			GlobalVars.timer.start();
		}//End of music play stop check
    }//End of music enabler method

	//This method will read the data from a file in and seperate the scores from the names
	//Also this method transfers the number data from a string array to an integer array for sorting
    public static void getTransferScore(String filename) throws IOException
    {
    	//Declare and initialize a temporary variable used to get scores not names
		int y = 0;

    	//Create a read object
		BufferedReader input = new BufferedReader(new FileReader(filename));

		//Get the file length from above method
		int fileLength = getFileLength(filename);

		//Initialize scores
		data = new String[fileLength];
		scores = new int[fileLength / 2];
		scores2 = new String[fileLength / 2];

		//Loop to get all data into array
		for (int x = 0; x < data.length; x++)
			data[x] = input.readLine();

		//Close the file
		input.close();

		//Transfer the string scores to the int array
		for(int x = 1; x < data.length; x+=2)
		{
			//Get only the scores from data
			scores[y] = Integer.parseInt(data[x]);

			//Incriment y
			y++;
		}//End of scores transfer
    }//End of get transfer score method

	//This method take the previously written data from a file and seperates the names into another string array
    public static void getNames(String filename) throws IOException
    {
    	//Declare and initialize temporary variable y to help get names only from the data
		int y = 0;

    	//Get the file length from above method
		int fileLength = getFileLength(filename);

		//Initialize names
		names = new String[fileLength / 2];

		//Loop to get names into array
		for (int x = 0; x < data.length; x+=2)
		{
			//Get only the names from the data
			names[y] = data[x];

			//Incriment y
			y++;
		}//End of names loop
    }//End of get names method

	//This method will sort the arrays based on score to display the top ten players
    public static void sortArrays()
    {
    	//Declare and initialize temporary variables
    	int temp = 0;
    	String tempo = "";
    	boolean sorted = false;

		//Use a do to traverse the array many time until the highest score is at index 0
		do
		{
			//Set sorted to true at the start of each cycle
			sorted = true;

	    	//Traverse the array to compare aplabetically
			for (int x = 0; x < scores.length - 1; x++)
			{
				//Determine if which score is higher and swap
				if(scores[x] < scores[x+1])
				{
					//Swap the scores for top ten
					temp = scores[x];
					scores[x] = scores[x+1];
					scores[x+1] = temp;

					//Swap the names to match their scorer
					tempo = names[x];
					names[x] = names[x+1];
					names[x+1] = tempo;

					//If this process is still happening set sorted to false
					sorted = false;
				}//Test for alphabetic value
			}//End of traverse loop
		}while(sorted != true);
    }//End of sort arrays method

	//This method prints the top 10 players and scores to the screen
    public static void print()
    {
    	//Declare and initialize rank
    	int rank = 0;

    	//Clear labels before proceeding
    	lblScoreTable.setText("<html>");
    	lblNameTable.setText("<html>");

    	//Only print top 10, do a test to find that
    	if(names.length <= 10)
    	{
    		//Print the array for test
    		for(int x = 0; x < names.length; x++)
    		{
    			//Print the high scores chart
    			lblNameTable.setText(lblNameTable.getText() + names[x] + "<br>");
    			lblScoreTable.setText(lblScoreTable.getText() + scores[x] + "<br>");
    		}//End of print high score loop
    	}
    	else
    	{
    		//Print the array for test
    		for(int x = 0; x < 10; x++)
    		{
    			//Print the high scores chart
    			lblNameTable.setText(lblNameTable.getText() + names[x] + "<br>");
    			lblScoreTable.setText(lblScoreTable.getText() + scores[x] + "<br>");
    		}//End of print high score loop
    	}//End of top 10 test

    	//Print the current user's information
    	lblCurName.setText(GlobalVars.name);
    	lblCurScore.setText("" + GlobalVars.score);

    	//Print rank
    	rank = searchName();

    	//Test if the user set a new highscore
    	if(rank <= 10)
    		lblRank.setText("You are rank " + rank + ". NEW HIGH SCORE!");
    	else
    		lblRank.setText("You are rank " + rank + ". Sorry you did not make top ten.");

    	//Clear score and name officially
    	GlobalVars.score = 0;
    	GlobalVars.name = "";
    }//End of the print method

	//The scores loader method acts as the main processor for
	//loading the scores from a file and displaying them
    public static void scoresLoader() throws IOException
    {
    	//Call get scores
    	getTransferScore("txt\\savegame.txt");

    	//Call get names
    	getNames("txt\\savegame.txt");

    	//Call the sorter method to find the top 10
    	sortArrays();

		//Call the print method
    	print();
    }//End of scores loader method

	//The action performed method determines which component has fired and how to proceed
    public void actionPerformed(ActionEvent evt)
    {
    	//Test which command is returned
    	if(evt.getActionCommand().equals("menu"))
    	{
    		//Switch frames
    		this.setVisible(false);
    		MenuScreen frame = new MenuScreen();
    	}
    	else if(evt.getActionCommand().equals("loader"))
    	{
    		//Use a try catch to avoid io error
    		try
    		{
    			//Call the scores loader method
    			scoresLoader();
    		}
    		catch(Exception a)
    		{
    			//Print failure
    			System.out.println("Fail");
    			System.out.println(a);
    		}//End of try catch block
    	}
    	else if(evt.getActionCommand().equals("music"))
    	{
    		//Call the music enabler method
    		musicEnabler();
    	}
    	else if(evt.getActionCommand().equals("exit"))
    	{
    		//Exit the program
    		System.exit(0);
    	}//End of component tester
    }//End of action performed method
}//End of class