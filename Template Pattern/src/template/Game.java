package template;

public abstract class Game {
	
	abstract void initialize();
	abstract void startplay();
	abstract void endgame();
	
	public final void playTemplate() {
		initialize();
		startplay();
		endgame();
	}
	
}
