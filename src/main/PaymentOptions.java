package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PaymentOptions extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton proceedBtn,CancelBtn;
	JRadioButton mobilePaymentRadioButton;
    JRadioButton cardPaymentRadioButton;
	
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	Font radioFont = new Font("Arial", Font.PLAIN, 16);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/PaymentOptions.jpg");
	
	
	public PaymentOptions()
	{
		super("Payment Options");
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
        
		
		mobilePaymentRadioButton = new JRadioButton("Mobile Payment");
		mobilePaymentRadioButton.setBounds(915,350,150,70);
		mobilePaymentRadioButton.setOpaque(false);
		mobilePaymentRadioButton.setFocusPainted(false);
		mobilePaymentRadioButton.setForeground(Color.white);
		mobilePaymentRadioButton.setFont(radioFont);
		p1.add(mobilePaymentRadioButton);
		
		cardPaymentRadioButton = new JRadioButton("Card Payment");
		cardPaymentRadioButton.setBounds(915,300,150,70);	
        cardPaymentRadioButton.setOpaque(false);
		cardPaymentRadioButton.setFocusPainted(false);
        cardPaymentRadioButton.setForeground(Color.white);
        cardPaymentRadioButton.setFont(radioFont);		
		p1.add(cardPaymentRadioButton);
		
		ButtonGroup paymentButtonGroup = new ButtonGroup();
        paymentButtonGroup.add(mobilePaymentRadioButton);
        paymentButtonGroup.add(cardPaymentRadioButton);
		
	    CancelBtn = new JButton("Cancel");
		CancelBtn.setBounds(850,500,105,30);
		CancelBtn.setFont(font);
		CancelBtn.setForeground(Color.white);
        CancelBtn.setBackground(new Color(142, 69, 133));
		CancelBtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		CancelBtn.addActionListener(this);
		CancelBtn.setFocusPainted(false);
		p1.add(CancelBtn);
		
		proceedBtn = new JButton("Proceed");
		proceedBtn.setBounds(1000,500,105,30);
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
		  
		  
	     if(ae.getSource()==CancelBtn)
		{
		
			this.setVisible(false);
			new HomePage();
			
		}
		
	
		
	   else if(ae.getSource()==proceedBtn) {
		   
                 String selectedOption = "";
           if (mobilePaymentRadioButton.isSelected()) {
               selectedOption = "Mobile Payment";
            } else if (cardPaymentRadioButton.isSelected()) {
                selectedOption = "Card Payment";
            }

        //       if (!selectedOption.isEmpty()) {
        //          JOptionPane.showMessageDialog(this, "Selected Option: " + selectedOption ,"CodingVibes",-1);
				  
         
               if (selectedOption.equals("Mobile Payment")) {
                    this.setVisible(false);
                    new MobilePayment();
					
              } else if (selectedOption.equals("Card Payment")) {
                   this.setVisible(false);
                   CardPayment cardPayment = new CardPayment();
                   cardPayment.setVisible(true);
                  }
                  } else {
                  JOptionPane.showMessageDialog(this, "Please select a payment option." ,"CodingVibes",-1);
            }   
        }  
  
	}



