package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.Properties;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.jdatepicker.util.JDatePickerUtil;

public class Register extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_1_1_2;
	private JTextField textField_2;
	private JPasswordField passwordField_2;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField textField_3;
	private JPasswordField passwordField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setUndecorated(true);

		setTitle("AdminLogin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 591);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 50, 100));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTextField());
		contentPane.add(getPasswordField());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_2_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_1_3());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getTextField_2());
		contentPane.add(getPasswordField_2());
		contentPane.add(getLblNewLabel_1_2_1());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getTextField_3());
		contentPane.add(getPasswordField_3());
		contentPane.add(getTextField_4());
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
			lblNewLabel = new JLabel("Register");
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
			lblNewLabel_1.setBounds(212, 309, 79, 28);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Password:");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_1.setBounds(212, 348, 79, 28);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBackground(Color.LIGHT_GRAY);
			textField.setBounds(301, 315, 173, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBackground(Color.LIGHT_GRAY);
			passwordField.setBounds(301, 354, 173, 20);
		}
		return passwordField;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Cancel\r\n");
			btnNewButton_2.setForeground(SystemColor.text);
			btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD, 14));
			btnNewButton_2.setBackground(new Color(189, 28, 15));
			btnNewButton_2.setBounds(272, 489, 91, 34);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_2_1() {
		if (btnNewButton_2_1 == null) {
			btnNewButton_2_1 = new JButton("Register");
			btnNewButton_2_1.setForeground(SystemColor.text);
			btnNewButton_2_1.setFont(new Font("Sylfaen", Font.BOLD, 14));
			btnNewButton_2_1.setBackground(SystemColor.textHighlight);
			btnNewButton_2_1.setBounds(390, 489, 91, 34);
		}
		return btnNewButton_2_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Click here to login");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel_2.setForeground(SystemColor.text);
			lblNewLabel_2.setBounds(321, 548, 182, 32);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Pass check:\r\n");
			lblNewLabel_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_2.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_2.setBounds(212, 231, 79, 28);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("BirthDate:\r\n");
			lblNewLabel_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_1_1.setBounds(212, 270, 79, 28);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBackground(Color.LIGHT_GRAY);
			textField_1.setBounds(301, 237, 173, 20);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Username:");
			lblNewLabel_1_3.setForeground(Color.WHITE);
			lblNewLabel_1_3.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_3.setBounds(212, 152, 79, 28);
		}
		return lblNewLabel_1_3;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("Password:");
			lblNewLabel_1_1_2.setForeground(Color.WHITE);
			lblNewLabel_1_1_2.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_1_2.setBounds(212, 191, 79, 28);
		}
		return lblNewLabel_1_1_2;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBackground(Color.LIGHT_GRAY);
			textField_2.setBounds(301, 158, 173, 20);
		}
		return textField_2;
	}
	private JPasswordField getPasswordField_2() {
		if (passwordField_2 == null) {
			passwordField_2 = new JPasswordField();
			passwordField_2.setBackground(Color.LIGHT_GRAY);
			passwordField_2.setBounds(301, 197, 173, 20);
		}
		return passwordField_2;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("First Name:");
			lblNewLabel_1_2_1.setForeground(Color.WHITE);
			lblNewLabel_1_2_1.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_2_1.setBounds(212, 74, 79, 28);
		}
		return lblNewLabel_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Last Name:\r\n");
			lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1_1_1.setFont(new Font("Serif", Font.BOLD, 15));
			lblNewLabel_1_1_1_1.setBounds(212, 113, 79, 28);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBackground(Color.LIGHT_GRAY);
			textField_3.setBounds(301, 80, 173, 20);
		}
		return textField_3;
	}
	private JPasswordField getPasswordField_3() {
		if (passwordField_3 == null) {
			passwordField_3 = new JPasswordField();
			passwordField_3.setBackground(Color.LIGHT_GRAY);
			passwordField_3.setBounds(301, 119, 173, 20);
		}
		return passwordField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBackground(Color.LIGHT_GRAY);
			textField_4.setBounds(301, 276, 173, 20);
		}
		return textField_4;
	}
}