import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t1;
		JPasswordField t2;
		JButton b1,b2; 
		JPanel p1;
		
	public AdminLogin()
	{
		super(" Log in ");
		this.setSize(600,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l1 = new JLabel("Login");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(180,30,150,30);
		p1.add(l1);
		
		l2 = new JLabel("User Name: ");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l2.setForeground(Color.red);
		l2.setBounds(100,100,150,20);
		p1.add(l2);
		
		l3 = new JLabel("Password: ");
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l3.setForeground(Color.red);
		l3.setBounds(100,150,150,20);
		p1.add(l3);
		
		t1 = new JTextField();
		t1.setBounds(220,100,100,25);
		p1.add(t1);

		t2 = new JPasswordField();
		t2.setBounds(220,150,100,25);
		p1.add(t2);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.BLUE);
		b1.setBounds(180,220,100,25);
		b1.addActionListener(this);
		p1.add(b1);

		
		b2 = new JButton("Back");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b2.setForeground(Color.BLUE);
		b2.setBounds(250,320,80,30);
		b2.addActionListener(this);
		p1.add(b2);	
		
        this.add(p1);		
        
	}
	public void actionPerformed(ActionEvent ae)
		{
			if (ae.getSource()==b1)
			{
				Adminm f = new Adminm();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				Start f = new Start();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		}
		}