public aspect Difficulty {

	void around() : execution(void Menu.setDifficultyMenu()){

		Menu.difficulty();
		proceed();

	}

}