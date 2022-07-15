
public class GameLoop implements Runnable {

	private Game game;
	
	private boolean running;
	private final double updateRate = 1.0d/60.0d;
	private long nextStatTime;
	private int fps, ups;
	
	public GameLoop(Game game) {
		this.game = game;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		running = true;
		double accumulator = 0;
		long currentTime, lastUpdate = System.currentTimeMillis();
		nextStatTime = System.currentTimeMillis() + 1000;
		
		while(running) {
			
			currentTime = System.currentTimeMillis();
			double lastRenderTimeInSeconds = (currentTime - lastUpdate) / 1000d;
			accumulator += lastRenderTimeInSeconds;
			lastUpdate = currentTime;
			
			if(accumulator >= updateRate) {
				
				while(accumulator > updateRate) {
					
					update();
					accumulator -= updateRate;
				}
				render();
			}
			printStats();
		}
	}

	private void printStats() {
		// TODO Auto-generated method stub
		if(System.currentTimeMillis() > nextStatTime) {
			
			System.out.println(String.format("FPS: %d, UPS: %d", fps, ups));
			fps = 0;
			ups = 0;
			nextStatTime = System.currentTimeMillis() + 1000;
		}
	}
	
	private void update() {
		// TODO Auto-generated method stub
		game.update();
		ups++;
		
	}

	private void render() {
		// TODO Auto-generated method stub
		game.render();
		fps++;
	}
}
