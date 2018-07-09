public aspect Medium {

	void around() : execution(void Menu.setMedium()){

		System.out.println("Loads Medium");
		Menu.setDifficulty(2);
		proceed();

	}

}