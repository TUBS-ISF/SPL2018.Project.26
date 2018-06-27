import java.io.InputStream;
import java.util.Scanner;

/**
 * TODO description
 */
public class Menu {
	
	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
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

}