package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What did Star-Lord do to distract Ronan from destroying the universe?");
		// 3.  Use an if statement to check if their answer is correct
		if (answer.equalsIgnoreCase("He challenges him in a dance off")) {
			score = score + 1;
		
		// 4.  if the user's answer is correct
			JOptionPane.showMessageDialog(null, "Correct! 1 Point");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		answer = JOptionPane.showInputDialog("What was the name of Star-Lord's mom?");
		if (answer.equalsIgnoreCase("Meredith Quill")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! 1 Point");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		answer = JOptionPane.showInputDialog("Who always makes a cameo in every Marvel movie?");
		if (answer.equalsIgnoreCase("Stan Lee")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! 1 Point");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		answer = JOptionPane.showInputDialog("Who makes an appearance during the battle in Captain America: Civil War?");
		if (answer.equalsIgnoreCase("Spider-Man")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! 1 Point");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		answer = JOptionPane.showInputDialog("What happened after Thanos snapped his fingers with the Infinity Gaunlet?");
		if (answer.equalsIgnoreCase("Everyone dies")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct! 1 Point");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "You got " + score + " out of 5");
	}
}
