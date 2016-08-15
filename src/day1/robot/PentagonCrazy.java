package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
	
Robot boii = new Robot ();
		
boii.penDown();
		// 8. Make the robot go at maximum speed (10)

		// 9. Set the pen to a color that you like for the shape


Integer bob = 5;
		Integer ralph = 360/bob;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.

			// 2. Move the robot 200 pixels
	boii.move(200);
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
			// 6. Turn the robot the amount in your angle variable
	boii.turn(ralph);
			// 11. Turn the robot one more degree

	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}