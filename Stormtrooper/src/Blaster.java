
import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JPanel;
import processing.core.PApplet;

public class Blaster extends JPanel{

	// FIELDS
    private Graphics2D drawBlaster2;
    
	// CONSTRUCTORS
	public Blaster() {

		//this.addKeyListener(this);
		//this.setFocusable(true);

	}

	// METHODS
	public void draw(Graphics drawBlaster, int width, int height) {

	    super.paintComponent(drawBlaster);
		// Creates a 35x35 square for the blaster to stand on
		drawBlaster.setColor(Color.WHITE);
		int xCenter = width / 2;
		int yCenter = height - height / 9;
		int blasterStandSize = 35;
		int xBlasterBody = xCenter - blasterStandSize / 2;
		int yBlasterBody = yCenter - blasterStandSize / 2;
		drawBlaster.fillRect(xBlasterBody, yBlasterBody, blasterStandSize, blasterStandSize);

		// Draws the gun part of the blaster
		Graphics2D drawBlaster2 = (Graphics2D)drawBlaster;
		drawBlaster2.setColor(Color.PINK);
		int blasterShooterWidth = 10;
		int blasterShooterHeight = 20;
		int xBlasterShooter = xCenter - blasterShooterWidth / 2;
		int yBlasterShooter = yBlasterBody - blasterShooterHeight;
		drawBlaster2.fillRoundRect(xBlasterShooter, yBlasterShooter, blasterShooterWidth, blasterShooterHeight, 5, 5);
	}
	
	public Graphics2D getDrawBlaster() {
	    return drawBlaster2;
	}

}
