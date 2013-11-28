package OriginalProgram;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class ErrorWindow extends JFrame {
	
	BufferedImage img1;
	
	int onceonly = 0;

	public ErrorWindow() {
		
        add(new Error());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pack();
        this.setLocationRelativeTo( getRootPane());
       

       
        setVisible(true);
        setResizable(false);

		final Timer timer = new Timer(9000, new ActionListener() {

	          @Override
	          public void actionPerformed(ActionEvent e) {
	             try {
	            	if(onceonly == 0){
					close();
					 TheEnd end = new TheEnd();
					 onceonly = 1;
	            	}
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	          }
	         

	      });

	    
	      

   
	      timer.start();


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
	
	private void close() throws InterruptedException{
	
		this.dispose();
	}

	
}