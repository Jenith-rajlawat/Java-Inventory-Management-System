package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField usernameText;
	private JPasswordField passwordText;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setUndecorated(true);

		setTitle("AdminLogin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 50, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getUsernameText());
		contentPane.add(getPasswordText());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_2_1());
		contentPane.add(getLblNewLabel_2());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(241, 141, 20));
			panel.setBounds(0, 0, 600, 49);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Login Form");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(22, 11, 168, 31);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton.setForeground(new Color(241, 141, 20));
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\cross-42-removebg-preview.png"));
			btnNewButton.setBounds(557, 11, 33, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setExtendedState(JFrame.ICONIFIED);
				}
			});
			btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\5735833-removebg-preview.png"));
			btnNewButton_1.setBackground(new Color(241, 141, 20));
			btnNewButton_1.setBounds(506, 11, 33, 23);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Username:");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1.setBounds(203, 143, 79, 28);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Password:");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_1.setBounds(203, 182, 79, 28);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getUsernameText() {
		if (usernameText == null) {
			usernameText = new JTextField();
			usernameText.setBackground(Color.LIGHT_GRAY);
			usernameText.setBounds(292, 149, 173, 20);
			usernameText.setColumns(10);
		}
		return usernameText;
	}
	private JPasswordField getPasswordText() {
		if (passwordText == null) {
			passwordText = new JPasswordField();
			passwordText.setBackground(Color.LIGHT_GRAY);
			passwordText.setBounds(292, 188, 173, 20);
		}
		return passwordText;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Cancel\r\n");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Returning ....");
					new login().setVisible(true);
					dispose();
				}
			});
			btnNewButton_2.setForeground(SystemColor.text);
			btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD, 14));
			btnNewButton_2.setBackground(new Color(189, 28, 15));
			btnNewButton_2.setBounds(271, 248, 91, 34);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_2_1() {
		if (btnNewButton_2_1 == null) {
			btnNewButton_2_1 = new JButton("Login\r\n");
			btnNewButton_2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String userName=usernameText.getText();
					@SuppressWarnings("deprecation")
					String password=passwordText.getText();
					
					if(userName.equalsIgnoreCase("admin") &&password.equals("admin")) {
						new AdminHome().setVisible(true);
						dispose();
					}else
					{
						JOptionPane.showMessageDialog(null, "Wrong Credentials");
					}
					
					
				}
			});
			btnNewButton_2_1.setForeground(SystemColor.text);
			btnNewButton_2_1.setFont(new Font("Sylfaen", Font.BOLD, 14));
			btnNewButton_2_1.setBackground(SystemColor.textHighlight);
			btnNewButton_2_1.setBounds(389, 248, 91, 34);
		}
		return btnNewButton_2_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Click here to register");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new Register().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_2.setForeground(SystemColor.text);
			lblNewLabel_2.setBounds(320, 307, 182, 32);
		}
		return lblNewLabel_2;
	}
}
