package com.view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CashierHome extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JPanel panel;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_2_1;
    private JLabel lblNewLabel_2_1_1;
    private JLabel lblNewLabel_2_1_1_1;
    private JLabel lblNewLabel_2_1_1_1_1;
    private JLabel lblNewLabel_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CashierHome frame = new CashierHome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public CashierHome() {
    	//setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dell\\Downloads\\backgroun.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the JFrame to full screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        // Create the content pane
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getPanel());
        contentPane.add(getLblNewLabel_1());
        
        // Add other components and customize the JFrame here
        
    }
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(0, 0, 1540, 855);
			lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\backgroun.jpg").getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), DO_NOTHING_ON_CLOSE)));
			
		}
		return lblNewLabel_1;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(192, 192, 192));
			panel.setBounds(0, 0, 1540, 62);
			panel.setLayout(null);
			panel.add(getLblNewLabel_2());
			panel.add(getLblNewLabel_2_1());
			panel.add(getLblNewLabel_2_1_1());
			panel.add(getLblNewLabel_2_1_1_1());
			panel.add(getLblNewLabel_2_1_1_1_1());
			panel.add(getLblNewLabel_3());
		}
		return panel;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Create Bill");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					NewBill newBill = new NewBill();
				    newBill.setLocationRelativeTo(null); // Set the location to the center of the screen
				    newBill.setVisible(true);
					
				}
			});
			lblNewLabel_2.setForeground(new Color(0, 0, 0));
			lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			lblNewLabel_2.setBounds(290, 11, 116, 27);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Search Bill");
			lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseClicked(MouseEvent e) {
					SearchBill searchBill = new SearchBill();
				    searchBill.setLocationRelativeTo(null); // Set the location to the center of the screen
				    searchBill.setVisible(true);
					
				}
			});
			lblNewLabel_2_1.setForeground(Color.BLACK);
			lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			lblNewLabel_2_1.setBounds(456, 11, 126, 27);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel("Product Information");
			lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					ProductInformation productInformation = new ProductInformation();
				    productInformation.setLocationRelativeTo(null); // Set the location to the center of the screen
				    productInformation.setVisible(true);
					
				}
			});
			lblNewLabel_2_1_1.setForeground(Color.BLACK);
			lblNewLabel_2_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			lblNewLabel_2_1_1.setBounds(610, 11, 214, 27);
		}
		return lblNewLabel_2_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel("Sales\r\n");
			lblNewLabel_2_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Sales sales=new Sales();
					sales.setLocationRelativeTo(null);
					sales.setVisible(true);
				}
			});
			lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			lblNewLabel_2_1_1_1.setBounds(857, 11, 78, 27);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel("Exit\r\n");
			lblNewLabel_2_1_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);
				}
			});
			lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
			lblNewLabel_2_1_1_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			lblNewLabel_2_1_1_1_1.setBounds(1436, 20, 78, 27);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Quick Bill\r\n");
			lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 29));
			lblNewLabel_3.setBounds(61, 17, 138, 27);
		}
		return lblNewLabel_3;
	}
}
