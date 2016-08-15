package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot boii = new Robot ();
		
boii.penDown();
		boii.setSpeed(10);
		
for (int i = 0; i < 100; i++) {
	

	boii.setPenWidth(i);		
	boii.setRandomPenColor();
	boii.move(5*i);
			
	boii.turn(360/8);
			boii.hide();
	

}

	}
}
