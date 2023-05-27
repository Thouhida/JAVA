import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppEvent extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1,b2,b3; 
		JPanel p1;
		JTable j1;
		JScrollPane sp;
		
		
	public AppEvent()
	{
		super("Approved Events ");
		this.setSize(1200,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,15));
		b3.setForeground(Color.BLUE);
		b3.setBounds(250,320,80,30);
		b3.addActionListener(this);
		this.add(b3);
		
		String data[][]={};
		String column[]={"ID","User","AMOUNT"};
		j1 = new JTable(data,column);
		j1.setBounds(100,150,300,400);
		sp=new JScrollPane(j1);
		this.add(sp);
		
	  
	}
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b3)
			{
				userm p=new userm();
				this.setVisible(false);
				p.setVisible(true);
			}
		}
}