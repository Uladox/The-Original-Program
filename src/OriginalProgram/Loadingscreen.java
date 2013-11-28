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


public class Loadingscreen extends JFrame{
	

	//public JTextArea TextArea;
	private JPanel Window;
BufferedImage img;
	int e = 0;
	Bar p = new Bar();
	public static int button = 0;
	
	
	
	public Loadingscreen(){
		
		img = getImage("/NOEND.png");
		 setIconImage(img);
		
	      setResizable(false);
	      setTitle("The Loading Screen");
	      
	      Window = new JPanel();
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	        p.setValue(0);
	        p.setBounds(15, 15, 300, 15);
	    	//Window.add(p);
	       
	     
	      Window.add(p);
	      
	      this.setLocationRelativeTo( null);
	      setContentPane(Window);
	      Window.setLayout(null);
	      setSize(320, 140);
	      this.setVisible(true);
	      paint(getGraphics());
	     
	   
	     
	      
	      final Timer timer = new Timer(9000, new ActionListener() {

	          @Override
	          public void actionPerformed(ActionEvent e) {
	        	  if(p.getValue() < 10){
	              int value = p.getValue() + 1;
	              p.setValue(value);
	        	  }
	        	   if(p.getValue() == 10){
		              int value = 100;
		              p.setValue(value);
		        	  }
	          }
	         

	      });

	      p.addChangeListener(new ChangeListener() {

	          @Override
	          public void stateChanged(ChangeEvent e) {
	              if (p.getValue() == 100) {
	                  timer.stop();
	                  ErrorWindow e1 = new ErrorWindow();
	                  close();
	                 
	              }
	              
	          }
	          
	      });
	      

   
	      timer.start();


}
;


		     
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
	
public void close(){
	  this.dispose();
}
	  
	   public void paint(Graphics g) {
		      Graphics2D g2 = (Graphics2D)g;
		      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		      RenderingHints.VALUE_ANTIALIAS_ON);
		      Font font = new Font("Serif", Font.PLAIN, 20);
		      g2.setFont(font);
		      g2.drawString("Loading screen done loading!!", 40, 100);
		      g2.drawString("Loading nature of originality", 40, 120);
		   }

	//private BufferStrategy bs= this.getBufferStrategy();
   // if(bs==null){
     //   frame.createBufferStrategy(4);
     //   return;
	
	
	
	
	      
	     
					
						
}