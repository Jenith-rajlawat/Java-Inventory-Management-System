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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ProductInformation extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextField search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInformation frame = new ProductInformation();
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
	public ProductInformation() {
		setTitle("Update Stock");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 900, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getScrollPane());
		contentPane.add(getSearch());
		displayData();
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Product Information");
			lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
			lblNewLabel.setBounds(10, 11, 226, 48);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Search");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 16));
			lblNewLabel_1_1_1_1_1.setBounds(296, 126, 81, 24);
		}
		return lblNewLabel_1_1_1_1_1;
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
			scrollPane.setBounds(110, 161, 685, 439);
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

		
	}
	private JTextField getSearch() {
		if (search == null) {
			search = new JTextField();
			search.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String sdata= search.getText().trim();
					
					ProductService productService=new ProductServiceImpl();
					List<Product> list=productService.searchProduct(sdata);
					
					DefaultTableModel tmodel=(DefaultTableModel)table.getModel();
					tmodel.setRowCount(0);//reset Table
					for(Product product: list) {
						tmodel.addRow(new Object[] {product.getProductId(),product.getProductName(),product.getQuantity(),product.getMrp()});
					}
						
				}
			});
			search.setColumns(10);
			search.setBounds(387, 127, 137, 28);
		}
		return search;
	}
}
