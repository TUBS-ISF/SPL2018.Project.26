import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import interfaces.IMenu;
import loader.PluginLoader;


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
			List<IMenu> menuOptions = PluginLoader.load(IMenu.class);
			for (IMenu menuOption : menuOptions) {
				try {
					menuOption.goTo(key);
					validKey = true;
					break;

				}catch(Exception e){
					System.out.println("Press a valid Key");
				}
			}
		}

		return key;
	}
}
