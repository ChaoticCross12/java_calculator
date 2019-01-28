import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

public class java_calc extends JFrame 
{
      public java_calc()
      {
             setTitle("Tutorial");
             setSize(500, 600);
             setVisible(true);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
      }

      public void paint(Graphics g)
      {

    	  	//the border
    	  	g.drawRect(50, 50, 400, 500);
            
    	  	//the font
    	  	g.setFont(new Font("Times Roman", Font.PLAIN, 70));
    	  	
    	  	//numbers
    	  	g.drawRect(50, 150, 100, 100);
    	  	g.drawString("1",80, 220);
            g.drawRect(150, 150, 100, 100);
            g.drawString("2", 180, 220);
            g.drawRect(250, 150, 100, 100);
            g.drawString("3", 280, 220);
            g.drawRect(50, 250, 100, 100);
            g.drawString("4", 80, 320);
            g.drawRect(150, 250, 100, 100);
            g.drawString("5", 180, 320);
            g.drawRect(250, 250, 100, 100);
            g.drawString("6", 280, 320);
            g.drawRect(50, 350, 100, 100);
            g.drawString("7", 80, 420);
            g.drawRect(150, 350, 100, 100);
            g.drawString("8", 180, 420);
            g.drawRect(250, 350, 100, 100);
            g.drawString("9", 280, 420);
            g.drawRect(50, 450, 100, 100);
            g.drawString("0", 80, 520);
            
           
             
            //functions
            g.drawRect(350, 150, 100, 100);
            g.drawString("+", 380, 220);
            g.drawRect(350, 250, 100, 100);
            g.drawString("-", 390, 320);
            g.drawRect(350, 350, 100, 100);
            g.drawString("x", 380, 420);
            g.drawRect(150, 450, 100, 100);
            g.drawString("/", 390, 520);
            g.drawRect(250, 450, 100, 100);
            g.drawString("=", 280, 520);
            g.drawRect(350, 450, 100, 100);
            g.drawString("C", 175, 520);
      }

       public static void main(String[] args)
       {
    	   java_calc t = new java_calc();
       }
}