public class Game {
	
	char map[][];
	int difficulty;
	int character;
	int playerPositionX;
	int playerPositionY;
	int mapDimensionX;
	int mapDimensionY;
	
	public Game(char map[][], int difficulty, int character) {
		this.map = map;
		this.difficulty = difficulty;
		this.character = character;
		
	}
	
	public void start() {
		
		mapDimensionX = map.length;
		mapDimensionY = map[0].length;
		
		playerPositionX = (int) Math.floor(Math.random()*(mapDimensionX-2)+1);
		playerPositionY = (int) Math.floor(Math.random()*(mapDimensionY-2)+1);
		
		if (character == 1) {
			map[playerPositionX][playerPositionY] = '1';
		}else if (character == 2) {
			map[playerPositionX][playerPositionY] = '2';
		}
		
		if (difficulty == 1) {
			Enemy enemy1 = new Enemy(map);

		}else if(difficulty == 2){
			Enemy enemy1 = new Enemy(map);
			Enemy enemy2 = new Enemy(map);	
		}else if(difficulty == 3) {
			Enemy enemy1 = new Enemy(map);
			Enemy enemy2 = new Enemy(map);
			Enemy enemy3 = new Enemy(map);

		}

		
		
		
		print();
	}
	
	public void print() {
		
		for (int i = 0; i < map.length; i++) {
		    for (int j = 0; j < map[i].length; j++) {
		        System.out.print(map[i][j] + " ");
		    }
		    System.out.println();
		}
		
	}

}
