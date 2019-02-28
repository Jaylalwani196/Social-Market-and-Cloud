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
public class MicrosoftAzure extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public MicrosoftAzure(){
        detail = new JTextArea(5,5);
        detail.setText("Creative Cloud gives you the world’s best apps and services for video,\n"
                + " design, photography and the web. It’s easy to get started with built-in tutorials\n"
                + " and templates. Whether you’re a beginner or a pro, you have /n"
                + "everything you need to go from dreaming to doing, wherever you’re inspired.");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.blue);
        detail.setForeground(Color.white);
        add(detail);
        
        link = new JLabel();       
        link.setText("azure.microsoft.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/microsoft.jpg"));
        img.setIcon(icon);
        img.setToolTipText("MicrosoftAzure");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" MicrosoftAzure ");
		f.setContentPane(new MicrosoftAzure());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
