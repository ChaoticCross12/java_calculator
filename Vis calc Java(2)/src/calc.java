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
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b0;
	
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
		p.setBackground(Color.DARK_GRAY);

		
		//button
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		
		
		
		//adding button to panel and frame
		p.add(b1);
		f.add(p);
		
		p.add(b2);
		f.add(p);
		
		p.add(b3);
		f.add(p);
		
		p.add(b4);
		f.add(p);
		
		p.add(b5);
		f.add(p);
		
		p.add(b6);
		f.add(p);
		
		p.add(b7);
		f.add(p);
		
		p.add(b8);
		f.add(p);
		
		p.add(b9);
		f.add(p);
		
		p.add(b0);
		f.add(p);
	}
	
	
	

	
	
	public static void main(String[] args)
	{
		new calc();

	}

}
