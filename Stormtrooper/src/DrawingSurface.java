
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class DrawingSurface extends JPanel {
	
	//  FIELDS
	
	private Blaster blaster;
	
	// CONSTRUCTORS
	
	public DrawingSurface() {
		blaster = new Blaster();
	}
	
	// METHODS
	
	public void paintComponent(Graphics drawBlaster) {
	
		int width = getWidth();
		int height = getHeight();
		
		blaster.draw(drawBlaster, width, height);
	}
	
}