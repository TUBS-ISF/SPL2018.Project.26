public aspect Map1 {

	void around() : execution(void Menu.setMap11()){

		System.out.println("Map 1 Loaded");
		Menu.setMap1();
		proceed();

	}

}