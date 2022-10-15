
package main;

public class Game {
	
	// FIELDS
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	
	// CONSTRUCTORS
	public Game() {
		
		gamePanel = new GamePanel();
		gameWindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();
		
	}
	
	// METHODS
}
