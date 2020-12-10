package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us - Delhi Technological University");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/dtulogo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(450, 30, 150, 150);
            contentPane.add(l1);


            JLabel l3 = new JLabel("DtuOversight");
            l3.setForeground(new Color(0, 0, 0));
            l3.setFont(new Font("Arial", Font.BOLD , 34));
            l3.setBounds(100, 60, 300, 55);
            contentPane.add(l3);

            /*JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(0, 0, 0));
            l4.setFont(new Font("Arial", Font.BOLD, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);*/


            JLabel l6 = new JLabel("Developed By:");
            l6.setForeground(new Color(0, 0, 0));
            l6.setFont(new Font("Arial", Font.BOLD, 30));
            l6.setBounds(170, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Aiman Siddiqua");
            l7.setForeground(new Color(0, 0, 0));
            l7.setFont(new Font("Arial", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("2K18/MC/008");
            l8.setForeground(new Color(0, 0, 0));
            l8.setFont(new Font("Arial", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Apoorva");
            l9.setForeground(new Color(0, 0, 0));
            l9.setFont(new Font("Arial", Font.BOLD , 20));
            l9.setBounds(370, 260, 600, 34);
            contentPane.add(l9);
            
            JLabel l10 = new JLabel("2K18/MC/019");
            l10.setForeground(new Color(0, 0, 0));
            l10.setFont(new Font("Arial", Font.BOLD , 20));
            l10.setBounds(370, 290, 600, 34);
            contentPane.add(l10);
            
            JLabel l11 = new JLabel("Project - Object Oriented Programming (MC-307)");
            l11.setForeground(new Color(0, 0, 0));
            l11.setFont(new Font("Arial", Font.BOLD , 18));
            l11.setBounds(70, 350, 600, 25);
            contentPane.add(l11);
                
            contentPane.setBackground(Color.WHITE);
	}
        

}