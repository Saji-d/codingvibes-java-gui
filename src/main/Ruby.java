package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ruby extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton Back,Exit,cart,buy;
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("CourseImages/Ruby.png");
	
	
	public Ruby()
	{
		super("Ruby Course");
		this.setSize(1200,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(icon1.getImage());
		
		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,1200,800);
		p1.setOpaque(false);
		this.add(p1);
		this.setLayout(null);
		
		JLabel background = new JLabel(icon);
		background.setBounds(0,0,1200,800);
		this.add(background);
		
	    Back = new JButton("Back");
		Back.setBounds(60,700,120,40);
		Back.setFont(font);
		Back.setForeground(Color.white);
        Back.setBackground(Color.blue);
		Back.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Back.addActionListener(this);
		Back.setFocusPainted(false);
		p1.add(Back);
		
		Exit = new JButton("Exit");
		Exit.setBounds(1000,700,120,40);
		Exit.setFont(font);
		Exit.setForeground(Color.white);
        Exit.setBackground(Color.red);
		Exit.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Exit.addActionListener(this);
		Exit.setFocusPainted(false);
		p1.add(Exit);  
		
	    cart = new JButton("Add to Cart");
		cart.setBounds(860,410,130,35);
		cart.setFont(font);
		cart.setForeground(Color.black);
        cart.setBackground(new Color(144,238,144));
		cart.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		cart.addActionListener(this);
		cart.setFocusPainted(false);
		p1.add(cart);
		
		buy = new JButton("Buy");
		buy.setBounds(1015,410,100,35);
		buy.setFont(font);
		buy.setForeground(Color.black);
        buy.setBackground(new Color(255,165,0));
		buy.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		buy.addActionListener(this);
		buy.setFocusPainted(false);
		p1.add(buy);
		
		 this.setVisible(true);
	} 
	
	
	
	 	  public void actionPerformed(ActionEvent ae) {
		  
	  	  if(ae.getSource()==Back)
		{
			
			this.setVisible(false);
			new Courses2();
			
		}
		
		else if (ae.getSource() == buy){
			int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to buy the course?", "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                new PaymentOptions();
				this.setVisible(false);
            }
            }
		
		else if(ae.getSource()==cart)
		{
			JOptionPane.showMessageDialog(this, "Ruby has been added to your cart","CodingVibes",-1);
			
			this.setVisible(false);
			CartPage cartPage = new CartPage();
			cartPage.addToCart("Ruby", "3.5 weeks", "4000 Taka");
			cartPage.setVisible(false);
			new Courses2();
			
		}
		

		
    	else if (ae.getSource() == Exit){
			int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            }
	}

 
}