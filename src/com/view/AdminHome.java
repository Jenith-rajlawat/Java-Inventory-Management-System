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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdminHome extends JFrame {

    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JPanel panel;
    private JLabel Cashier;
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
                    AdminHome frame = new AdminHome();
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
    public AdminHome() {
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
			panel.add(getCashier());
			panel.add(getLblNewLabel_2_1());
			panel.add(getLblNewLabel_2_1_1());
			panel.add(getLblNewLabel_2_1_1_1());
			panel.add(getLblNewLabel_2_1_1_1_1());
			panel.add(getLblNewLabel_3());
		}
		return panel;
	}
	private JLabel getCashier() {
		if (Cashier == null) {
			Cashier = new JLabel("Cashier");
			Cashier.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					AddCashier addCashier = new AddCashier();
					 
				    addCashier.setLocationRelativeTo(null); // Set the location to the center of the screen
				    addCashier.setVisible(true);
				    addCashier.addWindowListener(new WindowAdapter() {
			           
			        });
				}
			});
			Cashier.setForeground(new Color(0, 0, 0));
			Cashier.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			Cashier.setBounds(290, 11, 78, 27);
		}
		return Cashier;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("Transaction");
			lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Transaction transaction =new Transaction();
					transaction.setLocationRelativeTo(null);
					transaction.setVisible(true);
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
			lblNewLabel_2_1_1 = new JLabel("Stocks\r\n");
			lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					UpdateStock addCashier = new UpdateStock();
					 
				    addCashier.setLocationRelativeTo(null); // Set the location to the center of the screen
				    addCashier.setVisible(true);
					
				}
			});
			lblNewLabel_2_1_1.setForeground(Color.BLACK);
			lblNewLabel_2_1_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			lblNewLabel_2_1_1.setBounds(653, 11, 78, 27);
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
			lblNewLabel_2_1_1_1.setBounds(778, 11, 78, 27);
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
