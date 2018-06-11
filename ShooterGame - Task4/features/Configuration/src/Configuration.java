import java.util.List;

import interfaces.IMenu;
import loader.PluginLoader;

public class Configuration implements IMenu {


	@Override
	public void goTo(char key){

		if ((key == 'c' || key == 'C')) {
			System.out.println("Configuration");

			System.out.println("Difficulty - Press D");
			System.out.println("Map - Press M");
			System.out.println("Character - Press C");


//			boolean validKey = false;
//
//			char key = 'x';
//
//			while (!validKey) {
//				key = scanner.next(".").charAt(0);
//
//				List<IConfigurations> configOptions = PluginLoader.load(IConfigurations.class);
//				for (IConfigurations configOption : configOptions) {
//					validKey = true;
//				}
//			}

		}
	}