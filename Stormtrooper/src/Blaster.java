
import java.awt.*;

public class Blaster {
	
	// FIELDS
	
	
	// CONSTRUCTORS
	public Blaster() {
		
	}
	
	// METHODS
	public void draw(Graphics drawBlaster, int width, int height) {
		
		drawBlaster.setColor(Color.WHITE);
		int xCenter = width/2;
		int yCenter = height - height/9;
		int blasterStandSize = 35;
		int xBlasterBody = xCenter - blasterStandSize/2;
		int yBlasterBody = yCenter - blasterStandSize/2;
		drawBlaster.fillRect(xBlasterBody, yBlasterBody, blasterStandSize, blasterStandSize);
		
		
	}

}
