package ToBeUsed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win 7
 */import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java.io.*;
import java.net.URL;
 import javax.imageio.ImageIO;
import javax.swing.border.BevelBorder;
 
public class myProject extends JFrame implements ActionListener {
    
    
    JDesktopPane desktop;
    JLabel status;
    UIManager.LookAndFeelInfo laf[];
    JToolBar toolBar;
    JMenuBar menuBar;
    JPopupMenu sideMenu;
    
    public myProject(){
        setLayout(new BorderLayout());
        
        desktop = new JDesktopPane(){
        Image desktopImg;
        ImageIcon desktopIcon;
        {
            desktopIcon = new ImageIcon(getClass().getResource("/services/javadeep.jpg"));
				desktopImg = desktopIcon.getImage();
        }
        
        protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(desktopImg, 0, 0, getWidth(), getHeight(), this);
			}
        };
        
        laf = UIManager.getInstalledLookAndFeels();
        status = new JLabel("Jay Services , Junior JAVA Developer");
        desktop.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		status.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		status.setFont(new Font("Time New Roman", Font.BOLD, 16));
        
              createToolBar();
              createMenuBar();
              
              getContentPane().add(desktop, BorderLayout.CENTER);
                getContentPane().add(status, BorderLayout.SOUTH);
                
                setTitle("Marketing and Web Services");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		ImageIcon icon1 = new ImageIcon(getClass().getResource("/icons/javaicon.png"));
		setIconImage(icon1.getImage());
		setVisible(true);            
    }
    
    public void  createToolBar(){
        toolBar  = new JToolBar();
        
        JButton btn1 = new JButton(new ImageIcon(getClass().getResource("/icons/amazon.png")));
        btn1.setActionCommand("amazon");
		btn1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn1.setToolTipText("Amazon Services");
		btn1.addActionListener(this);
		toolBar.add(btn1);
                
        JButton btn2 = new JButton(new ImageIcon(getClass().getResource("/icons/flipkart.png")));
        btn2.setActionCommand("flipkart");
		btn2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn2.setToolTipText("Flipkart Services");
		btn2.addActionListener(this);
		toolBar.add(btn2);

                
        JButton btn3 = new JButton(new ImageIcon(getClass().getResource("/icons/shopclues.png")));
        btn3.setActionCommand("shopclues");
		btn3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn3.setToolTipText("Shopclues Shopee");
		btn3.addActionListener(this);
		toolBar.add(btn3);
              
        JButton btn4 = new JButton(new ImageIcon(getClass().getResource("/icons/snapdeal.png")));
        btn4.setActionCommand("snapdeal");
		btn4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn4.setToolTipText("Snapdeal Marketing");
		btn4.addActionListener(this);
		toolBar.add(btn4);
                
                
        JButton btn5 = new JButton(new ImageIcon(getClass().getResource("/icons/myntra.png")));
        btn5.setActionCommand("myntra");
		btn5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn5.setToolTipText("Myntra Clothing");
		btn5.addActionListener(this);
		toolBar.add(btn5);
        
                toolBar.addSeparator();
                toolBar.addSeparator();
                
       JButton btn6 = new JButton(new ImageIcon(getClass().getResource("/icons/google.png")));
        btn6.setActionCommand("google");
		btn6.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn6.setToolTipText("Google Cloud");
		btn6.addActionListener(this);
		toolBar.add(btn6);
                 
        JButton btn7 = new JButton(new ImageIcon(getClass().getResource("/icons/ibm.png")));
        btn7.setActionCommand("ibm");
		btn7.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn7.setToolTipText("IBM Cloud");
		btn7.addActionListener(this);
		toolBar.add(btn7);
                
        JButton btn8 = new JButton(new ImageIcon(getClass().getResource("/icons/redhat.png")));
        btn8.setActionCommand("redhat");
		btn8.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn8.setToolTipText("Red Hat");
		btn8.addActionListener(this);
		toolBar.add(btn8);
        
        JButton btn9 = new JButton(new ImageIcon(getClass().getResource("/icons/adobe.png")));
        btn9.setActionCommand("adobe");
		btn9.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn9.setToolTipText("Adobe Services");
		btn9.addActionListener(this);
		toolBar.add(btn9);
        
                
        JButton btn10 = new JButton(new ImageIcon(getClass().getResource("/icons/microsoft.png")));
        btn10.setActionCommand("microsoft");
		btn10.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		btn10.setToolTipText("Microsoft Azure");
		btn10.addActionListener(this);
		toolBar.add(btn10);
                
                add(toolBar, BorderLayout.NORTH);
    }
    
    public void createMenuBar(){
        menuBar = new JMenuBar();
        menuBar.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
      JMenu menu1 = new JMenu("Marketing Service");
      menu1.setMnemonic('M');
      
        JMenu menu2 = new JMenu("Cloud Service");
        menu2.setMnemonic('C');
        
          JMenu menu3 = new JMenu("View Templates");
        menu3.setMnemonic('T');
      
    JMenuItem menuItem1 = new JMenuItem("Amazon Services", new ImageIcon(getClass().getResource("/icons/amazon.png")));
		menuItem1.setActionCommand("amazon");
		menuItem1.setMnemonic('A');
		menuItem1.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem1.addActionListener(this);
		menu1.add(menuItem1);
                
     JMenuItem menuItem2 = new JMenuItem("Flipkart Services", new ImageIcon(getClass().getResource("/icons/flipkart.png")));
		menuItem2.setActionCommand("flipkart");
		menuItem2.setMnemonic('F');
		menuItem2.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem2.addActionListener(this);
		menu1.add(menuItem2);
                
     JMenuItem menuItem3 = new JMenuItem("Shopclues Shoppe", new ImageIcon(getClass().getResource("/icons/shopclues.png")));
		menuItem3.setActionCommand("shopclues");
		menuItem3.setMnemonic('S');
		menuItem3.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem3.addActionListener(this);
		menu1.add(menuItem3); 
                
      JMenuItem menuItem4 = new JMenuItem("Snapdeal ", new ImageIcon(getClass().getResource("/icons/snapdeal.png")));
		menuItem4.setActionCommand("snapdeal");
		menuItem4.setMnemonic('A');
		menuItem4.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem4.addActionListener(this);
		menu1.add(menuItem4);
                
                
        JMenuItem menuItem5 = new JMenuItem("Myntra Clothing", new ImageIcon(getClass().getResource("/icons/myntra.png")));
		menuItem5.setActionCommand("myntra");
		menuItem5.setMnemonic('M');
		menuItem5.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem5.addActionListener(this);
		menu1.add(menuItem5);         

        
         JMenuItem menuItem6 = new JMenuItem("Google Cloud ", new ImageIcon(getClass().getResource("/icons/google.png")));
		menuItem6.setActionCommand("google");
		menuItem6.setMnemonic('O');
		menuItem6.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem6.addActionListener(this);
		menu2.add(menuItem6);
       
           JMenuItem menuItem7 = new JMenuItem("IBM Cloud ", new ImageIcon(getClass().getResource("/icons/ibm.png")));
		menuItem7.setActionCommand("ibm");
		menuItem7.setMnemonic('B');
		menuItem7.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem7.addActionListener(this);
		menu2.add(menuItem7);
                
         JMenuItem menuItem8 = new JMenuItem("Red Hat ", new ImageIcon(getClass().getResource("/icons/redhat.png")));
		menuItem8.setActionCommand("redhat");
		menuItem8.setMnemonic('O');
		menuItem8.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem8.addActionListener(this);
		menu2.add(menuItem8);
                
           JMenuItem menuItem9 = new JMenuItem("Adobe Services", new ImageIcon(getClass().getResource("/icons/adobe.png")));
		menuItem9.setActionCommand("adobe");
		menuItem9.setMnemonic('O');
		menuItem9.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem9.addActionListener(this);
		menu2.add(menuItem9);       
                
          JMenuItem menuItem10 = new JMenuItem("Microsoft Azure", new ImageIcon(getClass().getResource("/icons/microsoft.png")));
		menuItem10.setActionCommand("microsoft");
		menuItem10.setMnemonic('O');
		menuItem10.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.Event.CTRL_MASK));
		menuItem10.addActionListener(this);
		menu2.add(menuItem10);     
                
                
          JMenuItem menuItem11 = new JMenuItem("Exit");
		menuItem11.setActionCommand("Exit");
		menuItem11.setMnemonic('x');
		menuItem11.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.Event.CTRL_MASK));
		menuItem11.addActionListener(this);
		menu1.add(menuItem11);
                menu2.add(menuItem11);
                
                
         JCheckBoxMenuItem menuItem14 = new JCheckBoxMenuItem("Metal");
		menuItem14.setSelected(true);
		menuItem14.setActionCommand("Metal");
		menuItem14.setMnemonic('e');
		menuItem14.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.Event.CTRL_MASK));
		menuItem14.addActionListener(this);
		menu3.add(menuItem14);

		JCheckBoxMenuItem menuItem15 = new JCheckBoxMenuItem("Motif");
		menuItem15.setActionCommand("Motif");
		menuItem15.setMnemonic('f');
		menuItem15.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.Event.CTRL_MASK));
		menuItem15.addActionListener(this);
		menu3.add(menuItem15);

		JCheckBoxMenuItem menuItem16 = new JCheckBoxMenuItem("Nimbus");
		menuItem16.setActionCommand("Nimbus");
		menuItem16.setMnemonic('N');
		menuItem16.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.Event.CTRL_MASK));
		menuItem16.addActionListener(this);
		menu3.add(menuItem16);

		JCheckBoxMenuItem menuItem17 = new JCheckBoxMenuItem("Windows");
		menuItem17.setActionCommand("Windows");
		menuItem17.setMnemonic('W');
		menuItem17.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.Event.CTRL_MASK));
		menuItem17.addActionListener(this);
		menu3.add(menuItem17);

		JCheckBoxMenuItem menuItem18 = new JCheckBoxMenuItem("Windows Classic");
		menuItem18.setActionCommand("WindowsClassic");
		menuItem18.setMnemonic('C');
		menuItem18.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.Event.CTRL_MASK));
		menuItem18.addActionListener(this);
		menu3.add(menuItem18);

		ButtonGroup bg = new ButtonGroup();
		bg.add(menuItem14);
		bg.add(menuItem15);
		bg.add(menuItem16);
		bg.add(menuItem17);
		bg.add(menuItem18);
                
                
                menuBar.add(menu1);
               menuBar.add(menu2);
               menuBar.add(menu3);
		setJMenuBar(menuBar);
                
                
                
                sideMenu = new JPopupMenu();
		sideMenu.add(menuItem1);
		sideMenu.add(menuItem2);
		sideMenu.add(menuItem3);
		sideMenu.add(menuItem4);
		sideMenu.add(menuItem5);
		sideMenu.add(menuItem6);
		sideMenu.add(menuItem7);
		sideMenu.add(menuItem8);
		sideMenu.add(menuItem9);
		sideMenu.add(menuItem10);
		sideMenu.add(menuItem11);
		
		desktop.setComponentPopupMenu(sideMenu);
		
                
    }
    
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
		int i = -1;
		if (str.equals("Metal")) {
			i = 0;
		} else if (str.equals("Motif")) {
			i = 1;
		} else if (str.equals("Nimbus")) {
			i = 2;
		} else if (str.equals("Windows")) {
			i = 3;
		} else if (str.equals("WindowsClassic")) {
			i = 4;
		}

		if (i > -1) {
			try {
				UIManager.setLookAndFeel(laf[i].getClassName());
				SwingUtilities.updateComponentTreeUI(this);
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(this, "Unable to Apply Look And Feel");
			}
			return;
		}
                
                JInternalFrame internalFrame = new JInternalFrame("Title", true, true, true, true);
               if (str.equals("amazon")) {
			internalFrame.setTitle("Amazon Services");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/amazon.png")));
			internalFrame.setContentPane(new AmazonServies());
               }
               else if (str.equals("flipkart")) {
		internalFrame.setTitle("Flipkart Services");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/flipkart.png")));
			internalFrame.setContentPane(new Flipkart());
               }
                else if (str.equals("shopclues")) {
		internalFrame.setTitle("Shopclues Shopee");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/shopclues.png")));
			internalFrame.setContentPane(new Shopclues());
                }
               else if (str.equals("snapdeal")) {
		internalFrame.setTitle("Snapdeal Store");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/snapdeal.png")));
			internalFrame.setContentPane(new Snapdeal());
                }
               else if (str.equals("myntra")) {
		internalFrame.setTitle("Myntra Clothing");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/myntra.png")));
			internalFrame.setContentPane(new Myntra());
                }
               else if (str.equals("google")) {
		internalFrame.setTitle("Google Cloud");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/google.png")));
			internalFrame.setContentPane(new GoogleCloud());
                }
               else if (str.equals("ibm")) {
		internalFrame.setTitle("IBM Cloud");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/ibm.png")));
			internalFrame.setContentPane(new IBMCloud());
                }
               else if (str.equals("redhat")) {
		internalFrame.setTitle("Red Hat");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/redhat.png")));
			internalFrame.setContentPane(new RedHat());
                }
               else if (str.equals("adobe")) {
		internalFrame.setTitle("Adobe Service");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/adobe.png")));
			internalFrame.setContentPane(new Adobe());
                }
               else if (str.equals("microsoft")) {
		internalFrame.setTitle("Microsft Azure ");
			internalFrame.setFrameIcon(new ImageIcon(getClass().getResource("/icons/microsoft.png")));
			internalFrame.setContentPane(new MicrosoftAzure());
                }
               
               internalFrame.pack();
		internalFrame.setVisible(true);
		desktop.add(internalFrame, new Integer(1));
                
            }
    
     public static void main(String args[]) {
		new myProject();
	}
}
