package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String Mood = JOptionPane.showInputDialog("Are you happy right now ");
		if (Mood.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		} else {
			String Hi = JOptionPane.showInputDialog("Do you want to be happy?");

			if (Hi.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			else if(Hi.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
		
		
		
		
		
		
		
		}

	}

}  
