import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ABC extends JFrame {
    //write a program to add two no by using grid layout

    ABC() {
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Enter First Number:");
        JTextField t1 = new JTextField(10);

        JLabel l2 = new JLabel("Enter Second Number:");
        JTextField t2 = new JTextField(10);

        JButton b = new JButton("Add");

        JLabel result = new JLabel("Result: ");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);
        add(result);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int c = Integer.parseInt(t2.getText());

                int sum = a + c;

                result.setText("Result: " + sum);
            }
        });

        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ABC();
    }
}