package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendance extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c2,fh,sh;
    
    StudentAttendance(){
       
        setLayout(null);
        c2 = new Choice();
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from attendance");
            while(rs.next()){
                c2.add(rs.getString("rollno"));    
            }
      
      
       }catch(Exception e){ }
        
        JLabel l9= new JLabel("UPDATE ATTENDANCE"); 
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setBounds(70,20,300,50);
        add(l9);
       
        JLabel l8= new JLabel("Roll Number:"); 
        l8.setBounds(20,100,100,20);
        add(l8);
        c2.setBounds(170,100,150,20);
        add(c2);
      
        l1 = new JLabel("Subject");
        fh = new Choice();
        fh.add("dcc1");
        fh.add("dcc2");
        fh.add("gec1");
        fh.add("gec2");
        fh.add("oec");
        fh.add("hmc");
       
        l1.setBounds(20,150,100,20);
        add(l1);
        fh.setBounds(170,150,150,20);
        add(fh);
        
        l2 = new JLabel("Attendance");
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
       
        l2.setBounds(20,200,100,20);
        add(l2);
        sh.setBounds(170,200,150,20);
        add(sh);
       
        b1 =new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(20,300,150,30);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,300,150,30);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        Color cl = new Color(215, 210, 245);
        getContentPane().setBackground(cl);
        
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);
       
    }
    
    public void actionPerformed(ActionEvent ae){
       
        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        
        String cnt = "0";
        if(s=="Present"){
            cnt = "1";
        }
        
        String qry2 = "update attendance set "+f+" = "+f+" + " + cnt + " where rollno=\""+ id +"\"";
        String qry3 = "update attendance set t"+f+" = t"+f+" + 1 where rollno=\""+ id +"\"";
        
        try{
            if(ae.getSource()==b1){
                conn c1 = new conn();
                c1.s.executeUpdate(qry2);
                c1.s.executeUpdate(qry3);
                JOptionPane.showMessageDialog(null,"Attendance confirmed");
                this.setVisible(false);
            }else{
                setVisible(false);
            }
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    
    public static void main(String s[]){
        new StudentAttendance();
    }
}