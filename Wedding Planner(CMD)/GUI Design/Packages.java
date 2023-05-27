import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Packages extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
		JTextField f1;
		
	public Packages()
	{
		super(" Packages ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l2 = new JLabel("**PACKAGES**");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
		l2.setForeground(Color.red);
		l2.setBounds(400,30,250,30);
		p1.add(l2);
		
		
		b1 = new JButton("1.STAR PACKAGE");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.BLUE);
		b1.setBounds(390,100,300,30);
		b1.addActionListener(this);
		p1.add(b1);

        b2 = new JButton("2.GOLDEN PACKAGE");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.BLUE);
		b2.setBounds(390,150,300,30);
		b2.addActionListener(this);
		p1.add(b2);
		
		b3 = new JButton("3.PLATINUM PACKAGE");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.BLUE);
		b3.setBounds(390,200,300,30);
		b3.addActionListener(this);
		p1.add(b3);
		
		b4 = new JButton("4.VIP PACKAGE");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.BLUE);
		b4.setBounds(390,250,300,30);
		b4.addActionListener(this);
		p1.add(b4);
		
		
        b5 = new JButton("Back");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.BLUE);
		b5.setBounds(250,480,80,30);
		b5.addActionListener(this);
		p1.add(b5);		
        
		
		
		this.add(p1);
	}
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1||ae.getSource()==b2||ae.getSource()==b3||ae.getSource()==b4)
			{
				Star p = new Star();
				this.setVisible(false);
				p.setVisible(true);
			}
			else if(ae.getSource()==b5 )
			{
				userm p = new userm();
				this.setVisible(false);
				p.setVisible(true);
			}
			
		}
}