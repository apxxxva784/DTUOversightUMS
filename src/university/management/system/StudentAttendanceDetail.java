package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Roll Number","DCC1","DCC2","GEC1","GEC2","OEC","HMC"};
    String d[][]=new String[15][7];  
    int i=0,j=0;
    
    StudentAttendanceDetail(){
        super("View Students Attendance");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance";
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("dcc1");
                d[i][j++]=rs.getString("dcc2");
                d[i][j++]=rs.getString("gec1");
                d[i][j++]=rs.getString("gec2");
                d[i][j++]=rs.getString("oec");
                d[i][j++]=rs.getString("hmc");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        //we are lazy!
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);
        
        b1.addActionListener(this);
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new StudentAttendanceDetail().setVisible(true);
    }
}
