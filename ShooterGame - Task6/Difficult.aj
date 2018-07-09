public aspect Difficult {

	void around() : execution(void Menu.setDifficult()){

		System.out.println("Loads Difficult");
		Menu.setDifficulty(3);
		proceed();

	}

}