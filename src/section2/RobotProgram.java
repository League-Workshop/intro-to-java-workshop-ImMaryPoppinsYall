package section2;

import org.jointheleague.graphical.robot.Robot;

public class RobotProgram {
public static void main(String[] args) {
	Robot bb8 = new Robot();
	bb8.miniaturize();
	bb8.setSpeed(100);
	bb8.penDown();
	bb8.setRandomPenColor();
	for (int i = 0; i < 4; i++) {
		bb8.move(250);
		bb8.turn(90);	
	}
	
    bb8.sparkle();
  }
}
