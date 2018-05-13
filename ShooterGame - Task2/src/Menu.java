import java.io.InputStream;
import java.util.Scanner;

import properties.PropertyManager;

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
				if (PropertyManager.getProperty("Configuration") && (key == 'c' || key == 'C')) {
					System.out.println("Configuration");
					
					configuration();
					validKey = true;

					
				}else if (PropertyManager.getProperty("Play") && (key == 'p' || key == 'P')) {
					
					System.out.println("The Game Starts");
					
					//Starts the game
					Game game = new Game(map, difficulty, character);

					game.start();
					validKey = true;


				}else {
					System.out.println("Press a valid key");
					readKey();

				}
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
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
				if (PropertyManager.getProperty("Character") && (key == 'c' || key == 'C')) {
					System.out.println("Choose Character");
					
					character();
					validKey = true;

					
				}else if (PropertyManager.getProperty("Difficulty") && (key == 'd' || key == 'D')) {
					System.out.println("Choose Difficulty");
					
					difficulty();
					validKey = true;

					
				}else if (PropertyManager.getProperty("Map") && (key == 'm' || key == 'M')) {
					System.out.println("Choose a Map");
					
					map();
					validKey = true;

					
				}else {
					System.out.println("Press a valid key");
					readKey();

				}
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
		
		
	}
	
	public int map() {

		System.out.println("Map 1 - Press 1");
		System.out.println("Map 2 - Press 2");

		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				if (PropertyManager.getProperty("Map1") && key == 1) {
					System.out.println("Map 1 Loaded");
					
					
					//SetMap1
					map= map1;
					
					validKey = true;
					readKey();
					

					

				}else if (PropertyManager.getProperty("Map2") && key == 2) {
					
					System.out.println("Map 2 Loaded");
					
					//SetMap2
					map=map2;
					
					validKey = true;
					readKey();
					

					
				}else {
					System.out.println("Press a valid key");
					readKey();

				}
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
	
	public int character() {

		System.out.println("Character 1 - Press 1");
		System.out.println("Character 2 - Press 2");

		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				if (PropertyManager.getProperty("Character1") && key == 1) {
					System.out.println("Character 1 Loaded");
					

					
					//SetCharacter1
					character=1;
					validKey = true;
					readKey();
					
				}else if (PropertyManager.getProperty("Character2") && key == 2) {
					System.out.println("Character 2 Loaded");


					//SetCharacter2
					character=2;
					validKey = true;
					readKey();


				}else {
					System.out.println("Press a valid key");
					readKey();

				}
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
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
				if (PropertyManager.getProperty("Easy") && key == 1) {
					System.out.println("Loads Easy");
					
					
					//SetEasy
					difficulty=1;
					validKey = true;
					readKey();
					

				}else if (PropertyManager.getProperty("Medium") && key == 2) {
					System.out.println("Loads Medium");
					
					
					//SetMedium
					difficulty=2;
					validKey = true;
					readKey();
					
				}else if (PropertyManager.getProperty("Difficult") && key == 3) {
					System.out.println("Loads Difficult");
					
					
					//SetDifficult
					difficulty=3;
					validKey = true;
					readKey();
					
				}else {
					System.out.println("Press a valid key");
					readKey();

				}
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}
}
