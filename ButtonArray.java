import java.awt.*;
import java.awt.event.*;


class ButtonArray extends WindowAdapter
{
	Frame fr;
	Dimension dim;
	public ButtonArray()
	{
		fr = new Frame();
		Button bn[] = new Button[100];
		fr.setTitle("Button Array");
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		fr.setSize(dim.width,dim.height);
		fr.setLayout(null);
		fr.setBackground(Color.gray);
		int x=100 ,y =100,w=1;
		for(int i =0; i<bn.length;i++)
		{
			bn[i] =  new Button(""+(i+1));
			bn[i].setFont(new Font("vardana",Font.BOLD,25));
			bn[i].setForeground(Color.red);
			bn[i].setBounds(x,y,100,30);
			if(w<10)
			{
				x = x+110;
				w++;
			}
			else
			{
				y = y+50;
				x =100;
				w = 1;
			}
			
			fr.add(bn[i]);
		}
		
		fr.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				fr.dispose();
			}
		});
		fr.setVisible(true);
	}
	public static void main(String args[])
	{
		new ButtonArray();
	}
}