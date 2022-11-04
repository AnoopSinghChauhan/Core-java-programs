// Choice Fill Demo and List Demo Example by anoop 
// Dropup menu / combobox

import java.awt.*;
import java.awt.event.*;

import java.awt.Component;
import java.lang.Object;

class ChoiceDemo implements WindowListener ,ItemListener 
{
	Frame fr;
	Dimension dim;
	Label l1,l2;
	Choice ch;
	List ls;
	public ChoiceDemo()
	{
		fr = new Frame("CheckBox & Radio Button");
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setSize(dim.width,dim.height);
		fr.setLayout(null);
		fr.setBackground(Color.gray);
	
		l1 = new Label("Choice Demo");
		l1.setBounds(50,50,200,35);
		l1.setFont(new Font("vardana" , Font.BOLD | Font.ITALIC , 30));
		l1.setForeground(Color.red);
		fr.add(l1);
	
		l2 = new Label("Select Item");
		l2.setBounds(50,150,150,35);
		l2.setForeground(Color.blue);
		l2.setFont(new Font("vardana", Font.BOLD ,30));
		fr.add(l2);
		
		ch = new Choice();
		ch.add("Ice-Cream");
		ch.add("Coffee");
		ch.add("Biscuits");
		ch.add("Namkeen");
		ch.add("Pastry");
		ch.add("Chocolate");
		ch.add("Pasta");
		ch.add("Pizza");
		ch.add("Sandwich");
		ch.add("Cold Drink");
		ch.setBounds(50,200,250,30);
		ch.setFont(new Font("vardana", Font.BOLD | Font.ITALIC , 25));
		ch.setForeground(Color.black);
		ch.addItemListener(this);
		fr.add(ch);
		
		ls = new List();
		ls.setBounds(320,200 ,250,250);
		ls.setFont(new Font ("vardana",Font.BOLD | Font.ITALIC , 25));
		fr.add(ls);
		fr.add(l1);
		fr.addWindowListener(this);
		fr.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		ls.add(ch.getSelectedItem());
		
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
		new ChoiceDemo(); 
	}
}