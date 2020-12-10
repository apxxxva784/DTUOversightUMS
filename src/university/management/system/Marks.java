package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   JLabel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
   String s1,s2,s3,s4,s5,s6;
   
   Marks(){}
   Marks(String str){
       
       mark(str);
       
       setSize(500,500);
       setLocation(450,200);
       setLayout(null);
       Color cl = new Color(215, 215, 245);
       getContentPane().setBackground(cl);
       
       p1 = new JLabel("RESULT");
       p1.setFont(new Font("serif", Font.BOLD, 30));
       p1.setBounds(170,15,200,40);
       add(p1);
       
       p2 = new JLabel("Roll No.-");
       p2.setFont(new Font("Arial", Font.BOLD, 20));
       p2.setBounds(50,70,100,40);
       add(p2);
                                  
       p3 = new JLabel(str);
       p3.setFont(new Font("Arial", Font.BOLD, 20));
       p3.setBounds(150,70,200,40);
       add(p3);

       p4 = new JLabel("SUBJECT");
       p4.setFont(new Font("Arial", Font.BOLD, 20));
       p4.setBounds(50,120,100,40);
       add(p4);
       
       p5 = new JLabel("GRADE POINT");
       p5.setFont(new Font("Arial", Font.BOLD, 20));
       p5.setBounds(230,120,200,40);
       add(p5);
       
       p6 = new JLabel("DCC-1");
       p6.setFont(new Font("Arial", Font.PLAIN, 18));
       p6.setBounds(50,170,100,40);
       add(p6);
       
       p7 = new JLabel(s1);
       p7.setFont(new Font("Arial", Font.PLAIN, 18));
       p7.setBounds(280,170,100,40);
       add(p7);
       
       p8 = new JLabel("DCC-2");
       p8.setFont(new Font("Arial", Font.PLAIN, 18));
       p8.setBounds(50,200,100,40);
       add(p8);
       
       p9 = new JLabel(s2);
       p9.setFont(new Font("Arial", Font.PLAIN, 18));
       p9.setBounds(280,200,100,40);
       add(p9);
       
       p10 = new JLabel("GEC-1");
       p10.setFont(new Font("Arial", Font.PLAIN, 18));
       p10.setBounds(50,230,100,40);
       add(p10);
       
       p11 = new JLabel(s3);
       p11.setFont(new Font("Arial", Font.PLAIN, 18));
       p11.setBounds(280,230,100,40);
       add(p11);
       
       p12 = new JLabel("GEC-2");
       p12.setFont(new Font("Arial", Font.PLAIN, 18));
       p12.setBounds(50,260,100,40);
       add(p12);
       
       JLabel p13 = new JLabel(s4);
       p13.setFont(new Font("Arial", Font.PLAIN, 18));
       p13.setBounds(280,260,100,40);
       add(p13);
       
       JLabel p14 = new JLabel("OEC");
       p14.setFont(new Font("Arial", Font.PLAIN, 18));
       p14.setBounds(50,290,100,40);
       add(p14);
       
       JLabel p15 = new JLabel(s5);
       p15.setFont(new Font("Arial", Font.PLAIN, 18));
       p15.setBounds(280,290,100,40);
       add(p15);
       
       JLabel p16 = new JLabel("HMC");
       p16.setFont(new Font("Arial", Font.PLAIN, 18));
       p16.setBounds(50,320,200,40);
       add(p16);
       
       JLabel p17 = new JLabel(s6);
       p17.setFont(new Font("Arial", Font.PLAIN, 18));
       p17.setBounds(280,320,100,40);
       add(p17);
       
       JLabel p18 = new JLabel("SGPA - ");
       p18.setFont(new Font("Arial", Font.BOLD, 22));
       p18.setBounds(50,370,100,40);
       add(p18);
       
       double m1 = Double.parseDouble(s1); 
       double m2 = Double.parseDouble(s2);
       double m3 = Double.parseDouble(s3); 
       double m4 = Double.parseDouble(s4);
       double m5 = Double.parseDouble(s5);
       double m6 = Double.parseDouble(s6); 
       
       double gpa = ((m1+m2+m3+m4)*4+(m5+m6)*3)/22;
       
       double r = (double) Math.round(gpa * 100) / 100;
       
       String sgpa = String.valueOf(r);
       
       JLabel p19 = new JLabel(sgpa);
       p19.setFont(new Font("Arial", Font.BOLD, 22));
       p19.setBounds(140,370,100,40);
       add(p19);
       
   }
   
   public void mark(String s){
    try{
           conn c = new conn();
           
           String str = "select * from marks where rollno=\'"+s+"\'";
           
           ResultSet rs2 = c.s.executeQuery(str);
                      
           if(rs2.next()){
               s1 = rs2.getString("marks1");
               s2 = rs2.getString("marks2");
               s3 = rs2.getString("marks3");
               s4 = rs2.getString("marks4");
               s5 = rs2.getString("marks5");
               s6 = rs2.getString("marks6");
           }
           else{
               JOptionPane.showMessageDialog(null,"Result not found"); 
               this.setVisible(false);
               System.exit(0);
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Marks().setVisible(true);
   }
}
