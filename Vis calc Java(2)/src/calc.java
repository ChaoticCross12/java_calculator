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
	
	private JButton func1;
	private JButton func2;
	private JButton func3;
	private JButton func4;
	private JButton func5;
	private JButton butres;
	
	public calc() 
	{	
		gui();
	}
	
	public void gui()
	{
		//frame
		f = new JFrame("Calculator");
		f.setVisible(true);
		f.setSize(370, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLayout(null);
		f.setBackground(Color.BLACK);
		f.setFont(new Font("Times Romal", Font.BOLD, 0));

		
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
		
		func1 = new JButton("=");
		func1.setBounds(120, 370, 50, 50);
		
		func2 = new JButton("+");
		func2.setBounds(260, 230, 50, 50);
		
		func3 = new JButton("-");
		func3.setBounds(260, 300, 50, 50);
		
		func4 = new JButton("x");
		func4.setBounds(260, 370, 50, 50);
		
		func5 = new JButton("/");
		func5.setBounds(190, 370, 50, 50);
		
		butres = new JButton("AC");
		butres.setBounds(260, 160, 50, 50);
		
		//adding button to panel;
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);	
		f.add(b0);
		
		f.add(func1);
		f.add(func2);
		f.add(func3);
		f.add(func4);
		f.add(func5);
		f.add(butres);
	}
	
	
	

	
	
	public static void main(String[] args)
	{
		new calc();

	}

}
