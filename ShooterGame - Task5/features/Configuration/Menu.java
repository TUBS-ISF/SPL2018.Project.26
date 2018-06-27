import java.io.InputStream;
import java.util.Scanner;

/**
 * TODO description
 */
public class Menu {

	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
	}



	public char configuration() {

		System.out.println("Difficulty - Press D");
		System.out.println("Map - Press M");
		System.out.println("Character - Press C");


		boolean validKey = false;

		char key = 'x';

		while (!validKey) {
			key = scanner.next(".").charAt(0);
			try {
				// if Character
				if ((key == 'c' || key == 'C')) {
					System.out.println("Choose Character");

					character();
					validKey = true;}
				

				// if Difficulty	
				if ((key == 'd' || key == 'D')) {
					System.out.println("Choose Difficulty");

					difficulty();
					validKey = true;}
				

				// if Map	
				if ((key == 'm' || key == 'M')) {
					System.out.println("Choose a Map");

					map();
					validKey = true;
				}


			
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;


	}
}