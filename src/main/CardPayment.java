package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CardPayment extends JFrame implements ActionListener {

	JPanel p1;
    JButton Cancel,Pay;
	JTextField cardholdername,cvc,ym,cardnumber;
    
	
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/CardPayment.jpg");
	
	
	public CardPayment()
	{
		super("Card Payment");
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
		
		
		cardnumber = new MyTextField();
		cardnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cardnumber.setOpaque(false);
		cardnumber.setForeground(Color.white);
		cardnumber.setBounds(740, 280, 280, 40);
		((MyTextField) cardnumber).setHint("Enter Card Number");
		p1.add(cardnumber);

		ym = new MyTextField();
		ym.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ym.setOpaque(false);
		ym.setForeground(Color.white);
		ym.setBounds(740, 330, 130, 40);
		((MyTextField) ym).setHint("MM/YY");
		p1.add(ym);

		cvc = new MyTextField();
		cvc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cvc.setOpaque(false);
		cvc.setForeground(Color.white);
		cvc.setBounds(890, 330, 130, 40);
		((MyTextField) cvc).setHint("CVC/CVV");
		p1.add(cvc);

		cardholdername = new MyTextField();
		cardholdername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cardholdername.setOpaque(false);
		cardholdername.setForeground(Color.white);
		cardholdername.setBounds(740, 380, 280, 40);
		((MyTextField) cardholdername).setHint("Card Holder Name");
		p1.add(cardholdername);
		
		Cancel = new JButton("Cancel");
		Cancel.setBounds(740,430,130,40);
		Cancel.setFont(font);
		Cancel.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Cancel.addActionListener(this);
		Cancel.setFocusPainted(false);
		Cancel.setForeground(Color.white);
        Cancel.setBackground(new Color(142, 69, 133));
		p1.add(Cancel);
		
		Pay = new JButton("Pay"); 
		Pay.setBounds(890,430,130,40);
		Pay.setFont(font);
		Pay.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
	
	    Pay.setFocusPainted(false);
		Pay.addActionListener(this);
		Pay.setForeground(Color.black);
        Pay.setBackground(Color.yellow);
		p1.add(Pay);
		
		this.setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == Pay) {
            if (cardnumber.getText().equals("") || ym.getText().equals("") || cvc.getText().equals("") || cardholdername.getText().equals("")) {
               JOptionPane.showMessageDialog(null, "You need to fill all information", "CodingVibes", JOptionPane.WARNING_MESSAGE);
			}

			else {
				JOptionPane.showMessageDialog(null, "Payment Complete", "Thank You", -1);
                    this.setVisible(false);
					new FinishingPage();
			}
        }
        if (e.getSource() == Cancel){
            this.setVisible(false);
			new PaymentOptions();
        }
    }

}