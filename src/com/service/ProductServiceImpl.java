package com.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.db.DB;
import com.model.Product;



public class ProductServiceImpl implements ProductService{

	@Override
	public boolean addProduct(Product product) {
		
		String sql="insert into product(productId,productName,quantity,quantityAdded,mrp) values('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getQuantity()+"','"+product.getQuantityAdded()+"','"+product.getMrp()+"')";
		
		try {
			Statement stm=DB.getConnection().createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return false;
	}

	@Override
	public boolean updateProduct(int id, Product updatedProduct) {
		 String sql = "UPDATE product SET productId=?, productName = ?, quantity = ?, quantityAdded = ?, mrp = ? WHERE productId = ?";
		    
		    try {
		        PreparedStatement preparedStatement = DB.getConnection().prepareStatement(sql);
		        preparedStatement.setInt(1, updatedProduct.getProductId());
		        preparedStatement.setString(2, updatedProduct.getProductName());
		        preparedStatement.setDouble(3, updatedProduct.getQuantity());
		        preparedStatement.setDouble(4, updatedProduct.getQuantityAdded());
		        preparedStatement.setDouble(5, updatedProduct.getMrp());
		        preparedStatement.setInt(6, id);
		        
		        int rowsAffected = preparedStatement.executeUpdate();
		        return rowsAffected > 0;
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    
		    return false;
		}
	
	@Override
	public List<Product> getAllProduct() {
		List<Product> list=new ArrayList<>();
		String sql="select * from product";
		
		Statement stm;
		try {
			stm = DB.getConnection().createStatement();
			ResultSet rs= stm.executeQuery(sql);
			
			while(rs.next()) {
				Product product=new Product();
				product.setProductId(rs.getInt("productId"));
				product.setProductName(rs.getString("productName"));
				product.setQuantity(rs.getDouble("quantity"));
				product.setMrp(rs.getDouble("mrp"));
				
			
				
				list.add(product);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		}
		
		public Product getProductById(int id) {
			Product s = new Product();
				String sql="select * from product where productId='"+id+"'";
				try {
					Statement stm= DB.getConnection().createStatement();
					ResultSet rs=stm.executeQuery(sql);
					
					if(rs.next()) {
						
						
						s.setProductId(rs.getInt("productId"));
						s.setProductName(rs.getString("productName"));
						s.setQuantity(rs.getDouble("quantity"));
						s.setQuantityAdded(rs.getInt("quantityAdded"));
						s.setMrp(rs.getDouble("mrp"));
						
			
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return s;
			}

		@Override
		public boolean deleteProduct(int id) {
		
			String sql="delete from product where productId='"+id+"'";
			try {
				Statement stm=DB.getConnection().createStatement();
				stm.execute(sql);
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return false;
		}
		
		@Override
		public List<Product> searchProduct(String data) {
			
			//same as get all student
			List<Product> slist=new ArrayList<>();
			String sql ="select * from product where productId like '%"+data+"%' OR productName like '%"+data+"%'" ;
			
			try {
				Statement stm=DB.getConnection().createStatement();
				ResultSet rs= stm.executeQuery(sql);
				
				while(rs.next()) {
					//row mapping to object
					Product s=new Product();
					s.setProductId(rs.getInt("productId"));
					s.setProductName(rs.getString("productName"));
					s.setQuantity(rs.getDouble("quantity"));
					s.setMrp(rs.getDouble("mrp"));
					
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
