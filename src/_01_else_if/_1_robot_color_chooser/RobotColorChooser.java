
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot nugget = new Robot();
		nugget.setSpeed(100);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		nugget.penDown();
		for (int i = 0; i < 4; i++) {
			nugget.move(250);
			nugget.turn(90);
		}
		//3. Set the pen width to 10
		nugget.setPenWidth(10);
	
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
