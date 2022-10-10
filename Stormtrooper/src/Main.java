
import java.awt.Color;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawingSurface panel = new DrawingSurface();
		window.add(panel);
		window.add(new GameControls());
		
		window.setBackground(Color.BLACK);
		window.setSize(500, 500);
		window.setLocation(450, 150);
		
		window.setVisible(true);
		
	}
	
}
