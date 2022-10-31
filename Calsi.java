import java.awt.*;
import java.awt.event.*;


class Calsi extends WindowAdapter implements ActionListener
{
	Frame fr;
	String str[] ={"1","2","3","4","5","6","7","8","9","0",".","/","*","+","-","=","Clr","Backspace","ON"};
	double a,b,c;
	Dimension dim;
	TextField t1;
	Button bn[]= new Button[19];
	int x=100,y=250,w=1,op;
	
	public Calsi()
	{
		fr = new Frame("Calsi");
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setSize(dim.width , dim.height);
		fr.setBackground(Color.gray);
		fr.setLayout(null);
		
		
		t1= new TextField();
		t1.setBounds(100,180,380,50);
		t1.setFont(new Font("vardana" , Font.BOLD,40));
		t1.setEditable(false);
		t1.setForeground(Color.red);
		fr.add(t1);
		
		for(int i =0; i <bn.length;i++)
		{
			bn[i] = new Button(str[i]);
			bn[i].setForeground(Color.blue);
			bn[i].setFont(new Font("vardana" ,Font.BOLD ,25));
			bn[i].setEnabled(false);
			bn[i].addActionListener(this);
			fr.add(bn[i]);
			bn[i].setBounds(x,y,80,40);
			
			if(w<4)
			{
				x=x+100;
				w++;
			}
			else
			{
				y = y+50;
				x = 100;
				w =1;
			}
		}
		bn[17].setBounds(200,450,160,40);
		bn[18].setBounds(380,450,100,40);
		bn[18].setEnabled(true);
		
		fr.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				fr.dispose();
			}
		});
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String ss = ae.getActionCommand();
		if(!(ss.equals("+") || ss.equals("-") || ss.equals("*") || ss.equals("/") || ss.equals("=") || ss.equals("Clr")|| ss.equals("Backspace")|| ss.equals("OFF")|| ss.equals("ON")) )
		{
			if(ss.equals(".") && t1.getText().indexOf(".")==-1)
			{
				t1.setText(t1.getText()+".");
			}
			else
			{
				if(!ss.equals("."))
				{
					t1.setText(t1.getText()+ss);
				}
			}
		}
		if(ss.equals("+"))
		{
			try
			{
				op= 1;
				a = Double.parseDouble(t1.getText());
				t1.setText("");
			}
			catch(Exception e)
			{
				
			}
		}
		if(ss.equals("-"))
		{
			if(t1.getText().length()==0)
			{
				t1.setText("-");
			}
			else
			{
				try
				{
					op=2;
					a= Double.parseDouble(t1.getText());
					t1.setText("");
				}
				catch(Exception e)
				{}
			}
		}
		if(ss.equals("/"))
		{
			try
			{
				op=3;
				a = Double.parseDouble(t1.getText());
				t1.setText("");
			}
			catch(Exception e)
			{
				
			}
		}
		if(ss.equals("*"))
		{
			try
			{
				op=4;
				a = Double.parseDouble(t1.getText());
				t1.setText("");
			}
			catch(Exception e)
			{}
		}
		if(ss.equals("ON"))
		{
			for(int i=0;i<bn.length-1;i++)
			{
				bn[i].setEnabled(true);
			}
			bn[18].setLabel("OFF");
		}
		else if(ss.equals("OFF"))
		{
			for(int i=0;i<bn.length-1;i++)
			{
				bn[i].setEnabled(false);
				
			}
			bn[18].setLabel("ON");
			t1.setText("");
				a=0;
				b=0;
				c=0;
				op=0;
		}
		if(ss.equals("Clr"))
		{
			t1.setText("0");
			a=0;
			b=0;
			c=0;
			op=0;
		}
		if(ss.equals("Backspace"))
		{
			if(t1.getText().length()!=0)
			{
				String st = t1.getText();
				st = st.substring(0,st.length()-1);
				t1.setText(st);
			}
			
		}
		if(ss.equals("="))
		{
			try
			{
				b = Double.parseDouble(t1.getText());
				if(op == 1)
				{
					c=a+b;
					t1.setText(""+c);
				}
				if(op == 2)
				{
					c = a-b;
					t1.setText(""+c);		
				}
				if(op == 3)
				{
					c= a/b;
					t1.setText(""+c);
					if(t1.getText().equals("Infinity"))
					{
						Thread.sleep(2000);
						t1.setText("");
						a =0;
						b=0;
						c=0;
						op=0;
						
					}
				}
				if(op == 4)
				{
					c = a*b;
					t1.setText(""+c);
				}
			}
			catch(Exception e)
			{
				
			}
		}
	}
	public static void main(String args[])
	{
		new Calsi();
	}
}