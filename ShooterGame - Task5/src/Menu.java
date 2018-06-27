import java.io.InputStream; 
import java.util.Scanner; 


public   class  Menu {
	
	private Scanner scanner;

	
	
	
	public char [][] map1 = {{'*','*','*','*','*','*','*','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ','*'},{'*','*','*','*','*','*','*','*'}};

	
	public char [][] map2 = {{'*','*','*','*','*','*','*','*','*','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ','*','*',' ',' ',' ','*'},{'*',' ',' ',' ','*','*',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*',' ',' ',' ',' ',' ',' ',' ',' ','*'},{'*','*','*','*','*','*','*','*','*','*'}};

	
	public char [][] map = map1;

	
	public int difficulty=1;

	
	public int character=1;

	
	public Menu  (InputStream is) {
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
		this.scanner = new Scanner(is);
	
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

	
	
	public void setEasy() {
		difficulty=1;
	}

	
	
	public void setMedium() {
		difficulty=2;
	}

	
	
	public void setDifficult() {
		difficulty=3;
	}

	
	
	public int map() {

		System.out.println("Map 1 - Press 1");
		System.out.println("Map 2 - Press 2");

		boolean validKey = false;

		int key = 1;

		while (!validKey) {
			key = scanner.nextInt();
			try {
				// #if Map1
				if (key == 1) {
					System.out.println("Map 1 Loaded");
					
					
					//SetMap1
					setMap1();
					
					validKey = true;
					readKey();
					}
					

				// #endif
				// #if Map2
				if (key == 2) {
					
					System.out.println("Map 2 Loaded");
					
					//SetMap2
					setMap2();
					
					validKey = true;
					readKey();}
					

				
				// #endif
			}catch(Exception e){
				System.out.println("Press a valid Key");
			}
		}

		return key;
	}

	

	public void setMap1() {
		map= map1;
	}

	
	
	
	
	public void setMap2() {
		map= map2;
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

	
	
	public void setCharacter1() {
		character=1;
	}

	
	
	public void setCharacter2() {
		character=2;
	}


}
