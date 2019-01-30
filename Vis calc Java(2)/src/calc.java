import javax.swing.*;
import java.awt.*;



public class calc
{

	private JFrame f;
	private JPanel p;
	//private JLabel lab;
	
	//creating buttons
	private JButton b1;
	private JButton b2;
	
	public calc() 
	{	
		gui();
	}
	
	public void gui()
	{
		//frame
		f = new JFrame("Calculator");
		f.setVisible(true);
		f.setSize(500, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//panel
		p = new JPanel();
		p.setBackground(Color.BLUE);

		
		//button
		b1 = new JButton("1");
		b2 = new JButton("2");
		
		
		//adding button to panel and frame
		p.add(b1);
		f.add(p);
		
		p.add(b2);
		f.add(p);
	}
	
	
	

	
	
	public static void main(String[] args)
	{
		new calc();

	}

}
