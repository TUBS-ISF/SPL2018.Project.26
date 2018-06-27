public class Enemy {

	char[][] map;
	int mapDimensionX;
	int mapDimensionY;

	public Enemy(char [][] map) {
		mapDimensionX = map.length;
		mapDimensionY = map[0].length;
		int positionX = (int) Math.floor(Math.random()*(mapDimensionX-2)+1);
		int positionY = (int) Math.floor(Math.random()*(mapDimensionY-2)+1);

		map[positionX][positionY] = 'A';


	}
}