package com.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

import com.model.Cashier;
import com.model.Product;
import com.service.CashierService;
import com.service.CashierServiceImpl;
import com.service.ProductService;
import com.service.ProductServiceImpl;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class UpdateStock extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField productIdText;
	private JLabel lblNewLabel_1_1;
	private JTextField productNameText;
	private JLabel lblNewLabel_1_1_1;
	private JTextField quantityAvailableText;
	private JLabel lblNewLabel_1_1_1_1;
	private JTextField quantityAddedText;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JTextField mrpText;
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
					UpdateStock frame = new UpdateStock();
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
	public UpdateStock() {
		setTitle("Update Stock");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getProductIdText());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getProductNameText());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getQuantityAvailableText());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getQuantityAddedText());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getMrpText());
		contentPane.add(getAdd());
		contentPane.add(getUpdate());
		contentPane.add(getDelete());
		contentPane.add(getScrollPane());
		displayData();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Update Stock");
			lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
			lblNewLabel.setBounds(10, 11, 169, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product Id");
			lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1.setBounds(42, 109, 81, 14);
		}
		return lblNewLabel_1;
	}
	private JTextField getProductIdText() {
		if (productIdText == null) {
			productIdText = new JTextField();
			productIdText.setBounds(203, 105, 137, 28);
			productIdText.setColumns(10);
		}
		return productIdText;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Product Name\r\n");
			lblNewLabel_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(42, 155, 121, 14);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getProductNameText() {
		if (productNameText == null) {
			productNameText = new JTextField();
			productNameText.setColumns(10);
			productNameText.setBounds(203, 151, 137, 28);
		}
		return productNameText;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Quantity Available\r\n");
			lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1.setBounds(42, 199, 137, 26);
		}
		return lblNewLabel_1_1_1;
	}
	private JTextField getQuantityAvailableText() {
		if (quantityAvailableText == null) {
			quantityAvailableText = new JTextField();
			quantityAvailableText.setColumns(10);
			quantityAvailableText.setBounds(203, 197, 137, 28);
		}
		return quantityAvailableText;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Quantity Added");
			lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1.setBounds(42, 245, 137, 24);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JTextField getQuantityAddedText() {
		if (quantityAddedText == null) {
			quantityAddedText = new JTextField();
			quantityAddedText.setColumns(10);
			quantityAddedText.setBounds(203, 241, 137, 28);
		}
		return quantityAddedText;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Mrp");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1.setBounds(42, 285, 81, 24);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JTextField getMrpText() {
		if (mrpText == null) {
			mrpText = new JTextField();
			mrpText.setColumns(10);
			mrpText.setBounds(203, 281, 137, 28);
		}
		return mrpText;
	}
	private JButton getAdd() {
		if (add == null) {
			add = new JButton("Add ");
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Product product=new Product();
					//post and retrieve to send to service for further processing
					int productId=Integer.parseInt(productIdText.getText());
					String productName=productNameText.getText();
					double quantityAvailable=Double.parseDouble(quantityAvailableText.getText());	
					double quantityAdded=Double.parseDouble(quantityAddedText.getText());	
					double mrp=Double.parseDouble(mrpText.getText());	
					
					
					//prepare parameter for service to add
					product.setProductId(productId);
					product.setProductName(productName);
					product.setQuantity(quantityAvailable);
					product.setQuantityAdded(quantityAdded);
					product.setMrp(mrp);
					
					
					//call service
					ProductService productService=new ProductServiceImpl();
					if(productService.addProduct(product)) {
						JOptionPane.showMessageDialog(null,"Added Success");
						productIdText.setText("");
						productNameText.setText("");
						quantityAvailableText.setText("");
						quantityAddedText.setText("");
						mrpText.setText("");
						
						displayData();
					}else {
						JOptionPane.showMessageDialog(null, "Fail to add");
					}
					
					
					
					
				}
			});
			add.setForeground(SystemColor.activeCaption);
			add.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			add.setBounds(21, 401, 91, 23);
		}
		return add;
	}
	private JButton getUpdate() {
		if (update == null) {
			update = new JButton("Update");
			update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					   int selectedRow = table.getSelectedRow();

		                if (selectedRow < 0) {
		                    JOptionPane.showMessageDialog(null, "Please select a row to update");
		                } else {
		                
		                    int productId = Integer.parseInt(productIdText.getText());
		                    String productName = productNameText.getText();
		                    double quantityAvailable = Double.parseDouble(quantityAvailableText.getText());
		                    double quantityAdded = Double.parseDouble(quantityAddedText.getText());
		                    double mrp = Double.parseDouble(mrpText.getText());

		                    // Create a new Product object with the updated data
		                    Product updatedProduct = new Product();
		                    updatedProduct.setProductId(productId);
		                    updatedProduct.setProductName(productName);
		                    updatedProduct.setQuantity(quantityAvailable);
		                    updatedProduct.setQuantityAdded(quantityAdded);
		                    updatedProduct.setMrp(mrp);

		                    // Call the ProductService to update the product
		                    ProductService productService = new ProductServiceImpl();
		                    if (productService.updateProduct(productId, updatedProduct)) {
		                        JOptionPane.showMessageDialog(null, "Update Success");
		                         // Clear input fields after successful update
		                        displayData();
		                    } else {
		                        JOptionPane.showMessageDialog(null, "Failed to update");
		                    }}
					
				}
			});
			update.setForeground(Color.GRAY);
			update.setFont(new Font("Segoe UI Semilight", Font.BOLD, 15));
			update.setBounds(150, 401, 91, 23);
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
					if(table.getSelectedRow()>=0) {
						int srow=table.getSelectedRow();
						int sid=(int)table.getModel().getValueAt(srow, 0);
						
						ProductService productService=new ProductServiceImpl();
						
						if(productService.deleteProduct(sid)) {
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
			delete.setBounds(276, 401, 91, 23);
		}
		return delete;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
			
				@Override
				public void mouseClicked(MouseEvent e) {
					edit();
				}
			});
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
					"Product Id", "Product Name", "Available", "Mrp"
				}
			));
			
		}
		return table;
	}
	
	private void displayData() {
		List<Product> list=new ArrayList<>();
		ProductService productService=new ProductServiceImpl();
		
		list=productService.getAllProduct();
		
		DefaultTableModel tmodel=(DefaultTableModel)table.getModel();
		tmodel.setRowCount(0);
		
		for(Product product: list) {
			tmodel.addRow(new Object[] {product.getProductId(),product.getProductName(),product.getQuantity(),product.getMrp()});
		}
	}
	
	private void edit() {
		if(table.getSelectedRow()<0) {
		JOptionPane.showMessageDialog(null, "Select a row");
		return;
		}
		int srow=table.getSelectedRow();
		 int sid= (int) table.getModel().getValueAt(srow, 0);
		
		ProductService ss=new ProductServiceImpl();
		Product s=ss.getProductById(sid);	
	//reversed method
	productIdText.setText(String.valueOf(s.getProductId()));
	productNameText.setText(s.getProductName());
	quantityAvailableText.setText(String.valueOf(s.getQuantity()));//String ma chagne gareko
	quantityAddedText.setText(String.valueOf(s.getQuantityAdded()));//String ma chagne gareko
	mrpText.setText(String.valueOf(s.getMrp()));//String ma chagne gareko
		
	}
}
