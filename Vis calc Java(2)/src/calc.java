import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class calc
{

	private JFrame f;
	private JPanel p;
	private JPanel lilp;
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
	
	
	//Action Listener
	//private ActionListener aL1;
	
	
	
	
	
	
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
		//f.setLayout(null);
		f.setBackground(Color.BLACK);
		f.setFont(new Font("Times Romal", Font.BOLD, 0));

		
		//panel
		p = new JPanel();
		p.setBackground(Color.DARK_GRAY);
		p.setLayout(null);
		f.add(p);
		
		lilp = new JPanel();
		lilp.setBackground(Color.WHITE);
		p.add(lilp);
		lilp.setBounds(30, 50, 300, 70);
		
		
		
		//button
		b1 = new JButton("1");
		b1.setBounds(50, 300, 50, 50);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
			
		
		b2 = new JButton("2");
		b2.setBounds(120, 300, 50, 50);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b3 = new JButton("3");
		b3.setBounds(190, 300, 50, 50);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b4 = new JButton("4");
		b4.setBounds(50, 230, 50, 50);
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b5 = new JButton("5");
		b5.setBounds(120, 230, 50, 50);
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b6 = new JButton("6");
		b6.setBounds(190, 230, 50, 50);
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b7 = new JButton("7");
		b7.setBounds(50, 160, 50, 50);
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b8 = new JButton("8");
		b8.setBounds(120, 160, 50, 50);
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b9 = new JButton("9");
		b9.setBounds(190, 160, 50, 50);
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		b0 = new JButton("0");
		b0.setBounds(50, 370, 50, 50);
		b0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		func1 = new JButton("=");
		func1.setBounds(120, 370, 50, 50);
		func1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		func2 = new JButton("+");
		func2.setBounds(260, 230, 50, 50);
		func2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		func3 = new JButton("-");
		func3.setBounds(260, 300, 50, 50);
		func3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		func4 = new JButton("x");
		func4.setBounds(260, 370, 50, 50);
		func4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		func5 = new JButton("/");
		func5.setBounds(190, 370, 50, 50);
		func5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		butres = new JButton("AC");
		butres.setBounds(260, 160, 50, 50);
		butres.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "action listener is working");
				}
			}
		);
		
		
		//adding button to frame;
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);	
		p.add(b0);
		
		p.add(func1);
		p.add(func2);
		p.add(func3);
		p.add(func4);
		p.add(func5);
		p.add(butres);
	}
	
	
	

	
	
	public static void main(String[] args)
	{
		new calc();

	}

}
