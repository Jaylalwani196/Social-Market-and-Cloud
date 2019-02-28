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
public class RedHat extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public RedHat(){
        detail = new JTextArea(5,5);
        detail.setText("Red Hat started as an enterprise Linux® provider. Now, we're a full-stack \n"
                + " enterprise open source software company. How did we do it? The answer lies in the\n"
                + " way we work. We're an open organization, and while it's helped us grow to meet market\n"
                + " demands, it's also something our customers notice and value.");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.red);
        detail.setForeground(Color.black);
        add(detail);
        
        link = new JLabel();       
        link.setText("www.redhat.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/redhat.jpg"));
        img.setIcon(icon);
        img.setToolTipText("RedHat");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" RedHat ");
		f.setContentPane(new RedHat());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
