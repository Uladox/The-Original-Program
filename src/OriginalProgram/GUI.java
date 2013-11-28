package OriginalProgram;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
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


public class GUI extends JFrame{
	
	BufferedImage img, tedx;
	//public JTextArea TextArea;
	private JPanel Window;
	private JButton Run;
	private Rectangle rRun;
	int e = 0;
	Bar p = new Bar();
	public static int button = 0;
	
	
	
	public GUI(){
		
		 
		
		img = getImage("/OriginalImage.png");
		tedx = getImage("/TEDx.png");
	      setResizable(false);
	      setTitle("The Original Program");
	      
	      Window = new JPanel();
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	        p.setValue(0);
	        p.setBounds(15, 15, 300, 15);
	    	//Window.add(p);
	       
	      setIconImage(img);
	      Window.add(p);
	      this.setLocationRelativeTo( null);
	      setContentPane(Window);
	      Window.setLayout(null);
	      setSize(600, 800);
	      draw();
	    
	   
	      
	      this.setVisible(true);
	      
		     
	}
	
	
	   public void imageloader(){
		   BufferStrategy bs= this.getBufferStrategy();
	          if(bs==null){
	              this.createBufferStrategy(4);
	              return;
	          }
	         
	          Graphics g= bs.getDrawGraphics();
	          g.drawImage(tedx, 5, 300,  null);
	          g.dispose();
	          bs.show();
	         
	   }
	    
	   public void Stringshower(String s, int x, int y){
		   BufferStrategy bs= this.getBufferStrategy();
	          if(bs==null){
	              this.createBufferStrategy(4);
	              return;
	          }
	         
	          Graphics g= bs.getDrawGraphics();
	          
	          g.setFont(new Font("Verdana", 0, 25));
	          g.drawString(s, x, y);
	          g.dispose();
	          bs.show();
	         
	   }

	//private BufferStrategy bs= this.getBufferStrategy();
   // if(bs==null){
     //   frame.createBufferStrategy(4);
     //   return;
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
	
	      
	      public void draw(){
	    //TextArea = new JTextArea();
	    //TextArea.setBounds(90, 100, 400, 600);
	   // TextArea.setColumns(100);
	     // Window.add(TextArea);
	    	 
	      
	      Run = new JButton("Next");
			rRun = new Rectangle(235 , 600, 100, 100);
			Run.setBounds(rRun);
			Window.add(Run);
			
			Run.addActionListener(new ActionListener(){
				public  void actionPerformed(ActionEvent e){
					//addBar();
					
					button++;
					
					//update(button);
					
					System.out.println(button);
					
					if(button == 1){
					imageloader();
					
					}
					if(button == 2){
						imageloader();
						}
					if(button == 3){
						Stringshower("This is an original program",  100,  100);
					}
					if(button == 4){
						Stringshower("With many original aspects", 100, 150);
					}
					if(button == 5){
						Stringshower("Displayed in an orginal way", 100, 200);
					}
					if(button == 6){
						Stringshower("And displayed orginiality...", 100, 250);
					}
					if(button == 6){
					
						final Timer timer = new Timer(1000, new ActionListener() {

					          @Override
					          public void actionPerformed(ActionEvent e) {
					              int value = p.getValue() + 1;
					              p.setValue(value);
					          }
					         

					      });

					      p.addChangeListener(new ChangeListener() {

					          @Override
					          public void stateChanged(ChangeEvent e) {
					              if (p.getValue() == 100) {
					                  timer.stop();
					                  Loadingscreen g = new Loadingscreen();
					                  close();
					                 
					              }
					              
					          }
					          
					      });
					      
				
				   
					      timer.start();
				
				}
				}
	});

}
}
