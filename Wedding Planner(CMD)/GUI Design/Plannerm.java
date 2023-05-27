import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Plannerm extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JButton b1,b2,b3,b4,b5,b6; 
		JPanel p1;
		
	public Plannerm()
	{
		super("Planner Access ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setBackground(Color.black);
		p1.setLayout(null);
		
		l2 = new JLabel("Planner Access");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,30));
		l2.setForeground(Color.red);
		l2.setBounds(400,30,250,30);
		p1.add(l2);
		
		
		b1 = new JButton("1.SHOW EVENTS");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.BLUE);
		b1.setBounds(390,100,300,30);
		b1.addActionListener(this);
		p1.add(b1);

		
        b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.BLUE);
		b3.setBounds(250,320,80,30);
		b3.addActionListener(this);
		p1.add(b3);		
        
		
		
		this.add(p1);
	}
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				PlannerAc p = new PlannerAc();
				this.setVisible(false);
				p.setVisible(true);
			}
			
			else if(ae.getSource()==b3 )
			{
				PlannerLogin p = new PlannerLogin();
				this.setVisible(false);
				p.setVisible(true);
			}
			
		}
}