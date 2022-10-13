
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class DrawingSurface extends JPanel implements KeyListener{
	
	//  FIELDS
    private Graphics2D drawBlaster2;
	private Blaster blaster;
	
	// CONSTRUCTORS
	
	public DrawingSurface() {
		blaster = new Blaster();
		this.addKeyListener(this);
		this.setFocusable(true);
		this.drawBlaster2 = blaster.getDrawBlaster();
	}
	
	// METHODS
	
	public void paintComponent(Graphics drawBlaster) {
	
		int width = getWidth();
		int height = getHeight();
		
		blaster.draw(drawBlaster, width, height);
				
	}
	

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Hello");
            if (drawBlaster2 == null) {
                drawBlaster2.rotate(Math.toRadians(-20));
            }
        }
        
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Goodbye");
            if (drawBlaster2 == null) {
                drawBlaster2.rotate(Math.toRadians(20));
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

	
}