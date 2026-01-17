package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FinishingPage extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton finish;
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/LastPage.jpg");
	
	
	public FinishingPage()
	{
		super("THANKS");
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
		
		
		finish = new JButton("Finish");
		finish.setBounds(543,420,120,35);
		finish.setFont(font);
		finish.setForeground(Color.white);
        finish.setBackground(new Color(0, 123, 167));
		finish.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		finish.addActionListener(this);
		finish.setFocusPainted(false);
		p1.add(finish);  
		
	
		 this.setVisible(true);
		 
	} 
	
	
	
	 public void actionPerformed(ActionEvent ae) {
		  
		  
	     if(ae.getSource()==finish)
		{
			
			this.setVisible(false);
			new HomePage();
			
		}
		
	}
 
}
