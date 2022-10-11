
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Game");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Game = new JPanel(new CardLayout());
		
		DrawingSurface panel = new DrawingSurface();
		//panel.setLayout();
		GameControls panel2 = new GameControls();
		window.add(panel);
		window.add(panel2);
		
		window.setBackground(Color.BLACK);
		window.setSize(500, 500);
		window.setLocation(450, 150);
		
		window.setVisible(true);
		
	}
	
	
	
}
