import java.io.InputStream;
import java.util.Scanner;


public class Menu {
	public Menu(InputStream is) {
		this.scanner = new Scanner(is);
	}
	
	public void setDifficult() {
		difficulty=3;
	}

}