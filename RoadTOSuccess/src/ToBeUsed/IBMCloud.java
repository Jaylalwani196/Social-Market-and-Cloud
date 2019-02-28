/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToBeUsed;

/**
 *
 * @author win 7
 */import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class IBMCloud extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public IBMCloud(){
        detail = new JTextArea(5,5);
        detail.setText("A full-stack cloud platform that spans public, private and hybrid environments.\n"
                + " Build with a robust suite of advanced data and AI tools,\n"
                + " and draw on deep industry expertise to help you on your journey to the cloud.");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.white);
        detail.setForeground(Color.black);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.ibm.com/cloud");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/ibm.jpg"));
        img.setIcon(icon);
        img.setToolTipText("IBMCloud");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" IBMCloud ");
		f.setContentPane(new IBMCloud());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
