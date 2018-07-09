public aspect Character2 {

	void around() : execution(void Menu.setCharacter22()){

		System.out.println("Character 2 Loaded");
		Menu.setCharacter2();
		proceed();

	}

}