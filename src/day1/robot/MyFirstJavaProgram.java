package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot mech = new Robot();
mech.setSpeed(10);
mech.penDown();
for (int i=0;i<5;i++) {
mech.setRandomPenColor();
mech.move(200);
mech.turn(70);

}
	}
}
