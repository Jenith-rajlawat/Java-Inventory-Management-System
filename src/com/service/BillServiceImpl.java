package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.db.DB;
import com.model.Bill;
import java.sql.Connection; 



public class BillServiceImpl implements BillService {

	@Override
	public boolean addBill(Bill bill) {
		 String sql = "INSERT INTO bill (billNo, customerName, productId, name, mrp, quantity, discount, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		    try (Connection connection = DB.getConnection();
		         PreparedStatement statement = connection.prepareStatement(sql)) {

		        // Set the parameters for the prepared statement
		        statement.setInt(1, bill.getBillNo());
		        statement.setString(2, bill.getCustomerName());
		        statement.setInt(3, bill.getProductId());
		        statement.setString(4, bill.getName());
		        statement.setDouble(5, bill.getMrp());
		        statement.setDouble(6, bill.getQuantity());
		        statement.setDouble(7, bill.getDiscount());
		        statement.setString(8, (bill.getDate()));
		        // Execute the query
		        statement.executeUpdate();
		        return true;

		    } catch (SQLException e) {
		        e.printStackTrace();
		        // Handle the exception appropriately
		    }

		    return false;
	}

	@Override
	public boolean removeBill(int id) {
		String sql="delete from bill where billNo='"+id+"'";
		Statement stm;
		try {
			stm = DB.getConnection().createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	@Override
	public List<Bill> getAllBill() {
		List<Bill> list=new ArrayList<>();
		String sql="select * from bill";
		
		Statement stm;
		try {
			stm = DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Bill bill=new Bill();
				bill.setQuantity(rs.getDouble("quantity"));
				bill.setName(rs.getString("name"));
				 bill.setMrp(rs.getDouble("mrp"));
				 
				 //for search
				 bill.setBillNo(rs.getInt("billNo"));
				 bill.setCustomerName(rs.getString("customerName"));
				 bill.setDate(rs.getString("date"));
				 bill.setTotal((rs.getDouble("mrp"))*(rs.getDouble("quantity")));
				
				
				list.add(bill);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return list;
	}
	
	@Override
public List<Bill> searchBill(String data) {
		
		//same as get all student
		List<Bill> slist=new ArrayList<>();
		String sql ="select * from bill where billNo like '%"+data+"%' OR customerName like '%"+data+"%' OR date like '%"+data+"%'" ;
		
		try {
			Statement stm=DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				//row mapping to object
				Bill s=new Bill();
				s.setBillNo(rs.getInt("billNo"));
				s.setCustomerName(rs.getString("customerName"));
				s.setTotal((rs.getDouble("quantity"))*(rs.getDouble("mrp")));
				s.setDate(rs.getString("date"));
				
				slist.add(s);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return slist;
		
		
	}
	
	
}
