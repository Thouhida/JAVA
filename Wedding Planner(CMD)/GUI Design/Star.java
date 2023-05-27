import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Star extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JButton b1; 
		JPanel p1;
		
	public Star()
	{
		super(" Details ");
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(1200,700));
		p1.setLayout(null);
		
		l1 = new JLabel("Details");
		l1.setFont(new Font("Serif",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(180,30,150,30);
		p1.add(l1);
		
		l2 = new JLabel("Sepcifiactions: ");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l2.setForeground(Color.red);
		l2.setBounds(100,100,300,20);
		p1.add(l2);
		
		
		
		l2 = new JLabel("");
		l2.setBounds(220,100,400,600);
		p1.add(l2);

		
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b1.setForeground(Color.BLUE);
		b1.setBounds(250,520,80,30);
		b1.addActionListener(this);
		p1.add(b1);	
		
        this.add(p1);		
        
	}

	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				Packages f = new Packages();
				this.setVisible(false);
				f.setVisible(true);
			}
		}
}
	
	