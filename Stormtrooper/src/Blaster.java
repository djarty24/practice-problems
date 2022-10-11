
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class Blaster extends JPanel implements KeyListener {

	// FIELDS

	// CONSTRUCTORS
	public Blaster() {

		this.addKeyListener(this);
		this.setFocusable(true);

	}

	// METHODS
	public void draw(Graphics drawBlaster, int width, int height) {

		// Creates a 35x35 square for the blaster to stand on
		drawBlaster.setColor(Color.WHITE);
		int xCenter = width / 2;
		int yCenter = height - height / 9;
		int blasterStandSize = 35;
		int xBlasterBody = xCenter - blasterStandSize / 2;
		int yBlasterBody = yCenter - blasterStandSize / 2;
		drawBlaster.fillRect(xBlasterBody, yBlasterBody, blasterStandSize, blasterStandSize);

		// Draws the gun part of the blaster
		drawBlaster.setColor(Color.PINK);
		int blasterShooterWidth = 10;
		int blasterShooterHeight = 20;
		int xBlasterShooter = xCenter - blasterShooterWidth / 2;
		int yBlasterShooter = yBlasterBody - blasterShooterHeight;
		drawBlaster.fillRoundRect(xBlasterShooter, yBlasterShooter, blasterShooterWidth, blasterShooterHeight, 5, 5);

	}
	
	public void turn(int degrees) {
		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A) {
			System.out.println("Hello");
		}
		if (e.getKeyCode() == KeyEvent.VK_D ) {
			System.out.println("Goodbye");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
