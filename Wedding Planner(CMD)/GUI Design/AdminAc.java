import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminAc extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1;
		JTable j1;
		JScrollPane sp;
		
		
	public AdminAc()
	{
		super(" Pending Events ");
		this.setSize(1200,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		l1 = new JLabel("ID");
		l1.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		l1.setForeground(Color.BLUE);
		l1.setBounds(100,70,150,20);
		this.add(l1);
		
		l2 = new JLabel("Amount ");
		l2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l2.setForeground(Color.red);
		l2.setBounds(100,100,150,20);
		this.add(l2);
		
		t1=new JTextField();
		t1.setBounds(120,70,150,20);
		this.add(t1);
		
		t2=new JTextField();
		t2.setBounds(160,100,150,20);
		this.add(t2);
		
		b1=new JButton("Approve");
		b1.setBounds(100,170,150,30);
		b1.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b1.setForeground(Color.BLUE);
		b1.addActionListener(this);
		this.add(b1);
		
		b2=new JButton("Remove");
		b2.setBounds(250,170,150,30);
		b2.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		b2.setForeground(Color.BLUE);
		b2.addActionListener(this);
		this.add(b2);
		
		l3=new JLabel("");
	    l3.setBounds(100,210,150,30);
		l3.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		l3.setForeground(Color.BLUE);
		this.add(l3);
		
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.BLUE);
		b3.setBounds(250,320,80,30);
		b3.addActionListener(this);
		this.add(b3);
		
		String data[][]={};
		String column[]={"ID","User","Package"};
		j1 = new JTable(data,column);
		j1.setBounds(100,150,300,400);
		sp=new JScrollPane(j1);
		this.add(sp);
		
	  
	}
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1 || ae.getSource()==b2)
			{
				l3.setText("Confimed");
			}
			else if(ae.getSource()==b3)
			{
				Adminm p=new Adminm();
				this.setVisible(false);
				p.setVisible(true);
			}
		}
}