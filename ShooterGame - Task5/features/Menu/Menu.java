import java.io.InputStream;
import java.util.Scanner;


public class Menu {
	private Scanner scanner;
	
	
	public char [][] map1 = {{'*','*','*','*','*','*','*','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*','*','*','*','*','*','*','*'}};
	public char [][] map2 = {{'*','*','*','*','*','*','*','*','*','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ','*','*',' ',' ',' ','*'},{'*',' ',' ',' ','*','*',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*','*','*','*','*','*','*','*','*','*'}};
	public char [][] map = map1;
	public int difficulty=1;
	public int character=1;


	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
	}

	public char readKey() {

		System.out.println("Play - Press P");
		System.out.println("Configuration - Press C");

		boolean validKey = false;

		char key = 'x';

		while (!validKey) {
			key = scanner.next(".").charAt(0);
			try {
			// if Configuration

			if ((key == 'c' || key == 'C')) {
			System.out.println("Configuration");

					configuration();
					validKey = true;
			}
			
		 if ((key == 'p' || key == 'P')) {

				System.out.println("The Game Starts");

					//Starts the game
					Game game = new Game(map, difficulty, character);
//
				game.start();
					validKey = true;
				}

			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
}