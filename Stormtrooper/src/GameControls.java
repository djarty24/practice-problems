//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.color.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//@SuppressWarnings("serial")
//public class GameControls extends JPanel implements KeyListener{
//	
//	
//	public void setup() {
//		
//		this.setBackground(Color.BLACK);
//		JLabel title = new JLabel("Paratrooper");
//		title.setForeground(Color.WHITE);
//		add(title);
//		
//	}
//	
//	public GameControls() {
//		this.addKeyListener(this);
//		this.setFocusable(true);
//		setup();
//				
//	}
//	
//	public void keyPressed(KeyEvent e) {
//		
//		if (e.getKeyCode() == KeyEvent.VK_Q) {
//			System.out.println("Hello");
//
//		}
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//	}
//	
//	
//	
//}
