package university.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,j1,j2,j3,j4,j5,j6;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b1;

    EnterMarks(){

        setSize(500,550);
        setLocation(400,200);
        setLayout(null);

        l1 = new JLabel("Update marks");
        l1.setFont(new Font("Arial", Font.BOLD, 30));
        l1.setBounds(120,0,500,80);
        add(l1);

        l2 = new JLabel("Enter Roll Number");
        l2.setBounds(50,90,200,40);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(180,100,200,20);
        add(t1);

        l3 = new JLabel("Subject");
        l3.setBounds(50,150,200,40);
        add(l3);

        l4 = new JLabel("Grade Point");
        l4.setBounds(200,150,200,40);
        add(l4);

        j1 = new JLabel("DCC-1");
        j1.setBounds(50,200,200,20);
        add(j1);

        t3 = new JTextField();
        t3.setBounds(200,200,200,20);
        add(t3);

        j2 = new JLabel("DCC-2");
        j2.setBounds(50,230,200,20);
        add(j2);

        t5 = new JTextField();
        t5.setBounds(200,230,200,20);
        add(t5);

        j3 = new JLabel("GEC-1");
        j3.setBounds(50,260,200,20);
        add(j3);

        t7 = new JTextField();
        t7.setBounds(200,260,200,20);
        add(t7);

        j4 = new JLabel("GEC-2");
        j4.setBounds(50,290,200,20);
        add(j4);

        t9 = new JTextField();
        t9.setBounds(200,290,200,20);
        add(t9);

        j5 = new JLabel("OEC");
        j5.setBounds(50,320,200,20);
        add(j5);

        t11 = new JTextField();
        t11.setBounds(200,320,200,20);
        add(t11);
        
        j6 = new JLabel("HMC");
        j6.setBounds(50,350,200,20);
        add(j6);

        t2 = new JTextField();
        t2.setBounds(200,350,200,20);
        add(t2);

        b1 = new JButton("Submit");
        b1.setBounds(180,400,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                conn c1 = new conn();
                String s2 = "insert into marks values('"+t1.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+t7.getText()+"','"+t9.getText()+"','"+t11.getText()+"','"+t2.getText()+"')";

                c1.s.executeUpdate(s2);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);

            }
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new EnterMarks().setVisible(true);
    }
}