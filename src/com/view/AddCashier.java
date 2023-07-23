package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.db.DB;
import com.model.Cashier;
import com.service.CashierService;
import com.service.CashierServiceImpl;

public class AddCashier extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField cashierIdText;
	private JLabel lblNewLabel_1_1;
	private JTextField cashierNameText;
	private JLabel lblNewLabel_1_1_1;
	private JTextField cMobileNoText;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField cAddressText;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField cEmailText;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JPasswordField cPasswordText;
	private JButton add;
	private JButton update;
	private JButton delete;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCashier frame = new AddCashier();
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
	public AddCashier() {
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getCashierIdText());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getCashierNameText());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getCMobileNoText());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getCAddressText());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getCEmailText());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1());
		contentPane.add(getCPasswordText());
		contentPane.add(getAdd());
		contentPane.add(getUpdate());
		contentPane.add(getDelete());
		contentPane.add(getScrollPane());
		displayData();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Add Cashier");
			lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
			lblNewLabel.setBounds(94, 64, 169, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier ID");
			lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1.setBounds(108, 141, 81, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getCashierIdText() {
		if (cashierIdText == null) {
			cashierIdText = new JTextField();
			cashierIdText.setBounds(239, 137, 137, 28);
			cashierIdText.setColumns(10);
		}
		return cashierIdText;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Cashier Name\r\n");
			lblNewLabel_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(108, 187, 121, 14);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getCashierNameText() {
		if (cashierNameText == null) {
			cashierNameText = new JTextField();
			cashierNameText.setColumns(10);
			cashierNameText.setBounds(239, 183, 137, 28);
		}
		return cashierNameText;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Mobile no\r\n");
			lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(108, 239, 81, 14);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getCMobileNoText() {
		if (cMobileNoText == null) {
			cMobileNoText = new JTextField();
			cMobileNoText.setColumns(10);
			cMobileNoText.setBounds(239, 229, 137, 28);
		}
		return cMobileNoText;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(108, 291, 81, 14);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getCAddressText() {
		if (cAddressText == null) {
			cAddressText = new JTextField();
			cAddressText.setColumns(10);
			cAddressText.setBounds(239, 281, 137, 28);
		}
		return cAddressText;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Email id");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1.setBounds(108, 340, 81, 14);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getCEmailText() {
		if (cEmailText == null) {
			cEmailText = new JTextField();
			cEmailText.setColumns(10);
			cEmailText.setBounds(239, 330, 137, 28);
		}
		return cEmailText;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("Password\r\n");
			lblNewLabel_1_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1.setBounds(108, 392, 81, 14);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JPasswordField getCPasswordText() {
		if (cPasswordText == null) {
			cPasswordText = new JPasswordField();
			cPasswordText.setBounds(239, 384, 137, 28);
		}
		return cPasswordText;
	}
	private JButton getAdd() {
		if (add == null) {
			add = new JButton("Add ");
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Cashier c=new Cashier();
					//post and retrieve to send to service for further processing
					int cashierId=Integer.parseInt(cashierIdText.getText());
					String cashierName=cashierNameText.getText();
					String cMobileNumber=cMobileNoText.getText();	
					String address=cAddressText.getText();
					String email=cEmailText.getText();
					@SuppressWarnings("deprecation")
					String password=cPasswordText.getText();
					
					//prepare parameter for service to add
					c.setCashierId(cashierId);
					c.setCashierName(cashierName);
					c.setMobileNumber(cMobileNumber);
					c.setAddress(address);
					c.setEmailId(email);
					c.setPassword(password);
					
					//call service
					CashierService cashierService=new CashierServiceImpl();
					if(cashierService.addCashier(c)) {
						JOptionPane.showMessageDialog(null,"Added Success");
						cashierIdText.setText("");
						cashierNameText.setText("");
						cMobileNoText.setText("");
						cAddressText.setText("");
						cEmailText.setText("");
						cPasswordText.setText("");
						displayData();
					}else {
						JOptionPane.showMessageDialog(null, "Fail to add");
					}
					
					
					
					
				}
			});
			add.setForeground(SystemColor.activeCaption);
			add.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			add.setBounds(172, 515, 91, 23);
		}
		return add;
	}
	private JButton getUpdate() {
		if (update == null) {
			update = new JButton("Update");
			update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null,"Please select a row ");
				}
				if(table.getSelectedRow()>0) {
				int srow=table.getSelectedRow();
				int id=(int) table.getModel().getValueAt(srow,0);
					
				Cashier c=new Cashier();
				CashierService cashierService=new CashierServiceImpl();
				c=cashierService.getCashierById(id);
				
				//show in form
				cashierIdText.setText(String.valueOf(c.getCashierId()));
				cashierNameText.setText(c.getCashierName());
				cMobileNoText.setText(c.getMobileNumber());
				cAddressText.setText(c.getAddress());
				cEmailText.setText(c.getEmailId());
				cPasswordText.setText(c.getPassword());
				
	//I want to stop the code here for a while to let user edit the variables on setText
				
				c.setCashierId(Integer.parseInt(cashierIdText.getText()));
				c.setCashierName(cashierNameText.getText());
				c.setMobileNumber(cMobileNoText.getText());
				c.setAddress(cAddressText.getText());
				c.setEmailId(cEmailText.getText());
				c.setPassword(cPasswordText.getText());
				
				if(cashierService.updateCashier(c)) {
					JOptionPane.showMessageDialog(null, "Update Success");
					displayData();
				}else
				{
					JOptionPane.showMessageDialog(null, "Failed to update");
				}
				
				
				}
					
					
					
				}
			});
			update.setForeground(Color.GRAY);
			update.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			update.setBounds(311, 515, 91, 23);
		}
		return update;
	}
	private JButton getDelete() {
		if (delete == null) {
			delete = new JButton("Delete");
			delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Please select a row");
					}
					if(table.getSelectedRow()>0) {
						int srow=table.getSelectedRow();
						int sid=(int)table.getModel().getValueAt(srow, 0);
						
						CashierService cashierService=new CashierServiceImpl();
						
						if(cashierService.deleteCashier(sid)) {
							JOptionPane.showMessageDialog(null, "Delete Success");
							displayData();
						}else
						{
							JOptionPane.showMessageDialog(null,"Delete Failed");
						}
					}
					
					
				}
			});
			delete.setForeground(new Color(255, 127, 80));
			delete.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			delete.setBounds(446, 515, 91, 23);
		}
		return delete;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(398, 49, 480, 439);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "Name", "Mobile no", "Address", "Email", "Password"
				}
			));
		}
		return table;
	}
	
	private void displayData() {
		List<Cashier> list=new ArrayList<>();
		CashierService cashierService=new CashierServiceImpl();
		
		list=cashierService.getAllCashier();
		
		DefaultTableModel tmodel=(DefaultTableModel)table.getModel();
		tmodel.setRowCount(0);
		
		for(Cashier c: list) {
			tmodel.addRow(new Object[] {c.getCashierId(),c.getCashierName(),c.getMobileNumber(),c.getAddress(),c.getEmailId(),c.getPassword()});
		}
	}
}
