package OriginalProgram;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.Timer;
import java.util.TimerTask;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TheEnd extends JFrame{
	

	//public JTextArea TextArea;
	private JPanel Window;
BufferedImage img;
	int e = 0;
	
	public static int button = 0;
	
	
	
	public TheEnd(){
		
		img = getImage("/NOEND.png");
		 setIconImage(img);
		
	      setResizable(false);
	      setTitle("The Rapping Up Point");
	      
	      Window = new JPanel();
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	       
	    	//Window.add(p);
	       
	     
	     
	      
	      this.setLocationRelativeTo( null);
	      setContentPane(Window);
	      Window.setLayout(null);
	      setSize(320, 300);
	      this.setVisible(true);
	      paint(getGraphics());
	     
	   
	     
	      
	     
}



		     
private BufferedImage getImage(String filename) {
	// This time, you can use an InputStream to load
	try {
		// Grab the InputStream for the image.
		InputStream in = getClass().getResourceAsStream(filename);
		
		// Then read it in.
		return ImageIO.read(in);
	} catch (IOException e) {
		System.out.println("The image was not loaded.");
		System.exit(1);
	}
	return null;
}
	

	  
	   public void paint(Graphics g) {
		      Graphics2D g2 = (Graphics2D)g;
		      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		      RenderingHints.VALUE_ANTIALIAS_ON);
		      Font font = new Font("Serif", Font.PLAIN, 20);
		      g2.setFont(font);
		      g2.drawString("Maybe Originality is", 40, 100);
		      g2.drawString("Unexpected", 40, 120);
		      g2.drawString("Contradiction", 40, 140);
		      g2.drawString("A Twist", 40, 160);
		      g2.drawString("A Different Veiw", 40, 180);
		      g2.drawString("And", 40, 200);
		      g2.drawString("Most of All", 40, 220);
		      g2.drawString("Us", 40, 240);
		   }

	
						
}