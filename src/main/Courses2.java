package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Courses2 extends JFrame implements ActionListener {
	
	JPanel p1;
    JButton Back,Exit,Next;
	JButton swift,php,typescript,ruby,crystal,perl,kotlin,matlab,scala;
	Font font = new Font("Times New Roman", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	ImageIcon icon = new ImageIcon ("Photos/Courses2.png");
	
	
	public Courses2()
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
		p1.add(Exit);  
		
	
		//course buttons starting from here
		
		swift = new JButton("Swift");
		swift.setBounds(52,166,292,35);
		swift.setForeground(Color.white);
        swift.setBackground(Color.black);
		swift.setFocusPainted(false);
		swift.setOpaque(false);
		swift.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		swift.addActionListener(this);
		p1.add(swift);  
		
		typescript = new JButton("TypeScript");
		typescript.setBounds(444,166,289,35);
		typescript.setForeground(Color.white);
        typescript.setBackground(Color.black);
		typescript.setFocusPainted(false);
		typescript.setOpaque(false);
		typescript.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		typescript.addActionListener(this);
		p1.add(typescript);  
		
		ruby = new JButton("Ruby");
		ruby.setBounds(848,166,291,35);
		ruby.setForeground(Color.white);
        ruby.setBackground(Color.black);
		ruby.setFocusPainted(false);
		ruby.setOpaque(false);
		ruby.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		ruby.addActionListener(this);
		p1.add(ruby);
		
        php = new JButton("PHP");
		php.setBounds(52,377,292,35);
		php.setForeground(Color.white);
        php.setBackground(Color.black);
		php.setFocusPainted(false);
		php.setOpaque(false);
		php.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		php.addActionListener(this);
		p1.add(php);		
		
		kotlin = new JButton("Kotlin");
		kotlin.setBounds(443,377,290,35);
		kotlin.setForeground(Color.white);
        kotlin.setBackground(Color.black);
		kotlin.setFocusPainted(false);
		kotlin.setOpaque(false);
		kotlin.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		kotlin.addActionListener(this);
		p1.add(kotlin);
		
		perl = new JButton("Perl");
		perl.setBounds(848,377,291,35);
		perl.setForeground(Color.white);
        perl.setBackground(Color.black);
		perl.setFocusPainted(false);
		perl.setOpaque(false);
		perl.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		perl.addActionListener(this);
		p1.add(perl);
		
		matlab = new JButton("MATLAB");
		matlab.setBounds(52,593,291,35);
		matlab.setForeground(Color.white);
        matlab.setBackground(Color.black);
		matlab.setFocusPainted(false);
		matlab.setOpaque(false);
		matlab.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		matlab.addActionListener(this);
		p1.add(matlab);
		
		scala = new JButton("Scala");
		scala.setBounds(443,593,290,35);
		scala.setForeground(Color.white);
        scala.setBackground(Color.black);
		scala.setFocusPainted(false);
		scala.setOpaque(false);
		scala.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		scala.addActionListener(this);
		p1.add(scala);
		
		crystal = new JButton("Crystal");
		crystal.setBounds(848,593,290,35);
		crystal.setForeground(Color.white);
        crystal.setBackground(Color.black);
		crystal.setFocusPainted(false);
		crystal.setOpaque(false);
		crystal.addMouseListener(new MouseAdapter() {
         public void mouseEntered(MouseEvent e) {
         setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
           }
         public void mouseExited(MouseEvent e) {
         setCursor(Cursor.getDefaultCursor());
           }
           });
		crystal.addActionListener(this);
		p1.add(crystal);  
		
		 this.setVisible(true);
	} 
	
	
  public void actionPerformed(ActionEvent ae) {
		  
		  
	   if(ae.getSource()==Back)
		{
			
			this.setVisible(false);
			new Courses1();
			
		}
		else if(ae.getSource()==swift)
		{
			
			this.setVisible(false);
			new Swift();
			
		}
        else if(ae.getSource()==typescript)
		{
			
			this.setVisible(false);
			new TypeScript();
			
		}
		else if(ae.getSource()==ruby)
		{
			
			this.setVisible(false);
			new Ruby();
			
		}
		else if(ae.getSource()==php)
		{
			
			this.setVisible(false);
			new PHP();
			
		}
		else if(ae.getSource()==kotlin)
		{
			
			this.setVisible(false);
			new Kotlin();
			
		}
		else if(ae.getSource()==perl)
		{
			
			this.setVisible(false);
			new Perl();
			
		}
		else if(ae.getSource()==matlab)
		{
			
			this.setVisible(false);
			new Matlab();
			
		}
		else if(ae.getSource()==scala)
		{
			
			this.setVisible(false);
			new Scala();
			
		}
		else if(ae.getSource()==crystal)
		{
			
			this.setVisible(false);
			new Crystal();
			
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
