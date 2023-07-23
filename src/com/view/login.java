package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblQuickBill;
	private JButton btnNewButton;
	private JButton btnCashierLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setTitle("Quick Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 350);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblQuickBill());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnCashierLogin());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome To Super Market Billing System");
			lblNewLabel.setFont(new Font("Serif", Font.BOLD, 20));
			lblNewLabel.setBounds(112, 28, 363, 29);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\r\n");
			lblNewLabel_1.setBounds(42, 68, 186, 182);
			lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Dell\\Downloads\\kisspng-area-symbol-circle-line-nepal-5ab0f032f31a90.8098726515215452669958-removebg-preview.png").getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_DEFAULT)));
			
		}
		return lblNewLabel_1;
	}
	private JLabel getLblQuickBill() {
		if (lblQuickBill == null) {
			lblQuickBill = new JLabel("Quick Bill\r\n");
			lblQuickBill.setForeground(Color.DARK_GRAY);
			lblQuickBill.setFont(new Font("Segoe UI Semibold", Font.BOLD | Font.ITALIC, 30));
			lblQuickBill.setBounds(110, 261, 163, 29);
		}
		return lblQuickBill;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Admin Login\r\n");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AdminLogin().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Serif", Font.BOLD, 13));
			btnNewButton.setBounds(423, 121, 110, 41);
		}
		return btnNewButton;
	}
	private JButton getBtnCashierLogin() {
		if (btnCashierLogin == null) {
			btnCashierLogin = new JButton("Cashier Login");
			btnCashierLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new CashierLogin().setVisible(true);
					dispose();
				}
			});
			btnCashierLogin.setFont(new Font("Serif", Font.BOLD, 12));
			btnCashierLogin.setBounds(423, 203, 110, 41);
		}
		return btnCashierLogin;
	}
}
