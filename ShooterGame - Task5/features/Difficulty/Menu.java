import java.io.InputStream;
import java.util.Scanner;

/**
 * TODO description
 */
public class Menu {

	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
	}
	
public int difficulty() {
		
		//Difficulty will change the number of enemys.

		System.out.println("Easy - Press 1");
		System.out.println("Medium - Press 2");
		System.out.println("Difficult - Press 3");


		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				// if Easy
				if (key == 1) {
					System.out.println("Loads Easy");
					
					
					//SetEasy
					setEasy();
					validKey = true;
					readKey();
				}
					
				// if Medium
				if (key == 2) {
					System.out.println("Loads Medium");
					
					
					//SetMedium
					setMedium();
					validKey = true;
					readKey();}
				
				// if Difficult	
				if (key == 3) {
					System.out.println("Loads Difficult");
					
					
					//SetDifficult
					setDifficult();
					validKey = true;
					readKey();}
				
				
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
}