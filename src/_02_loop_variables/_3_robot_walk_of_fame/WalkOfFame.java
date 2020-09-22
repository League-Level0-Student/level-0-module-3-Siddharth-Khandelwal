
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot nugget = new Robot();
		
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
nugget.setX(200);
nugget.setY(100);
nugget.setSpeed(100);

		// 2. Make the robot draw a star shape. Hint: angle=144.
nugget.penDown();
nugget.setRandomPenColor();
nugget.setPenWidth(100);
for (int n = 0; n < 10; n++) {
	
	nugget.setY(100);
	nugget.setAngle(90);
for (int i = 0; i < 5; i++) {
	nugget.setRandomPenColor();

	
nugget.turn(144);
nugget.move(150);
}

nugget.penUp();

nugget.move(50);
nugget.penDown();
}
nugget.hide();
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 // http//:bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
