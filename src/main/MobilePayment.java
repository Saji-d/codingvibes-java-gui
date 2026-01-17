package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MobilePayment extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton proceedBtn,BackBtn;
	JRadioButton bkash,rocket,nagad;
	
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	Font radioFont = new Font("Arial", Font.PLAIN, 16);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/MobilePayment.jpg");
	
	
	public MobilePayment()
	{
		super("Mobile Payment");
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
        
		
		bkash = new JRadioButton("");
		bkash.setBounds(860,260,150,70);
		bkash.setOpaque(false);
		bkash.setFocusPainted(false);
		p1.add(bkash);
		
		nagad = new JRadioButton("");
		nagad.setBounds(860,400,150,70);	
        nagad.setOpaque(false);
		nagad.setFocusPainted(false);	
		p1.add(nagad);
		
		rocket = new JRadioButton("");
		rocket.setBounds(860,535,150,70);	
        rocket.setOpaque(false);
		rocket.setFocusPainted(false);		
		p1.add(rocket);
		
		
		
		ButtonGroup paymentButtonGroup = new ButtonGroup();
        paymentButtonGroup.add(bkash);
        paymentButtonGroup.add(rocket);
		paymentButtonGroup.add(nagad);
		
	    BackBtn = new JButton("Cancel");
		BackBtn.setBounds(835,675,105,30);
		BackBtn.setFont(font);
		BackBtn.setForeground(Color.white);
        BackBtn.setBackground(new Color(142, 69, 133));
		BackBtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		BackBtn.addActionListener(this);
		BackBtn.setFocusPainted(false);
		p1.add(BackBtn);
		
		proceedBtn = new JButton("Proceed");
		proceedBtn.setBounds(1000,675,105,30);
		proceedBtn.setFont(font);
		proceedBtn.setForeground(Color.black);
        proceedBtn.setBackground(new Color(135, 206, 235));
		proceedBtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		proceedBtn.addActionListener(this);
		proceedBtn.setFocusPainted(false);
		p1.add(proceedBtn);  
		
	
		 this.setVisible(true);
		 
	} 
	
	
	
     public void actionPerformed(ActionEvent ae) {
		  
		  
	     if(ae.getSource()==BackBtn)
		{
		
			this.setVisible(false);
			new PaymentOptions();
			
		}
		
	
		
	     else if (ae.getSource() == proceedBtn) {
    if (!bkash.isSelected() && !nagad.isSelected() && !rocket.isSelected()) {
        JOptionPane.showMessageDialog(this, "Please select a payment option.", "CodingVibes!", JOptionPane.WARNING_MESSAGE);
    } else {
        if (bkash.isSelected()) {
            this.setVisible(false);
            new BkashPayment();
        } else if (nagad.isSelected()) {
            this.setVisible(false);
            new NagadPayment();
        } else if (rocket.isSelected()) {
            this.setVisible(false);
            new RocketPayment();
        }
    }
}
 
	}    

 
}
