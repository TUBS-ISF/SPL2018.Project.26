public aspect Easy {

	void around() : execution(void Menu.setEasy()){

		System.out.println("Loads Easy");
		Menu.setDifficulty(1);
		proceed();

	}

}