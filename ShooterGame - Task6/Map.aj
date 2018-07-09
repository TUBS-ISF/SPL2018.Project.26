public aspect Map {

	void around() : execution(void Menu.setMapMenu()){

		Menu.map();
		proceed();

	}

}