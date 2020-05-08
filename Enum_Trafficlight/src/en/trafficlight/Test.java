package en.trafficlight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		Trafficlight person = new Trafficlight();
//		person.letsPlay();
		
		Scanner reader3 = new Scanner(System.in);
		System.out.println("Choose your method: [1] You choose the color, [2] Get a surprise color!, [3] You play a guess game with me :), [4] Everything explodes!");
		
		try {
			int number3 = reader3.nextInt();
			
			if (number3 == 1) {
				person.readTheColor();
			} else if (number3 == 2) {
				person.shouldYouPass();
			} else if (number3 == 3) { 
				person.letsPlay();
			}else if (number3 == 4) {
				System.out.println("EXPLOSION!");
			} else {
				throw new Exception("Wrong number!");
			}
		} catch (InputMismatchException err) {
			throw new Exception ("Wrong answer!!");
		}
	}

}
