package day5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rand=new Random().nextInt(4);
		// 3. Print out this variable
System.out.println();
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Aproach,seeker of knowlege, and ask.");
		// 5. If the random number is 0
if (rand==0) {
	JOptionPane.showMessageDialog(null, "it is so without a doubt");
}
		// -- tell the user "Yes"

		// 6. If the random number is 1
if (rand==1) {
	JOptionPane.showMessageDialog(null, "not in your wildest dreams");}

		// -- tell the user "No"

		// 7. If the random number is 2
if (rand==2) {
	JOptionPane.showMessageDialog(null, "Perhaps you should ask google");}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
if (rand==3) {
	JOptionPane.showMessageDialog(null, "most likely not");}
		// -- write your own answer
}
	}




