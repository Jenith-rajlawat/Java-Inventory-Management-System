package com.service;

import java.util.List;

import com.model.Bill;
import com.model.Cashier;

public interface BillService {
	
	boolean addBill(Bill bill);
	boolean removeBill(int id);
	List<Bill> getAllBill();
	List<Bill> searchBill(String data);

}
