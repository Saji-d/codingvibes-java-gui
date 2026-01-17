package SourceFiles;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;

public class CartPage extends JFrame implements ActionListener {
		
    private DefaultTableModel model;
    private JTable table;
    private JButton buyButton,backButton,removeButton;
    private static List<String[]> cartContents = new ArrayList<>();
	
	ImageIcon icon1 = new ImageIcon ("Photos/Logo.jpg");
	

    public CartPage() {
        
        setSize(1200, 800);
        setTitle("Your Cart");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setIconImage(icon1.getImage());

        //JPanel hold the cart contents
        JPanel cartPanel = new JPanel(new BorderLayout());

        //table
        model = new DefaultTableModel();
        model.addColumn("Course Name");
        model.addColumn("Course Duration");
        model.addColumn("Price");
        table = new JTable(model);
        table.setFont(new Font("Arial", Font.BOLD, 18)); // Increase font size of table contents
		table.setRowHeight(30);
		table.setBackground(new Color(173, 216, 230));
		
		
		//column header font
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial", Font.BOLD, 20));
        header.setForeground(new Color(211, 211, 211));
        header.setBackground(new Color(150, 75, 0));
		

    
    buyButton = new JButton("Buy");
    buyButton.addActionListener(this);
    buyButton.setFocusPainted(false);
    buyButton.setForeground(Color.black);
    buyButton.setBackground(Color.yellow);
	buyButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
    buyButton.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        public void mouseExited(MouseEvent e) {
            setCursor(Cursor.getDefaultCursor());
        }
    });
	
	removeButton = new JButton("Remove");
    removeButton.addActionListener(this);
    removeButton.setFocusPainted(false);
    removeButton.setForeground(Color.black);
    removeButton.setBackground(Color.red);
	removeButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
    removeButton.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        public void mouseExited(MouseEvent e) {
            setCursor(Cursor.getDefaultCursor());
        }
    });

    
    backButton = new JButton("Back");
    backButton.addActionListener(this);
    backButton.setFocusPainted(false);
    backButton.setForeground(Color.white);
    backButton.setBackground(Color.blue);
	backButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
    backButton.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }
        public void mouseExited(MouseEvent e) {
            setCursor(Cursor.getDefaultCursor());
        }
    });

    // Add the buttons to the cart panel
    JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 0));
    buttonPanel.add(backButton);
	buttonPanel.add(removeButton);
    buttonPanel.add(buyButton);
    cartPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add a label to the top center of the panel
        JLabel titleLabel = new JLabel("CodingVibes Courses", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        cartPanel.add(titleLabel, BorderLayout.NORTH);

        //scroll pane to hold the table
        JScrollPane scrollPane = new JScrollPane(table);
		
		scrollPane.setBackground(new Color(0, 0, 0));
        table.setFillsViewportHeight(true);

        // scroll pane to the cart panel
        cartPanel.add(scrollPane, BorderLayout.CENTER);

        //cart panel to the JFrame's content pane
        getContentPane().add(cartPanel);


        // Show the cart contents
        showCartContents();

        // Show the JFrame
        this.setVisible(true);
    }

    public void addToCart(String courseName, String duration, String price) {
        // Add the course to the cart
        String[] course = new String[]{courseName, duration, price};
        cartContents.add(course);
        model.addRow(course);
    }

    private void showCartContents() {
        // Show the contents of the cart
        for (String[] course : cartContents) {
            model.addRow(course);
        }
    }

    public static List<String[]> getCartContents() {
        return cartContents;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            
            this.setVisible(false);
            new HomePage();
        }
		
		else if (ae.getSource() == buyButton) {
			  
			  
              cartContents.clear();
              model.setRowCount(0);
			  this.setVisible(false);
			  new PaymentOptions();
			  
    }
	else if (ae.getSource() == removeButton) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            // Remove the selected row from the table
            model.removeRow(selectedRow);

            // Remove the corresponding course from cartContents
            cartContents.remove(selectedRow);
        } else {
            // Inform the user that no row is selected
            JOptionPane.showMessageDialog(this, "Please select a course to remove.", "No Course Selected", JOptionPane.WARNING_MESSAGE);
        }
     }
   }
}
