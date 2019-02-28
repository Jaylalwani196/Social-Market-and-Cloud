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
public class AmazonServies extends JPanel implements ActionListener{
    JTextArea detail , intern , redirect ;
    JButton apply;
    JLabel link ,img  ;
    
    public AmazonServies(){
        detail = new JTextArea(5,5);
        detail.setText("Amazon usually refers to:\n" +
"•	Amazons, a mythical tribe of woman warriors\n" +
"•	Amazon rainforest, a rainforest covering most of the Amazon basin\n" +
"•	Amazon River, in South America\n" +
"•	Amazon (company), an online retailer and cloud computing conglomerate");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.black);
        detail.setForeground(Color.white);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.amazon.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/amazon.jpg"));
        img.setIcon(icon);
        img.setToolTipText("Amazon Services");
        add(img);
        
        apply = new JButton("APPLY");
        apply.addActionListener(this);
        apply.setBackground(Color.red);
        apply.setForeground(Color.white);
        
        intern = new JTextArea(5,5);
        intern.setText("If You are Interested in Working\n"
                + "APPLY HERE : ");
        intern.setOpaque(true);
        intern.setEditable(false);
        intern.setBackground(Color.black);
        intern.setForeground(Color.white);
        
        redirect = new JTextArea(5,5);
        redirect.setOpaque(true);
        redirect.setEditable(false);
        redirect.setBackground(Color.black);
        redirect.setForeground(Color.white);
        
        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout());
        pan.add(intern , BorderLayout.NORTH);
        pan.add(apply , BorderLayout.CENTER );
        pan.add(redirect, BorderLayout.SOUTH);
        
        
        setLayout(new BorderLayout());
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        add(pan , BorderLayout.EAST);
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" Amazon Services ");
		f.setContentPane(new AmazonServies());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    
    public void actionPerformed(ActionEvent ae){
        redirect.setText("You will be redirected to link at INTERNSHALA :\n"
                + "https://internshala.com/internships/internship-at-Amazon.com%2C%20Inc");
    }
}
