package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AdminDashboard extends JFrame implements ActionListener {
	
	JPanel p1;
    JLabel l1,l2,l3,l4;
    JButton AddUser,AddDeveloper,RemoveUser,UserInfo,gomenubtn,exitbtn;
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/AdminDB.jpg");
	


	
	
	public AdminDashboard()
	
	{
		super("Admin Dashboard");
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
		
	    ImageIcon AddUserIcon = new ImageIcon("Photos/AddUser.png");
    	ImageIcon RemoveUserIcon = new ImageIcon("Photos/RemoveUser.png");
     	ImageIcon AddDeveloperIcon = new ImageIcon("Photos/AddDeveloper.png");
	    ImageIcon UserInfoIcon = new ImageIcon("Photos/UserInfo.png");
		
		gomenubtn = new JButton("Go To Menu");
		gomenubtn.setBounds(290,700,150,40);
		gomenubtn.setFocusable(false);
		gomenubtn.setBackground(Color.blue);
		gomenubtn.setForeground(Color.white);
		gomenubtn.addActionListener(this);
		p1.add(gomenubtn);
		
		exitbtn = new JButton("Exit");
		exitbtn.setBounds(40,700,160,40);
		exitbtn.setFocusable(false);
		exitbtn.setBackground(Color.red);
		exitbtn.setForeground(Color.white);
		exitbtn.addActionListener(this);
		p1.add(exitbtn);
	
	
	    l1 = new JLabel("Add User");
		l1.setBounds(65,610,200,45);
		l1.setForeground(new Color(175,238,238));
		l1.setFont(new Font("helvetica" , Font.BOLD ,20));
		p1.add(l1);
		
		l2= new JLabel("Remove User");
		l2.setBounds(300,610,200,45);
		l2.setForeground(new Color(175,238,238));
		l2.setFont(new Font("helvetica" , Font.BOLD ,20));
		p1.add(l2);
		
		
		l3 = new JLabel("Add Developer");
		l3.setBounds(290,350,200,45);
		l3.setForeground(new Color(175,238,238));
		l3.setFont(new Font("cambria" , Font.BOLD ,20));
		p1.add(l3);
		
	    l4 = new JLabel("User Info");
		l4.setBounds(75,350,200,45);
		l4.setForeground(new Color(175,238,238));
		l4.setFont(new Font("cambria" , Font.BOLD ,20));
		p1.add(l4);
	
	
		
		AddUser = new JButton(AddUserIcon);
		AddUser.setBounds(0,420,215,215);
		AddUser.setForeground(Color.white);
        AddUser.setBackground(Color.black);
		AddUser.setFocusPainted(false);
		AddUser.setOpaque(false);
		AddUser.setBorder(null);
		AddUser.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		AddUser.addActionListener(this);
		p1.add(AddUser);
		
        RemoveUser = new JButton(RemoveUserIcon);
		RemoveUser.setBounds(250,420,215,215);
		RemoveUser.setForeground(Color.white);
        RemoveUser.setBackground(Color.black);
		RemoveUser.setFocusPainted(false);
		RemoveUser.setOpaque(false);
		RemoveUser.setBorder(null);
		RemoveUser.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		RemoveUser.addActionListener(this);
		p1.add(RemoveUser);		
		
		AddDeveloper = new JButton(AddDeveloperIcon);
		AddDeveloper.setBounds(250,169,215,215);
		AddDeveloper.setForeground(Color.white);
        AddDeveloper.setBackground(Color.black);
		AddDeveloper.setFocusPainted(false);
		AddDeveloper.setOpaque(false);
		AddDeveloper.setBorder(null);
		AddDeveloper.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		AddDeveloper.addActionListener(this);
		p1.add(AddDeveloper);
		
		UserInfo = new JButton(UserInfoIcon);
		UserInfo.setBounds(05,160,215,215);
		UserInfo.setForeground(Color.white);
        UserInfo.setBackground(Color.black);
		UserInfo.setFocusPainted(false);
		UserInfo.setOpaque(false);
		UserInfo.setBorder(null);
		UserInfo.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		UserInfo.addActionListener(this);
		p1.add(UserInfo);
		
		
		
		 this.setVisible(true);
	} 

	
    public void actionPerformed(ActionEvent ae) {
		  
	   if(ae.getSource()==UserInfo)
		{
			
			this.setVisible(false);
			new UserInfoPage();
			
		}
	   else if(ae.getSource()==RemoveUser)
		{
			
			this.setVisible(false);
			new RemoveUserPage();
			
		}
	   else if(ae.getSource()==AddUser)
		{
			
			this.setVisible(false);
			new AddingNewUser();
			
		}
	   else if(ae.getSource()==AddDeveloper)
		{
			
			this.setVisible(false);
			new AddingDeveloper();
			
		}	
		else if(ae.getSource()==gomenubtn)
		{
			
			this.setVisible(false);
			new HomePage();
			
		}
	   else if(ae.getSource()==exitbtn){
			int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION){
			
			this.setVisible(false);
			new Page();
			}
    }
	
}	
  }