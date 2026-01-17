package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Courses1 extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton Back,Exit,Next;
	JButton cplus,python,java,chash,go,mySQL,html,js,css;
    Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/Courses1.png");
	
	
	public Courses1()
	{
		super("Courses");
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
		
		Next = new JButton("Next");
		Next.setBounds(530,700,120,40);
		Next.setFont(font);
		Next.setForeground(Color.black);
        Next.setBackground(new Color(176, 142, 68));
		Next.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		Next.addActionListener(this);
		Next.setFocusPainted(false);
		p1.add(Next); 
		
		//course buttons are starting from here
		
		cplus = new JButton("C++");
		cplus.setBounds(52,164,291,35);
		cplus.setForeground(Color.white);
        cplus.setBackground(Color.black);
		cplus.setFocusPainted(false);
		cplus.setOpaque(false);
		cplus.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		cplus.addActionListener(this);
		p1.add(cplus);  
		
		java = new JButton("Java");
		java.setBounds(444,165,289,35);
		java.setForeground(Color.white);
        java.setBackground(Color.black);
		java.setFocusPainted(false);
		java.setOpaque(false);
		java.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		java.addActionListener(this);
		p1.add(java);  
		
		chash = new JButton("C#");
		chash.setBounds(848,164,288,35);
		chash.setForeground(Color.white);
        chash.setBackground(Color.black);
		chash.setFocusPainted(false);
		chash.setOpaque(false);
		chash.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		chash.addActionListener(this);
		p1.add(chash);
		
        css = new JButton("CSS");
		css.setBounds(52,378,291,35);
		css.setForeground(Color.white);
        css.setBackground(Color.black);
		css.setFocusPainted(false);
		css.setOpaque(false);
		css.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		css.addActionListener(this);
		p1.add(css);		
		
		js = new JButton("JavaScript");
		js.setBounds(444,377,289,35);
		js.setForeground(Color.white);
        js.setBackground(Color.black);
		js.setFocusPainted(false);
		js.setOpaque(false);
		js.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		js.addActionListener(this);
		p1.add(js);
		
		html = new JButton("HTML");
		html.setBounds(848,377,291,35);
		html.setForeground(Color.white);
        html.setBackground(Color.black);
		html.setFocusPainted(false);
		html.setOpaque(false);
		html.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		html.addActionListener(this);
		p1.add(html);
		
		go = new JButton("Go");
		go.setBounds(52,605,291,35);
		go.setForeground(Color.white);
        go.setBackground(Color.black);
		go.setFocusPainted(false);
		go.setOpaque(false);
		go.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		go.addActionListener(this);
		p1.add(go);
		
		python = new JButton("Python");
		python.setBounds(443,605,290,35);
		python.setForeground(Color.white);
        python.setBackground(Color.black);
		python.setFocusPainted(false);
		python.setOpaque(false);
		python.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		python.addActionListener(this);
		p1.add(python);
		
		mySQL = new JButton("MySQL");
		mySQL.setBounds(848,605,290,35);
		mySQL.setForeground(Color.white);
        mySQL.setBackground(Color.black);
		mySQL.setFocusPainted(false);
		mySQL.setOpaque(false);
		mySQL.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		mySQL.addActionListener(this);
		p1.add(mySQL);
		
		 this.setVisible(true);
	} 
	
	
 public void actionPerformed(ActionEvent ae) {
		  
	   if(ae.getSource()==Back)
		{
			
			this.setVisible(false);
			new HomePage();
			
		}
		
	  else if(ae.getSource()==Next)
		{
			
			this.setVisible(false);
			new Courses2();
			
		}  
		else if(ae.getSource()==cplus)
		{
			
			this.setVisible(false);
			new Cplus();
			
		}  
		else if(ae.getSource()==java)
		{
			
			this.setVisible(false);
			new Java();
			
		}
		else if(ae.getSource()==chash)
		{
			
			this.setVisible(false);
			new Chash();
			
		}
		else if(ae.getSource()==css)
		{
			
			this.setVisible(false);
			new CSS();
			
		}
		else if(ae.getSource()==js)
		{
			
			this.setVisible(false);
			new JavaScript();
			
		}
		else if(ae.getSource()==html)
		{
			
			this.setVisible(false);
			new HTML();
			
		}
		else if(ae.getSource()==go)
		{
			
			this.setVisible(false);
			new GO();
			
		}
		else if(ae.getSource()==python)
		{
			
			this.setVisible(false);
			new Python();
			
		}
		else if(ae.getSource()==mySQL)
		{
			
			this.setVisible(false);
			new MySQL();
			
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
