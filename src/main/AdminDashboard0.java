package SourceFiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminDashboard0 extends JFrame  implements ActionListener {
	
    JButton b1;
    JPanel p1;

    ImageIcon icon1 = new ImageIcon("Photos/Logo.jpg");

    public AdminDashboard0() {
        super("ADMIN");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(icon1.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the image from file
                Image img = new ImageIcon("Photos/AdminextraBG.png").getImage();
                // Draw the image on the JPanel
                g.drawImage(img, 0, 0, 1200, 800, this);
            }
        };
        p1.setLayout(null);

        b1 = new JButton("Begin The Journey!");
        b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        b1.setForeground(Color.black);
        b1.setBackground(Color.yellow);
        b1.setBounds(205, 550, 250, 40);
        // Add mouse listener to b1
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change cursor to hand cursor when mouse enters b1
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Change cursor back to default cursor when mouse exits b1
                setCursor(Cursor.getDefaultCursor());
            }
        });
        b1.addActionListener(this);
	    b1.setFocusPainted(false);
        p1.add(b1);

       

       this.add(p1);
       this.setVisible(true);
		
    }

 public void actionPerformed(ActionEvent ae) {
	 
	   if(ae.getSource()==b1)
		{
			
			this.setVisible(false);
			new AdminDashboard();
			
		}

}
}
