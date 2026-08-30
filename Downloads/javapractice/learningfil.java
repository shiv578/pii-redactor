//WAP to Create a JComboBox and do event handling

import javax.swing.*;



import java.awt.*;
import java.awt.event.*;

class learningfil extends JFrame implements ItemListener
{
	//JComboBox c1=new JComboBox();
	JComboBox<String> c1=new JComboBox<>();
	JLabel l1=new JLabel("");

	learningfil()
	{
		setSize(500,400);
		setVisible(true);
		setLayout(new FlowLayout());
		c1.addItem("java");
		c1.addItem("C++");
		c1.addItem("DSA");
		c1.addItem("Python");
		add(c1);add(l1);
	    c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		String str=(String)c1.getSelectedItem();
		l1.setText("Seleted item is: "+str);
	}
	public static void main(String arg[])
	{
		new learningfil();
	}
}
