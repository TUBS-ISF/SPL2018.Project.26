import java.io.InputStream;
import java.util.Scanner;


public class Menu {
	private static Scanner scanner;
	
	
	public static char [][] map1 = {{'*','*','*','*','*','*','*','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*','*','*','*','*','*','*','*'}};
	public static char [][] map2 = {{'*','*','*','*','*','*','*','*','*','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ','*','*',' ',' ',' ','*'},{'*',' ',' ',' ','*','*',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*','*','*','*','*','*','*','*','*','*'}};
	public static char [][] map = map1;
	public static int difficulty=1;
	public static int character=1;


	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
	}

	public static char readKey() {

		System.out.println("Play - Press P");
		System.out.println("Configuration - Press C");

		boolean validKey = false;

		char key = 'x';

		while (!validKey) {
			key = scanner.next(".").charAt(0);
			try {
			//if Configuration

			if ((key == 'c' || key == 'C')) {

					setConfigurationMenu();
					validKey = true;
			}
			
			//if Play	
		 if ((key == 'p' || key == 'P')) {

				System.out.println("The Game Starts");

					//Starts the game
					Game game = new Game(map, difficulty, character);

				game.start();
					validKey = true;
				}

			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
	
	public static void setConfigurationMenu() {
		
	}
	
	

	public static char configuration() {
		
		System.out.println("Difficulty - Press D");
		System.out.println("Map - Press M");
		System.out.println("Character - Press C");


		boolean validKey = false;

		char key = 'x';

		while (!validKey) {
			key = scanner.next(".").charAt(0);
			try {
				//if Character
				if ((key == 'c' || key == 'C')) {
					System.out.println("Choose Character");
					
					setCharacterMenu();
					validKey = true;}

				//if Difficulty	
				if ((key == 'd' || key == 'D')) {
					System.out.println("Choose Difficulty");
					
					setDifficultyMenu();
					validKey = true;}

				//if Map	
				if ((key == 'm' || key == 'M')) {
					System.out.println("Choose a Map");
					
					setMapMenu();
					validKey = true;
				}

				
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
		
		
	}

	public static void setMapMenu() {

	}

	public static void setDifficultyMenu() {

	}

	public static void setCharacterMenu() {

	}
	
	public static int map() {

		System.out.println("Map 1 - Press 1");
		System.out.println("Map 2 - Press 2");

		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				if (key == 1) {

					setMap11();
					readKey();
				}

				if (key == 2) {

					setMap22();
					readKey();
				}

			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
	
	public static void setMap11() {
		
	}
	
	public static void setMap22() {
		
	}
	
	public static void setMap1() {
		
		map=map1;
	}
	
	public static void setMap2() {

		map=map2;
	}
	
	public static int character() {

		System.out.println("Character 1 - Press 1");
		System.out.println("Character 2 - Press 2");

		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				if (key == 1) {
					
					setCharacter11();
					validKey = true;
					readKey();
				}
				if (key == 2) {
					//SetCharacter2
					setCharacter22();
					validKey = true;
					readKey();}
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
	
	public static void setCharacter11() {
		
	}
	
	public static void setCharacter22() {
		
	}
	
	public static void setCharacter1() {
		
		character=1;
	}
	
	public static void setCharacter2() {

		character=2;
	}
	
	public static int difficulty() {
		
		//Difficulty will change the number of enemys.

		System.out.println("Easy - Press 1");
		System.out.println("Medium - Press 2");
		System.out.println("Difficult - Press 3");


		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				if (key == 1) {					
					
					//SetEasy
					setEasy();
					validKey = true;
					readKey();
				}

				if (key == 2) {
					
					
					//SetMedium
					setMedium();
					validKey = true;
					readKey();}
				if (key == 3) {
					
					
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
	
	public static void setEasy() {

	}

	public static void setMedium() {

	}

	public static void setDifficult() {

	}
	
	public static void setDifficulty(int diff) {
		difficulty = diff;
	}
}