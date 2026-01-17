package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import Interfaces.*;

public class AdminLogin extends JFrame implements ActionListener , AdminLoginInterface {
 
    JLabel adminLabel,userLabel, passLabel,logoLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginBtn, backBtn;
	JPanel p1;
	JCheckBox showpassBox;
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
    ImageIcon icon = new ImageIcon ("Photos/AdminBG.jpg");

    public AdminLogin()
	{

        super("Admin Login");
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
		
		adminLabel=new JLabel("ADMIN LOGIN");
		adminLabel.setFont(new Font("Times New Roman",Font.BOLD,30));
		adminLabel.setBounds(757,135,300,65);
		adminLabel.setForeground(Color.WHITE);
		p1.add(adminLabel);

        userLabel = new JLabel("Username :");
        userLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        userLabel.setBounds(755, 215, 220, 30);
		userLabel.setForeground(Color.WHITE);
        p1.add(userLabel);
		
		userText = new JTextField();
        userText.setFont(new Font("cambria", Font.PLAIN, 20));
        userText.setBounds(755,260, 220,30);
        p1.add(userText);

        passLabel = new JLabel("Password :");
        passLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        passLabel.setBounds(755,300,220, 30);
		passLabel.setForeground(Color.WHITE);
        p1.add(passLabel);
		
		passText = new JPasswordField();
        passText.setFont(new Font("cambria", Font.PLAIN, 20));
        passText.setBounds(755,345,220,30);
        p1.add(passText);

        backBtn = new JButton("Back");
        backBtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        backBtn.setBounds(758,415, 90, 30);
		backBtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		backBtn.addActionListener(this);
		backBtn.setFocusPainted(false);
		backBtn.setForeground(Color.white);
        backBtn.setBackground(Color.blue);
        p1.add(backBtn);

        loginBtn = new JButton("Login");
        loginBtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        loginBtn.setBounds(886,415, 90, 30);
		loginBtn.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		loginBtn.setFocusPainted(false);
		loginBtn.setForeground(Color.black);
        loginBtn.setBackground(Color.green);
        p1.add(loginBtn);
		
			loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String username = userText.getText();
                char[] password = passText.getPassword();
				if (username.isEmpty() || password.length == 0 ) {
               JOptionPane.showMessageDialog(p1, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                boolean loggedIn = checkLoginData(username, password);
                if (loggedIn) {
                    JOptionPane.showMessageDialog(p1, "Welcome back Admin!", "CodingVibes",
                            JOptionPane.INFORMATION_MESSAGE);
							
							
					        AdminLogin.this.setVisible(false);
                         	new AdminDashboard0();
							
							}
							
                 else {
                    JOptionPane.showMessageDialog(p1, "Incorrect username or password.", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

       	showpassBox = new JCheckBox("Show Password");
		showpassBox.setBounds(755,385,125,15);
		showpassBox.setForeground(new Color(255,255,255));
		showpassBox.setOpaque(false);
		showpassBox.addActionListener(this);
		p1.add(showpassBox);

        this.setVisible(true);
		
	}
	
	    public boolean checkLoginData(String username, char[] password) {
    try {
        File file = new File("Data/Admin_Data.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bufferReader = new BufferedReader(reader);

        String line;
        while ((line = bufferReader.readLine()) != null) {
            if (line.startsWith("Username")) {
                String[] data = line.split(":");
                if (data.length == 2 && data[1].trim().equals(username)) {
                    line = bufferReader.readLine(); // read next line (password)
                    data = line.split(":");
                    if (data.length == 2 && data[1].trim().equals(new String(password))) {
                        bufferReader.close();
                        return true;
                    }
                }
            }
        }

        bufferReader.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(p1, "Failed to read sign up data.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }

    return false;
}



		
   public void actionPerformed(ActionEvent ae) {
	 
	   if(ae.getSource()==backBtn)
		{
			
			this.setVisible(false);
			new Page();
			
		}
		
		else if(ae.getSource()==showpassBox) {
          if(showpassBox.isSelected()) {
            passText.setEchoChar((char)0);
        } else {
            passText.setEchoChar('•');

        }
    } 
		

}

	
	}


    