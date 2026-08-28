import javax.swing.*;
import java.awt.*;

public class ClassFont extends JFrame{
	JLabel  l1=new JLabel("Name");
	JLabel  l2=new JLabel("Adress");
	JTextField tf1=new JTextField();
	JButton b1=new JButton();
	
	
	ClassFont(){
		setSize(600,800);
		setVisible(true);
		setLayout(new FlowLayout());
		l1.setForeground(Color.RED);
		l2.setForeground(Color.BLACK);
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.BLUE);
		//new mwtrhod to give color to background
		Color c=new Color(176,100,160);
		b1.setBackground(c);
		//new method to give set font type size and bold
		Font f=new Font("Arial",Font.BOLD,20);
		l1.setFont(f);
		add(l1);add(tf1);add(l2);add(b1);

		
	}
	
    public static void main(String[] args) {
    	new ClassFont();
    }
}