package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Page extends JFrame implements ActionListener {
	
    JButton Adminbtn, Userbtn;
    JPanel p1;
	JLabel l1,l2;

    ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	
    public Page() {
        super("CodingVibes");
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setIconImage(icon1.getImage());
		this.setResizable(false);

        p1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the image from file
                Image img = new ImageIcon("Photos/Page.png").getImage();
                // Draw the image on the JPanel
                g.drawImage(img, 0, 0, 1200, 800, this);
            }
        };
        p1.setLayout(null);
		
		ImageIcon AdminIcon = new ImageIcon("Photos/AdminLogo.png");
    	ImageIcon UserIcon = new ImageIcon("Photos/UserLogo.png");
		
		l1 = new JLabel("Admin");
		l1.setBounds(319,660,200,45);
		l1.setForeground(new Color(175,238,238));
		l1.setFont(new Font("helvetica" , Font.BOLD ,20));
		p1.add(l1);
		
		l2= new JLabel("User");
		l2.setBounds(815,660,200,45);
		l2.setForeground(new Color(175,238,238));
		l2.setFont(new Font("helvetica" , Font.BOLD ,20));
		p1.add(l2);

        Adminbtn = new JButton(AdminIcon);
		Adminbtn.setBounds(315,600,68,67);
		Adminbtn.setForeground(Color.white);
        Adminbtn.setBackground(Color.black);
		Adminbtn.setFocusPainted(false);
		Adminbtn.setOpaque(false);
		Adminbtn.setBorder(null);
		Adminbtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Adminbtn.addActionListener(this);
		p1.add(Adminbtn);
		
        Userbtn = new JButton(UserIcon);
		Userbtn.setBounds(803,600,68,67);
		Userbtn.setForeground(Color.white);
        Userbtn.setBackground(Color.black);
		Userbtn.setFocusPainted(false);
		Userbtn.setOpaque(false);
		Userbtn.setBorder(null);
		Userbtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Userbtn.addActionListener(this);
		p1.add(Userbtn);
		
       
	   this.add(p1);
       this.setVisible(true);
    
}

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == Adminbtn) { 
		
		    this.setVisible(false);
			new AdminLogin();
			
        } else if (ae.getSource() == Userbtn) {
	        
            this.setVisible(false);
            new UserLogin();
			
        }
    }
}
     

