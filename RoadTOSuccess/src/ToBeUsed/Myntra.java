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
public class Myntra extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public Myntra(){
        detail = new JTextArea(5,5);
        detail.setText("Myntra is an Indian fashion e-commerce company\n"
                + " headquartered in Bengaluru, Karnataka, India.[3] \n"
                + "The company was founded in 2007 to sell personalized gift items.[4]");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.pink);
        detail.setForeground(Color.white);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.myntra.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/myntra.jpg"));
        img.setIcon(icon);
        img.setToolTipText("Myntra");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" Myntra ");
		f.setContentPane(new Myntra());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
