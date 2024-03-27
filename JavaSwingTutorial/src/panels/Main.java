package panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        
        //JPanel è un componente che serve a contenere altri componenti

        JLabel lable = new JLabel();
        lable.setText("Lorem ipsum.");
        JLabel lable2 = new JLabel("Sample Text");
        lable2.setBounds(150, 100, 100, 50);

        JPanel panel1= new JPanel();
        panel1.setBackground(new Color(0xBC85E2));
        panel1.setBounds(0, 50, 200, 200);

        JPanel panel2= new JPanel();
        panel2.setBackground(new Color(0x3EDDEF));
        panel2.setBounds(200, 50, 200, 200);
        panel2.setLayout(new BorderLayout());

        JPanel panel3= new JPanel();
        panel3.setBackground(new Color(0xEEA44F));
        panel3.setBounds(0, 250, 400, 200);
        panel3.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0xBEE16E));

        panel2.add(lable);
        lable.setHorizontalAlignment(JLabel.CENTER);

        panel3.add(lable2);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

    }
    
}
