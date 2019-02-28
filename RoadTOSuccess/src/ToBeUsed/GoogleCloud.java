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
public class GoogleCloud extends JPanel {
    JTextArea detail;
    JLabel link ,img  ;
    
    public GoogleCloud(){
        detail = new JTextArea(5,5);
        detail.setText("Google Cloud Platform, offered by Google,\n"
                + " is a suite of cloud computing services that runs on the same infrastructure\n"
                + " that Google uses internally for its end-user products, such as Google Search and YouTube.[1] \n" +
"Google Cloud Platform provides Infrastructure as a service,\n"
                + " Platform as a service, and Serverless computing environments");
        detail.setOpaque(true);
        detail.setEditable(false);
        detail.setBackground(Color.green);
        detail.setForeground(Color.blue);
        add(detail);
        
        link = new JLabel();       
        link.setText("cloud.google.com");
        link.setFont(new Font("Times New Roman", Font.BOLD, 24));
        link.setToolTipText("Website link");
        add(link);
        
        img = new JLabel();
        Icon icon = new ImageIcon(getClass().getResource("/services/google.jpg"));
        img.setIcon(icon);
        img.setToolTipText("GoogleCloud");
        add(img);
        
        
        setLayout(new BorderLayout(20,20));
        add(detail , BorderLayout.NORTH);
        add(link , BorderLayout.SOUTH);
        add(img , BorderLayout.WEST);
        
        
        
    }
    public static void main(String args[]){
        JFrame f = new JFrame(" GoogleCloud ");
		f.setContentPane(new GoogleCloud());
		f.setBounds(10, 10, 750, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
