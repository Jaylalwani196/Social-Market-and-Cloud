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
public class Flipkart extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public Flipkart(){
        detail = new JTextArea(5,5);
        detail.setText("Flipkart Pvt Ltd. is an Indian electronic commerce \n"
                + "company based in Bengaluru, India. Founded by Sachin Bansal and Binny \n"
                + "Bansal in 2007, the company initially focused on book sales, before\n"
                + " expanding into other product categories such as consumer electronics, fashion, and lifestyle\n"
                + " products.");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.yellow);
        detail.setForeground(Color.blue);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.flipkart.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/flipkart.jpg"));
        img.setIcon(icon);
        img.setToolTipText("Flipkart");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" Flipkart ");
		f.setContentPane(new Flipkart());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
