package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Cashier;


public class CashierServiceImpl implements CashierService{

	@Override
	public boolean addCashier(Cashier c) {
		
		String sql="insert cashier(cashierId,cashierName,mobileNumber,address,emailId,password) values(?,?,?,?,?,?)";
		try {
			PreparedStatement pstm= DB.getConnection().prepareStatement(sql);
			pstm.setInt(1, c.getCashierId() );
			pstm.setString(2, c.getCashierName());
			pstm.setString(3, c.getMobileNumber());
			pstm.setString(4, c.getAddress());
			pstm.setString(5, c.getEmailId());
			pstm.setString(6, c.getPassword());
			
			pstm.execute();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean updateCashier(Cashier c) {

		String sql="update cashier set cashierId=?,cashierName=?,mobileNumber=?,address=?,emailId=?,password=? where cashierId=?";
		try {
			PreparedStatement pstm=DB.getConnection().prepareStatement(sql);
			pstm.setInt(1,c.getCashierId());
			pstm.setString(2,c.getCashierName());
			pstm.setString(3, c.getMobileNumber());
			pstm.setString(4, c.getAddress());
			pstm.setString(5, c.getEmailId());
			pstm.setString(6, c.getPassword());
			pstm.setInt(7, c.getCashierId());
			
			pstm.execute();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCashier(int id) {
		// TODO Auto-generated method stub
		
		String sql="delete from cashier where cashierId='"+id+"'";
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
	public List<Cashier> getAllCashier() {
		List<Cashier> list=new ArrayList<>();
		String sql="select * from cashier";
		
		Statement stm;
		try {
			stm = DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Cashier c=new Cashier();
				c.setCashierId(rs.getInt("cashierId"));
				c.setCashierName(rs.getString("cashierName"));
				c.setMobileNumber(rs.getString("mobileNumber"));
				c.setAddress(rs.getString("address"));
				c.setEmailId(rs.getString("emailId"));
				c.setPassword(rs.getString("password"));
				
				list.add(c);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return list;
	}

	@Override
	public boolean checkCredentials(String username, String password) {
	
		String sql="select * from cashier";
		
		try{
			Statement stm=DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			while(rs.next()) {
				Cashier c=new Cashier();
				c.setCashierName(rs.getString("cashierName"));
				c.setPassword(rs.getString("password"));
				if(username.equalsIgnoreCase(c.getCashierName()) && password.equals(c.getPassword())) {
					return true;
				}
				
			}
	
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Cashier getCashierById(int id) {
		Cashier c = new Cashier();
		String sql="select * from cashier where cashierId='"+id+"'";
		try {
			Statement stm= DB.getConnection().createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			if(rs.next()) {
				c.setCashierId(rs.getInt("cashierId"));
				c.setCashierName(rs.getString("cashierName"));
				c.setMobileNumber(rs.getString("mobileNumber"));
				c.setEmailId(rs.getString("address"));
				c.setAddress(rs.getString("emailId"));
				c.setPassword(rs.getString("password"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}

}
