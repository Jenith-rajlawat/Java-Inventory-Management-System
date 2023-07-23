package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.model.Bill;
import com.service.BillService;
import com.service.BillServiceImpl;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;

public class NewBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField billNoText;
	private JLabel lblNewLabel_1_1;
	private JTextField customerNameText;
	private JLabel lblNewLabel_1_1_1;
	private JTextField productIdText;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField nameText;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField mrpText;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JButton add;
	private JButton delete;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1_2;
	private JTextField dateText;
	private JLabel lblNewLabel_1_1_1_1_1_1_1;
	private JButton printButton;
	private JLabel lblNewLabel_1_1_1_1_1_1_2;
	private JTextField quantityText;
	private JTextField discountText;
	private JTextField totalText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBill frame = new NewBill();
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
	public NewBill() {
		setTitle("New Bill");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getBillNoText());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getCustomerNameText());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getProductIdText());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getNameText());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getMrpText());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1());
		contentPane.add(getAdd());
		contentPane.add(getDelete());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getDateText());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_1());
		contentPane.add(getPrintButton());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_2());
		contentPane.add(getQuantityText());
		contentPane.add(getDiscountText());
		contentPane.add(getTotalText());
		displayData();
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Bill No");
			lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1.setBounds(34, 68, 81, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getBillNoText() {
		if (billNoText == null) {
			billNoText = new JTextField();
			billNoText.setBounds(165, 64, 137, 28);
			billNoText.setColumns(10);
		}
		return billNoText;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Customer Name");
			lblNewLabel_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(34, 114, 121, 14);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getCustomerNameText() {
		if (customerNameText == null) {
			customerNameText = new JTextField();
			customerNameText.setColumns(10);
			customerNameText.setBounds(165, 110, 137, 28);
		}
		return customerNameText;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Product Id");
			lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(34, 166, 81, 14);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getProductIdText() {
		if (productIdText == null) {
			productIdText = new JTextField();
			productIdText.setColumns(10);
			productIdText.setBounds(165, 156, 137, 28);
		}
		return productIdText;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Name");
			lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(34, 218, 81, 14);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getNameText() {
		if (nameText == null) {
			nameText = new JTextField();
			nameText.setColumns(10);
			nameText.setBounds(165, 208, 137, 28);
		}
		return nameText;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Mrp");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1.setBounds(34, 257, 81, 28);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getMrpText() {
		if (mrpText == null) {
			mrpText = new JTextField();
			mrpText.setColumns(10);
			mrpText.setBounds(165, 257, 137, 28);
		}
		return mrpText;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("Quantity");
			lblNewLabel_1_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1.setBounds(34, 312, 81, 20);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JButton getAdd() {
		if (add == null) {
			add = new JButton("Add ");
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Bill bill=new Bill();
					//post and retrieve to send to service for further processing
					int billNo=Integer.parseInt(billNoText.getText());
					String customerName=customerNameText.getText();
					int productId=Integer.parseInt(productIdText.getText());	
					String name=nameText.getText();
					double mrp=Double.parseDouble(mrpText.getText());
					@SuppressWarnings("deprecation")
					double qantity=Double.parseDouble(quantityText.getText());
					double discount=Double.parseDouble(discountText.getText());
					
					
					//prepare parameter for service to add
					bill.setBillNo(billNo);
					bill.setCustomerName(customerName);
					bill.setProductId(productId);
					bill.setName(name);
					bill.setMrp(mrp);
					bill.setQuantity(qantity);
					bill.setDiscount(discount);
					bill.setDate(dateText.getText());
					
					//call service
					BillService billService=new BillServiceImpl();
					if(billService.addBill(bill)) {
						JOptionPane.showMessageDialog(null,"Added Success");
						billNoText.setText("");
						customerNameText.setText("");
						productIdText.setText("");
						nameText.setText("");
						mrpText.setText("");
						quantityText.setText("");
						discountText.setText("");
						displayData();
					}else {
						JOptionPane.showMessageDialog(null, "Fail to add");
					}
					
					
					
					
				}
			});
			add.setForeground(SystemColor.activeCaption);
			add.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			add.setBounds(79, 417, 91, 23);
		}
		return add;
	}
	private JButton getDelete() {
		if (delete == null) {
			delete = new JButton("Delete");
			delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "Please select a row");
					}
					if(table.getSelectedRow()>=0) {
						int srow=table.getSelectedRow();
						int sid=srow+1;
						BillService billService=new BillServiceImpl();
						if(billService.removeBill(sid)) {
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
			delete.setBounds(234, 417, 91, 23);
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
					"Quantity", "Name", "Mrp", "Price"
				}
			));
		}
		return table;
	}
	
	private void displayData() {
		List<Bill> list=new ArrayList<>();
		BillService billService=new BillServiceImpl();
		
		list=billService.getAllBill();
		
		DefaultTableModel tmodel=(DefaultTableModel)table.getModel();
		tmodel.setRowCount(0);
		
		for(Bill bill: list) {
			tmodel.addRow(new Object[] {bill.getQuantity(),bill.getName(),bill.getMrp(),(bill.getQuantity()*bill.getMrp())});
		}
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Date");
			lblNewLabel_1_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_2.setBounds(405, 15, 81, 14);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getDateText() {
		if (dateText == null) {
			dateText = new JTextField();
			dateText.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					 // Set the current date when the text field gains focus
	                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	                Date currentDate = new Date();
	                dateText.setText(dateFormat.format(currentDate));
				}
			});
			dateText.setColumns(10);
			dateText.setBounds(536, 11, 137, 28);
		}
		return dateText;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Total");
			lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1_1.setBounds(610, 500, 81, 20);
		}
		return lblNewLabel_1_1_1_1_1_1_1;
	}
	private JButton getPrintButton() {
		if (printButton == null) {
			printButton = new JButton("Print");
			printButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			printButton.setForeground(new Color(255, 127, 80));
			printButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			printButton.setBounds(486, 534, 91, 23);
		}
		return printButton;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Discount");
			lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1_1_2.setBounds(34, 366, 81, 20);
		}
		return lblNewLabel_1_1_1_1_1_1_2;
	}
	private JTextField getQuantityText() {
		if (quantityText == null) {
			quantityText = new JTextField();
			quantityText.setColumns(10);
			quantityText.setBounds(165, 311, 137, 28);
		}
		return quantityText;
	}
	private JTextField getDiscountText() {
		if (discountText == null) {
			discountText = new JTextField();
			discountText.setColumns(10);
			discountText.setBounds(165, 365, 137, 28);
		}
		return discountText;
	}
	private JTextField getTotalText() {
		if (totalText == null) {
			totalText = new JTextField();
			totalText.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					 int total = 0;
					    int columnToCalculate = 3; // Replace this with the column index you want to calculate (assuming 0-based indexing)

					    // Iterate through the rows of the JTable
					    for (int row = 0; row < table.getRowCount(); row++) {
					        // Get the value from the specific column in the current row
					        Object cellValue = table.getValueAt(row, columnToCalculate);

					        // Assuming the column contains integer values, convert and add to the total
					        if (cellValue instanceof Double) {
					            total += (Double) cellValue;
					        }
					    }

					    // Set the total in the totalText JTextField
					    totalText.setText(String.valueOf(total));
				}
			});
			totalText.setColumns(10);
			totalText.setBounds(741, 503, 137, 28);
		}
		return totalText;
	}
	
}
