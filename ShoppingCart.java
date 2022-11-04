import java.awt.*;
import java.awt.event.*;



class ShoppingCart implements ActionListener , ItemListener
{
	int price[] ={15,30,50,25,45,20,105,40,25,450};
	Frame fr;
	Dimension dim;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4,t5;
	Button b1,b2,b3,b4,b5;
	Choice ch;
	List ls1,ls2;
	Checkbox ck;
	public ShoppingCart()
	{
		fr = new Frame("Shopping cart");
		fr.setBackground(Color.black);
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setSize(dim.width,dim.height);
		fr.setLayout(null);
		
		
		l1 = new Label("Sopping Cart");
		l1.setBounds(50,50,290,50);
		l1.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,45));
		l1.setForeground(Color.pink);
		fr.add(l1);
		
				
		l2 = new Label("USER_NAME");
		l2.setBounds(50,120,150,35);
		l2.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,22));
		l2.setForeground(Color.blue);
		
		fr.add(l2);
		
		l3 = new Label("PASSWORD");
		l3.setBounds(50,170,150,35);
		l3.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,22));
		l3.setForeground(Color.blue);
		fr.add(l3);
		
		t1 = new TextField();
		t1.setBounds(210,120,230,35);
		t1.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,25));
		t1.setForeground(Color.red);		
		fr.add(t1);
		
		t2 = new TextField();
		t2.setEchoChar('*');
		t2.setBounds(210,170,230,35);
		t2.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,25));
		t2.setForeground(Color.red);		
		fr.add(t2);
		
		
		b1 = new Button("LogIn");
		b1.setBounds(210,220,110,30);
		b1.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,25));
		b1.setForeground(Color.red);
		b1.addActionListener(this);
		fr.add(b1);
		
		b2 = new Button("LogOut");
		b2.setBounds(330,220,110,30);
		b2.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,25));
		b2.setForeground(Color.red);
		b2.addActionListener(this);
		fr.add(b2);
		
		l4 = new Label("Select Item");
		l4.setBounds(500,80,180,35);
		l4.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,30));
		l4.setForeground(Color.blue);
		fr.add(l4);
		
		l5 = new Label("   Your Cart        Price");
		l5.setBounds(700,80,300,35);
		l5.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,30));
		l5.setForeground(Color.blue);
		fr.add(l5);
		
		
		l6 = new Label("");
		l6.setBounds(50,350,600,35);
		l6.setFont(new Font("vardana",Font.PLAIN | Font.ITALIC ,30));
		l6.setForeground(Color.red);
		fr.add(l6);
		
		
		ch = new Choice();
		ch.setBounds(500,120,180,35);
		ch.add("Biscuits");
		ch.add("Maggi");
		ch.add("Pasta");
		ch.add("Namkeen");
		ch.add("Cold Drink");
		ch.add("Juice");
		ch.add("Ice Cream");
		ch.add("Pastry");
		ch.add("Paties");
		ch.add("Cake");
		ch.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,25));
		ch.setForeground(Color.blue);
		ch.addItemListener(this);
		fr.add(ch);
		
		
		ls1 = new List();
		ls1.setBounds(720,120,165,250);
		ls1.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,30));
		ls1.setForeground(Color.blue);
		fr.add(ls1);
		
		ls2 = new List();
		ls2.setBounds(890,120,150,250);
		ls2.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,30));
		ls2.setForeground(Color.blue);
		ls2.setEnabled(false);
		fr.add(ls2);
		
		b3 = new Button("Remove Item");
		b3.setBounds(1050,120,150,30);
		b3.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		b3.setForeground(Color.red);
		b3.addActionListener(this);
		fr.add(b3);
		
		b4 = new Button("Clear Cart");
		b4.setBounds(1050,170,150,30);
		b4.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		b4.setForeground(Color.red);
		b4.addActionListener(this);
		fr.add(b4);
		
		b5 = new Button("Total Amount");
		b5.setBounds(720,380,165,30);
		b5.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		b5.setForeground(Color.red);
		b5.addActionListener(this);
		fr.add(b5);
		
		ck = new Checkbox("Discount 10%");
		ck.setBounds(720,420,165,30);
		ck.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		ck.setForeground(Color.red);
		fr.add(ck);
		
		l7 = new Label("Net Amount");
		l7.setBounds(720,470,165,30);
		l7.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		l7.setForeground(Color.red);
		fr.add(l7);
		
		t3 = new TextField("");
		t3.setBounds(890,380,140,30);
		t3.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		t3.setForeground(Color.red);
		fr.add(t3);
		
		t4 = new TextField("");
		t4.setBounds(890,420,140,30);
		t4.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		t4.setForeground(Color.red);
		fr.add(t4);
		
		t5 = new TextField("");
		t5.setBounds(890,470,140,30);
		t5.setFont(new Font("vardana",Font.BOLD | Font.ITALIC ,20));
		t5.setForeground(Color.red);
		fr.add(t5);
		
		
		l4.setVisible(false);
		l5.setVisible(false);
		ch.setVisible(false);
		ls1.setVisible(false);
		ls2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		b5.setVisible(false);
		ck.setVisible(false);
		l7.setVisible(false);
		t3.setVisible(false);
		t4.setVisible(false);
		t5.setVisible(false);
		
		fr.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				fr.dispose();
			}
		});
		
		fr.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		int indx = ch.getSelectedIndex();
		String itm = ch.getSelectedItem();
		ls1.add(itm);
		ls2.add(""+price[indx]);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			try
			{
				if(t1.getText().trim().length()==0)
				{
					l6.setText("Please ! Enter USERNAME");
					Thread.sleep(2000);
					l6.setText("");
					t1.requestFocus();
				}
				else if(t2.getText().trim().length()==0)
				{
					l6.setText("Please ! Enter YOUR PASSWORD");
					Thread.sleep(2000);
					l6.setText("");
					t2.requestFocus();
				}
				else
				{
					if(t1.getText().trim().equals("AnoopSingh") && t2.getText().trim().equals("Anoop1234"))
					{
							l6.setText("Welcome "+t1.getText()+" "+"hop you Enjoy");
							Thread.sleep(2000);
							l6.setText("");
							
							l4.setVisible(true);
							l5.setVisible(true);
							ch.setVisible(true);
							ls1.setVisible(true);
							ls2.setVisible(true);
							b3.setVisible(true);
							b4.setVisible(true);
							b5.setVisible(true);
							ck.setVisible(true);
							l7.setVisible(true);
							t3.setVisible(true);
							t4.setVisible(true);
							t5.setVisible(true);
							
					}
					else
					{
						l6.setText("Sorry ! invalid Username And Password");
						Thread.sleep(2000);
						l6.setText("");
						t1.setText("");
						t2.setText("");
					} 
				}
			}
			catch(Exception e)
			{
				
			}
		}
		if(ae.getSource()==b2)
		{
			try
			{
				l4.setVisible(false);
				l5.setVisible(false);
				ch.setVisible(false);
				ls1.setVisible(false);
				ls2.setVisible(false);
				b3.setVisible(false);
				b4.setVisible(false);
				b5.setVisible(false);
				ck.setVisible(false);
				l7.setVisible(false);
				t3.setVisible(false);
				t4.setVisible(false);
				t5.setVisible(false);
				t1.setText("");
				t2.setText("");
				ls1.removeAll();
				ls2.removeAll();
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	
	public static void main(String args[])
	{
		new ShoppingCart();
	}
}