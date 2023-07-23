package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.model.Bill;
import com.model.Cashier;
import com.service.BillService;
import com.service.BillServiceImpl;
import com.service.CashierService;
import com.service.CashierServiceImpl;

public class SearchBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField billNoText;
	private JButton add;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton update_1;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField serach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchBill frame = new SearchBill();
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
	public SearchBill() {
		setTitle("Search Bill");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton());
		contentPane.add(getSerach());
	
		
		displayData();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Search Bill");
			lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
			lblNewLabel.setBounds(27, 11, 169, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bill No");
			lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1.setBounds(166, 95, 81, 14);
		}
		return lblNewLabel_1;
	}

	
					
					
					

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(166, 131, 587, 439);
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
					"Bill No", "Customer Name", "Amount", "Date"
				}
			));
		}
		return table;
	}
	
	private void displayData() {
		List<Bill> list=new ArrayList<>();
		BillService cashierService=new BillServiceImpl();
		
		list=cashierService.getAllBill();
		
		DefaultTableModel tmodel=(DefaultTableModel)table.getModel();
		tmodel.setRowCount(0);
		
		for(Bill c: list) {
			tmodel.addRow(new Object[] {c.getBillNo(),c.getCustomerName(),c.getTotal(),c.getDate()});
		}
	}
	private JButton getSearch() {
		if (update_1 == null) {
			update_1 = new JButton("Update");
			update_1.setForeground(Color.GRAY);
			update_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			update_1.setBounds(185, 518, 91, 23);
		}
		return update_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Search");
			btnNewButton.setBounds(623, 80, 125, 38);
		}
		return btnNewButton;
	}
	
	
	private JTextField getSerach() {
		if (serach == null) {
			serach = new JTextField();
			serach.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String sdata= serach.getText().trim();
					
					BillService ss=new BillServiceImpl();
				List<Bill> slist=ss.searchBill(sdata);
				
				DefaultTableModel tmodel=(DefaultTableModel) table.getModel();
				tmodel.setRowCount(0);//reset Table
				for(Bill s: slist) {
					tmodel.addRow(new Object[] {s.getBillNo(),s.getCustomerName(),s.getTotal(),s.getDate()});
				}
					
				}
			});
			serach.setBounds(246, 95, 106, 20);
			serach.setColumns(10);
		}
		return serach;
	}
}
