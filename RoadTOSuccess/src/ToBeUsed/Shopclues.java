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
public class Shopclues extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public Shopclues(){
        detail = new JTextArea(5,5);
        detail.setText("ShopClues is an online marketplace owned by Clues Network Pvt. Ltd.\n"
                + " It was established in July 2011 in Silicon Valley by Sanjay Sethi, Sandeep Aggarwal \n"
                + "and Radhika Aggarwal.[3] Based in Gurgaon, India,[4] the company claims to have over 6 \n"
                + "lakh merchants and 2.8 crore products on its platform,\n "
                + "serving over 32,000 pincodes across the country.[5]");
        detail.setOpaque(true);
        detail.setBackground(Color.white);
        detail.setForeground(Color.blue);
        detail.setEditable(false);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.shopclues.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/shopclues.jpg"));
        img.setIcon(icon);
        img.setToolTipText("Shopclues");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" Shopclues ");
		f.setContentPane(new Shopclues());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
