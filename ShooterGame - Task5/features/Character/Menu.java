import java.io.InputStream;
import java.util.Scanner;


public class Menu {

	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
	}


	public int character() {

		System.out.println("Character 1 - Press 1");
		System.out.println("Character 2 - Press 2");

		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				// if Character1
				if (key == 1) {
					System.out.println("Character 1 Loaded");



					//SetCharacter1
					setCharacter1();
					validKey = true;
					readKey();
				}
				
				// if Character2	
				if (key == 2) {
					System.out.println("Character 2 Loaded");


					//SetCharacter2
					setCharacter2();
					validKey = true;
					readKey();}


				
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}

}