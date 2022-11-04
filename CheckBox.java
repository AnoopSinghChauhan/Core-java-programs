// Check Box and Radio Button Example by anoop 

import java.awt.Frame;
import java.awt.event.WindowListener;
import java.awt.Label;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

class CheckBox implements WindowListener , ItemListener 
{
	Frame fr;
	Dimension dim;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cbg;
	public CheckBox()
	{
		fr = new Frame("CheckBox & Radio Button");
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setSize(dim.width,dim.height);
		fr.setLayout(null);
		fr.setBackground(Color.gray);
	
		l8 = new Label("CheckBox & RadioButton Demo");
		l8.setBounds(50,50,500,30);
		l8.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC , 25));
		l8.setForeground(Color.red);
		fr.add(l8);
	
		l7 = new Label("Contry");
		l7.setBounds(50,150,150,25);
		l7.setForeground(Color.blue);
		l7.setFont(new Font("vardana", Font.BOLD ,20));
		fr.add(l7);
	
		l6 = new Label("Capital");
		l6.setBounds(290,150,150,25);
		l6.setForeground(Color.blue);
		l6.setFont(new Font("vardana", Font.BOLD ,20));
		fr.add(l6);
		/*Check-box*/
		cbg = new CheckboxGroup();
		
		c1 = new Checkbox("India");
		c2 = new Checkbox("Pakistan");
		c3 = new Checkbox("Shrilanka");
		c4 = new Checkbox("Nepal" ,cbg,false);
		c5 = new Checkbox("Bangladesh",cbg,false);
		
		c1.setBounds(50,200,150,25);
		c2.setBounds(50,250,150,25);
		c3.setBounds(50,300,150,25);
		c4.setBounds(50,350,150,25);
		c5.setBounds(50,400,200,25);
		
		c1.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC ,20));
		c2.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		c3.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		c4.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		c5.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		
		c1.setForeground(Color.black);
		c2.setForeground(Color.black);
		c3.setForeground(Color.black);
		c4.setForeground(Color.black);
		c5.setForeground(Color.black);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		
		
		fr.add(c1);
		fr.add(c2);
		fr.add(c3);
		fr.add(c4);
		fr.add(c5);
		
		 /*Lebel*/
		l1 = new Label("");
		l2 = new Label("");
		l3 = new Label("");
		l4 = new Label("");
		l5 = new Label("");
		
		l1.setBounds(290,200,150,25);
		l2.setBounds(290,250,150,25);
		l3.setBounds(290,300,150,25);
		l4.setBounds(290,350,150,25);
		l5.setBounds(290,400,250,25);
		
		l1.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC ,20));
		l2.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		l3.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		l4.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		l5.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC,20));
		
		l1.setForeground(Color.black);
		l2.setForeground(Color.black);
		l3.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		
		
		
		fr.add(l1);
		fr.add(l2);
		fr.add(l3);
		fr.add(l4);
		fr.add(l5);
		
		
		
		fr.addWindowListener(this);
		fr.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState()==true)
		{
			l1.setText("New Delhi");
		}
		else
		{
			l1.setText("");
		}
		if(c2.getState()==true)
		{
			l2.setText("Islamabad");
		}
		else
		{
			l2.setText("");
		}
		if(c3.getState()==true)
		{
			l3.setText("Columbo");
		}
		else
		{
			l3.setText("");
		}
		if(c4.getState()==true)
		{
			l4.setText("Kathmandu");
		}
		else
		{
			l4.setText("");
		}
		if(c5.getState()==true)
		{
			l5.setText("Dhaka");
		}
		else
		{
			l5.setText("");
		}
	}
	public void windowOpened(WindowEvent we){};
	public void windowClosed(WindowEvent we){};
	public void windowActivated(WindowEvent we){};
	public void windowDeactivated(WindowEvent we){};
	public void windowIconified(WindowEvent we){};
	public void windowDeiconified(WindowEvent we){};
	public void windowClosing(WindowEvent we)
	{
		fr.dispose();
	};
	
	
	
	
	
	public static void main(String args[])
	{
		new CheckBox(); 
	}
}