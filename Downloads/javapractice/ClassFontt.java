import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ClassFontt extends JFrame 
{
	  JLabel l1=new JLabel("Welcom");
	  ClassFontt()
	  {
		  setSize(500,400);
		  setVisible(true);
		  setLayout(new FlowLayout());
		  add(l1);
		  addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
				  l1.setText("Mouse Clicked");
			  }
		  });

	 }
	 
	 public static void main(String arg[])
	 {
		 new ClassFontt();
	 }
}