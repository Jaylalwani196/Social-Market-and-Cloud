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
public class Snapdeal extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public Snapdeal(){
        detail = new JTextArea(5,5);
        detail.setText("Snapdeal is an Indian e-commerce company based in\n"
                + " New Delhi, India. The company was started by Kunal Bahl\n"
                + " and Rohit Bansal in February 2010. As of 2014, Snapdeal had 3,00,000\n"
                + " sellers, over 3 crore products across 800+ diverse categories\n"
                + " from over 1,25,000 regional, national, and international brands \n"
                + "and retailers and a reach of 6,000 towns and cities across the country");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.red);
        detail.setForeground(Color.white);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.snapdeal.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/snapdeal.jpg"));
        img.setIcon(icon);
        img.setToolTipText("Snapdeal");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" Snapdeal ");
		f.setContentPane(new Snapdeal());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
