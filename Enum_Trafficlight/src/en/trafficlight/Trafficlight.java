package en.trafficlight;

import java.util.InputMismatchException;

/* KURZE Fingerübung Ampel: mit ENUM Ampelphasen  -evtl mit Innerem Enum in der Ampelklasse*/

import java.util.Scanner;

public class Trafficlight {
	
	public enum Color {RED, YELLOW, GREEN}
	
	public void readTheColor() throws Exception {
		Scanner reader = new Scanner(System.in);
		System.out.println("What color is the trafficl ight?");
		String colorTraffic = reader.nextLine();
		
		colorTraffic = colorTraffic.toUpperCase();
		try {
			Color choosedColor = Color.valueOf(colorTraffic);
			System.out.println("The light is " + choosedColor);
			
			switch (choosedColor) {
			case RED:
				System.out.println("You should not pass!!!!");
				break;
			case YELLOW:
				System.out.println("There is no yellow color for the pedestrian.");
				break;
			case GREEN:
				System.out.println("You are free to go anywhere!");
				break;
			}
		} catch (IllegalArgumentException err) {
			throw new Exception("The traffic light only has three colors: red, yellow and green ... jackass!");
		}
	}
	
	public void shouldYouPass() {
		
		Color choosedColor = null;
		int number = (int) (Math.random()*(3));
		
		if (number == 0) {
			choosedColor = Color.RED;
		} else if (number == 1) {
			choosedColor = Color.YELLOW;
		} else if (number == 2) {
			choosedColor = Color.GREEN;
		}
		
		chooseColor(choosedColor);
	}
	
	public void chooseColor(Color choosedColor) {
		switch (choosedColor) {
		case RED:
			System.out.println("The light is " + choosedColor + ". Therefore ...");
			System.out.println("You should not pass!!!!");
			break;
		case YELLOW:
			System.out.println("The light is " + choosedColor + ". Therefore ...");
			System.out.println("There is no yellow color for the pedestrian.");
			break;
		case GREEN:
			System.out.println("The light is " + choosedColor + ". Therefore ...");
			System.out.println("You are free to go anywhere!");
		}
	}
	
	public void letsPlay() throws Exception {
			
			Color choosedColor = null;
			int number = (int) (Math.random()*(3));
			
			if (number == 0) {
				choosedColor = Color.RED;
			} else if (number == 1) {
				choosedColor = Color.YELLOW;
			} else if (number == 2) {
				choosedColor = Color.GREEN;
			}
			
			Scanner reader2 = new Scanner(System.in);
			System.out.println("Choose a color: [1]Red, [2]Green");
			
			try {
				int number2 = reader2.nextInt();
				
				if (number == 0 && number2 == 1) {
					System.out.println("You choose red, and ...");
					System.out.println("The light is " + choosedColor + ". Therefore ...");
					System.out.println("Nothing happens! You are just wasting your time.");
				} else if (number == 0 && number2 == 2) {
					System.out.println("You choose green, and ...");
					System.out.println("The light is " + choosedColor + ". Therefore ...");
					System.out.println("Good Job! You behave like an adult!");
				} else if (number == 1 && number2 == 1) {
					System.out.println("You choose red, and ...");
					System.out.println("The light is " + choosedColor + ". Therefore ...");
					System.out.println("Good boy/girl! That was the correct decission!");
				} else if (number == 1 && number2 == 2) {
					System.out.println("You choose green, and ...");
					System.out.println("The light is " + choosedColor + ". Therefore ...");
					System.out.println("Not the best decission you made today, chap!");
				} else if (number == 2 &&  number2 == 1) {
					System.out.println("You choose red, and ...");
					System.out.println("The light is " + choosedColor + ". Therefore ...");
					System.out.println("Probably you will live to see another day.");
				} else if (number == 2 && number2 == 2) {
					System.out.println("You choose green, and ...");
					System.out.println("The light is " + choosedColor + ". Therefore ...");
					System.out.println("The world is a cruel place and follows the Darwin's laws");
				} else {
					throw new Exception ("Come on, be cooperative! Choose 1 or 2 :)");
				}
				
			} catch (InputMismatchException err) {
				throw new Exception ("Nevermind, you loose :(");
			}
//			chooseColor(choosedColor);
	}
	
}
