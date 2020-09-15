package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {

		String Hi = JOptionPane.showInputDialog(
				"Your about to go to a show, witch one do you want to go to, a magic show or a talent show? ");
		if (Hi.equalsIgnoreCase("Magic Show")) {
			JOptionPane.showMessageDialog(null,
					"You have a very long sleep a couple hours before you normally go to bed because the magician puts you to bed");
			String Frog = JOptionPane.showInputDialog(
					"When you wake up the magician asks you if you want to live forever, there is one condition, if you say \n yes you will have to live as a invincible frog who can only die to him/herself");
			if (Frog.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null,
						"You are taking your son to his classroom on his first day of school, but you drop his scissors and impale yourself. The End ");
				 
			}
			else if(Frog.equalsIgnoreCase("No")) {
				String No = JOptionPane.showInputDialog("You walk away and find a gang of friends outside, they offer you a drink, do you take it?");
				if(No.equalsIgnoreCase("Yes")) {
					JOptionPane.showMessageDialog(null, "The drink that they give you is poison and you are killed on the spot. The End");
				
				}
				else if (No.equalsIgnoreCase("No")) {
					JOptionPane.showMessageDialog(null, "You walk away and live a happy life. The End");
				
				}
			}
		} else if (Hi.equalsIgnoreCase("Talent Show")) {
			JOptionPane.showMessageDialog(null, "You make so much noise thet you get sent to jail for being too happy");
			String Jail = JOptionPane.showInputDialog("Do you want to escape from jail?");

			if (Jail.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null,
						"Your escape fails and you are sentenced to a life in prison. The End");
				System.exit(0);
			} else if (Jail.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "You are released after a year and live a happy life. The End");
				
			}

		}
		else {
			JOptionPane.showMessageDialog(null, "You typed something other then magic show or talent show");
		}
	}
}
