import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class userm extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
		
	public userm()
	{
		super(" User-Menu ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l2 = new JLabel("!!Welcome!!");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
		l2.setForeground(Color.red);
		l2.setBounds(400,30,300,30);
		p1.add(l2);
		
		
		b1 = new JButton("Add Event");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.BLUE);
		b1.setBounds(390,100,200,30);
		b1.addActionListener(this);
		p1.add(b1);

        b2 = new JButton("Show Approved Event");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.BLUE);
		b2.setBounds(390,200,200,30);
		b2.addActionListener(this);
		p1.add(b2);
		
        b3 = new JButton("Log Out");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.BLUE);
		b3.setBounds(250,320,100,30);
		b3.addActionListener(this);
		p1.add(b3);		
        
		
		
		this.add(p1);
	}
	public void actionPerformed(ActionEvent ae)
		{
			if (ae.getSource()==b3)
			{
				UserLogin f = new UserLogin();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				AppEvent f = new AppEvent();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b1)
			{
				Packages f = new Packages();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}
}