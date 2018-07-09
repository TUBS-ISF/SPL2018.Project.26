public aspect Map2 {

	void around() : execution(void Menu.setMap22()){

		System.out.println("Map 2 Loaded");
		Menu.setMap2();
		proceed();
		

	}

}