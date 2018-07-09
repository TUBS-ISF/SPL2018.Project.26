public aspect Configuration {

	void around() : execution(void Menu.setConfigurationMenu()){
		
		System.out.println("Configuration");
		Menu.configuration();
		proceed();

	}

}