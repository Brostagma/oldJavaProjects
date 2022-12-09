
import java.util.ArrayList;
import java.util.List;

public class Game {

	private Display display;
	private List <GameObject> gameobject;
	
	public Game(int width, int height) {
		
		display = new Display(width, height);
		gameobject = new ArrayList<>();
		gameobject.add(new Square());
	}
	
	public void update() {
		
		gameobject.forEach(gameobject -> gameobject.update());
	}
	
	public void render() {
		
		display.render(this);
	}

	public List<GameObject> getGameobject() {
		
		return gameobject;
	}
}
