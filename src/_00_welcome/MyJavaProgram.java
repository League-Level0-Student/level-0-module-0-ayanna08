package _00_welcome;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot ayanna = new Robot();
		ayanna.setSpeed(5);
		ayanna.setRandomPenColor();
		ayanna.penDown();
		for (int i = 0; i < 4; i++) {
			ayanna.move(100);
			ayanna.turn(90);
		}
		
	
		
		
	}
}
