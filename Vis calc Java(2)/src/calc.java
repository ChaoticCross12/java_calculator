import javax.swing.*;
import java.awt.*;



public class calc
{

	private JFrame f;
	//private JPanel p;
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
		f.setResizable(false);
		f.setLayout(null);

		
		//panel
		//p = new JPanel();
		//p.setBackground(Color.DARK_GRAY);
		//f.add(p);

		
		//button
		b1 = new JButton("1");
		b1.setBounds(50, 300, 50, 50);
		
		b2 = new JButton("2");
		b2.setBounds(120, 300, 50, 50);
		
		b3 = new JButton("3");
		b3.setBounds(190, 300, 50, 50);
		
		b4 = new JButton("4");
		b4.setBounds(50, 230, 50, 50);
		
		b5 = new JButton("5");
		b5.setBounds(120, 230, 50, 50);
		
		b6 = new JButton("6");
		b6.setBounds(190, 230, 50, 50);
		
		b7 = new JButton("7");
		b7.setBounds(50, 160, 50, 50);
		
		b8 = new JButton("8");
		b8.setBounds(120, 160, 50, 50);
		
		b9 = new JButton("9");
		b9.setBounds(190, 160, 50, 50);
		
		b0 = new JButton("0");
		b0.setBounds(50, 370, 50, 50);
		
		
		//adding button to panel;
		f.add(b1);
		//p.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);	
		f.add(b0);

	}
	
	
	

	
	
	public static void main(String[] args)
	{
		new calc();

	}

}
