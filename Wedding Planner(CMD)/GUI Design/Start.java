import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
	public Start()
	{
		super(" Menu ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JLabel("Admin");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,30));
		l1.setForeground(Color.red);
		l1.setBounds(120,30,150,30);
		p1.add(l1);
		
		l2 = new JLabel("Palnner");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
		l2.setForeground(Color.red);
		l2.setBounds(400,30,150,30);
		p1.add(l2);
		
		l3 = new JLabel("User");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
		l3.setForeground(Color.red);
		l3.setBounds(760,30,150,30);
		p1.add(l3);
		
		
		
		b1 = new JButton("Sign Up");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.BLUE);
		b1.setBounds(110,100,100,30);
		b1.addActionListener(this);
		p1.add(b1);
		
		b2 = new JButton("Login");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.BLUE);
		b2.setBounds(110,200,100,30);
		b2.addActionListener(this);
		p1.add(b2);	
		
		b3 = new JButton("Sign Up");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.BLUE);
		b3.setBounds(390,100,100,30);
		b3.addActionListener(this);
		p1.add(b3);

        b4 = new JButton("Login");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b4.setForeground(Color.BLUE);
		b4.setBounds(390,200,100,30);
		b4.addActionListener(this);
		p1.add(b4);		
        
		b5 = new JButton("Sign Up");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b5.setForeground(Color.BLUE);
		b5.setBounds(750,100,100,30);
		b5.addActionListener(this);
		p1.add(b5);
		
		b6 = new JButton("Login");
		b6.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b6.setForeground(Color.BLUE);
		b6.setBounds(750,200,100,30);
		b6.addActionListener(this);
		p1.add(b6);
		
		this.add(p1);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1 || ae.getSource()==b3 || ae.getSource()==b5)
			{
				Register f = new Register();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				AdminLogin f = new AdminLogin();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if(ae.getSource()==b4)
			{
				PlannerLogin p = new PlannerLogin();
				this.setVisible(false);
				p.setVisible(true);
			}
			else if(ae.getSource()==b6)
			{
				UserLogin u = new UserLogin();
				this.setVisible(false);
				u.setVisible(true);
			}
		}


}
















