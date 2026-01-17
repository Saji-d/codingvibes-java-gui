package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import Interfaces.*;


public class UserSignup extends JFrame implements ActionListener , UserSignupInterface {
	
	Color color = new Color(195,195,195);
	JLabel l1,l2,l3,l4,l5,l6;
	JPanel p1,p2;
	JButton Back,SignUp,Login;
	JTextField screen1;
	JPasswordField screen2;
	JTextField mobileField,emailField;
	JCheckBox showpassBox;
	Font font = new Font("Times New Roman", Font.PLAIN, 20); //cambria
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/BG.png");
	


	
	
	public UserSignup ()
	{
		
		super("User Sign-Up");
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
		
		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(340,55,550,600);
		p2.setBackground(new Color(0,0,0,130));
		p1.add(p2);
		p2.setLayout(null);
		
		l1 = new JLabel("Sign Up");
		l1.setBounds(205,40,200,45);
		l1.setForeground(new Color(255,255,255));
		l1.setFont(new Font("helvetica" , Font.BOLD ,30));
		p2.add(l1);
		
		l2= new JLabel("Username : ");
		l2.setBounds(140,100,200,45);
		l2.setForeground(new Color(255,255,255));
		l2.setFont(new Font("cambria" , Font.BOLD ,20));
		p2.add(l2);
		
		
		l3 = new JLabel("Password : ");
		l3.setBounds(140,190,200,45);
		l3.setForeground(new Color(255,255,255));
		l3.setFont(new Font("cambria" , Font.BOLD ,20));
		p2.add(l3);
		
	    l4 = new JLabel("Mobile Number :");
		l4.setBounds(140,300,200,45);
		l4.setForeground(new Color(255,255,255));
		l4.setFont(new Font("cambria" , Font.BOLD ,20));
		p2.add(l4);
		
        l5 = new JLabel("Email Address :");
		l5.setBounds(140,390,200,45);
		l5.setForeground(new Color(255,255,255));
		l5.setFont(new Font("cambria" , Font.BOLD ,20));
		p2.add(l5);
		
		l6 = new JLabel("Already have an account?");
		l6.setBounds(465,655,240,45);
		l6.setForeground(new Color(255,255,255));
		l6.setFont(new Font("cambria" , Font.BOLD ,20));
		p1.add(l6);
		
	
	
		screen1 = new JTextField(); 
		screen1.setBounds(140,140,250,35);
		screen1.setFont(new Font("cambria" , Font.PLAIN ,20));
		screen1.setBackground(new Color(255,255,255,250));
		p2.add(screen1);
		
		screen2 = new JPasswordField();
		screen2.setBounds(140,230,250,35);
		screen2.setFont(new Font("cambria" , Font.PLAIN ,20));
		screen2.setBackground(new Color(255,255,255,250));
		p2.add(screen2);
		
		mobileField = new JTextField("+880");
		mobileField.setBounds(140,340,250,35);
		mobileField.setFont(new Font("cambria" , Font.PLAIN ,20));
		mobileField.setBackground(new Color(255,255,255,250));
		p2.add(mobileField);
		
		emailField = new JTextField();
		emailField.setBounds(140,430,250,35);
		emailField.setFont(new Font("cambria" , Font.PLAIN ,20));
		emailField.setBackground(new Color(255,255,255,250));
		p2.add(emailField);
		
		Login = new JButton("Log In");
		Login.setBounds(695,662,68,30);
		Login.setFont(new Font("cambria" , Font.BOLD ,20));
		Login.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Login.addActionListener(this);
		Login.setFocusPainted(false);
		Login.setForeground(new Color(0, 191, 255));
        Login.setBackground(Color.black);
		Login.setOpaque(false);
		Login.setBorder(BorderFactory.createEmptyBorder());
		p1.add(Login);
		
		
		Back = new JButton("Back");
		Back.setBounds(140,500,120,40);
		Back.setFont(font);
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
		Back.setForeground(Color.white);
        Back.setBackground(Color.blue);
		p2.add(Back);
		
		SignUp = new JButton("Sign Up");
		SignUp.setBounds(270,500,120,40);
		SignUp.setFont(font);
		SignUp.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		SignUp.addActionListener(this);
		SignUp.setFocusPainted(false);
		SignUp.setForeground(Color.black);
        SignUp.setBackground(Color.green);
		p2.add(SignUp);
		
		


        showpassBox = new JCheckBox("Show Password");
		showpassBox.setBounds(140,278,125,15);
		showpassBox.setForeground(new Color(255,255,255));
		showpassBox.setOpaque(false);
		showpassBox.setFocusPainted(false);
		showpassBox.addActionListener(this);
		p2.add(showpassBox);
		
		
	    this.setVisible(true);
	}


         public void saveSignupData(String username, char[] password, String mobileNumber, String email,String formattedDateTime) {
			 
    try {
        File file = new File("Data/User_Data.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);

        bufferWriter.write("\n"+"       USER LOGIN DATA      "+"\n"+"\nUsername      : " + username + "\nPassword      : " + new String(password) + "\nMobile Number : " + mobileNumber + "\nEmail Address : " + email + "\nDate & Time   : "+ formattedDateTime+"\n_____________________________________");
        bufferWriter.newLine();
        bufferWriter.close();
        JOptionPane.showMessageDialog(p2, "Sign up successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
		
	    UserSignup.this.setVisible(false);
        new UserLogin();
		
    } catch (IOException e){
        JOptionPane.showMessageDialog(p2, "Failed to save sign up data.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    



  @Override

public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == Back) {
        this.setVisible(false);
        new Page();
    } else if (ae.getSource() == showpassBox) {
        if (showpassBox.isSelected()) {
            screen2.setEchoChar((char) 0);
        } else {
            screen2.setEchoChar('•');
        }
    } else if (ae.getSource() == Login) {
        this.setVisible(false);
        new UserLogin();
    } 
	
	else if (ae.getSource() == SignUp) {
        String username = screen1.getText();
        char[] password = screen2.getPassword();
        String mobileNumber = mobileField.getText();
        String email = emailField.getText();

        if (username.isEmpty() || password.length == 0 || mobileNumber.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(p2, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);

       saveSignupData(username, password, mobileNumber, email, formattedDateTime);
    }
}


}