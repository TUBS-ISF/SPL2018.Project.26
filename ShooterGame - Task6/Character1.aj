public aspect Character1 {

	void around() : execution(void Menu.setCharacter11()){

		System.out.println("Character 1 Loaded");
		Menu.setCharacter1();
		proceed();

	}

}