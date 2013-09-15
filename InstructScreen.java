/**
 * 		Name:	Bradley Bowden
 *		Date: January 23 2012
 *		Class Purpose:	This class constructs a frame to
 *						display the rules from a file.
 */

//Required imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class InstructScreen extends JFrame implements ActionListener
{
	//Create objects used on the GUI screen
    JButton cmdBack = new JButton("Back");
    JLabel lblRules = new JLabel();

	//Create an instance of the layout manager
	SpringLayout layout = new SpringLayout();

	//Constructs the frame
    public InstructScreen()
    {
    	//Add the GUI components to the screen
        this.add(cmdBack);
        this.add(lblRules);

        //Set background colour to green
    	this.getContentPane().setBackground(Color.green);

		//Set the action commands
		cmdBack.setActionCommand("back");

        //Add the action listeners
        cmdBack.addActionListener(this);

		//Set the layout for the frame
        this.getContentPane().setLayout(layout);

		//Set where the objects go on the form
        layout.putConstraint(SpringLayout.WEST, cmdBack, 270, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, cmdBack, 10, SpringLayout.NORTH, getContentPane());

        layout.putConstraint(SpringLayout.WEST, lblRules, 45, SpringLayout.WEST, getContentPane());
        layout.putConstraint(SpringLayout.NORTH, lblRules, 10, SpringLayout.NORTH, getContentPane());

        //Call the setup methods for the frame object
		this.setSize(534,347);
		this.setTitle("Instructions");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Call the method to open rules
        openRules("txt\\rules.txt");
    }//End of constructor method

	//This method will open the rules file and read its contents to a label on construction
    private void openRules(String filename)
    {
    	//Use a try catch block to avoid an IO error
    	try
    	{
    		//Declare and initialize variable
            String line = "";

            //Construct a write object
            BufferedReader read = new BufferedReader(new FileReader(filename));

			//Loop until the file returns empty
            while(line != null)
            {
                //Read line from file
                line = read.readLine();

				//Test if the string has reached null to stop update printing
                if (line != null)
                    //Concatenate the text together onto the label from file
                    lblRules.setText(lblRules.getText() + line);
            }//End of while loop

            //Close the file
            read.close();
    	}
    	catch(Exception e)
    	{
    		//Give an indicator of the error
    		e.printStackTrace();
    	}//End of try catch block
    }//End of openRules method

	//Action performed method will determine which component has fired and how to proceed
    public void actionPerformed(ActionEvent evt)
    {
    	//Test which command has returned
    	if(evt.getActionCommand().equals("back"))
    	{
        	//Hides the rules screen
        	this.setVisible(false);

        	//Switch back to menu
        	MenuScreen frame = new MenuScreen();
    	}//End of component tester
    }//End of actionPerformed method
}//End of class