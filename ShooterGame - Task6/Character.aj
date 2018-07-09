public aspect Character {

	void around() : execution(void Menu.setCharacterMenu()){

		Menu.character();
		proceed();

	}

}