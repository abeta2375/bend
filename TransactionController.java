package com.vw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.dto.TransactionDto;
import com.vw.entity.Transaction;
import com.vw.intf.TransactionIntf;

@RestController
@RequestMapping("/transaction")
@CrossOrigin("http://localhost:4200")
public class TransactionController {
	
	@Autowired
	private TransactionIntf intf;
	
	@PostMapping("/add")
	public String addTransactions(@RequestBody TransactionDto dto) {
		return intf.addTransactions(dto);
	}
	
	@GetMapping("/all")
	public List<Transaction> getAllTransactions(){
		return intf.getAllTransactions();
	}
	
	@GetMapping("/id/{transactionId}")
	public Transaction getSingleTransaction(@PathVariable int transactionId) {
		return intf.getSingleTransaction(transactionId);
	}
	
	@PutMapping("/update/{transactionId}")
	public Transaction updateTransaction(@PathVariable int transactionId, @RequestBody TransactionDto dto) {
		return intf.updateTransaction(transactionId, dto);
	}
	
	@DeleteMapping("/delete/{transactionId}")
	public String deleteTransactions(@PathVariable int transactionId) {
		return intf.deleteTransactions(transactionId);
	}
	
	//assigns
	@GetMapping("/getByCustomer/{customerCode}")
	public List<Transaction> getTransactionsByCustomerCode(@PathVariable int customerCode){
		return intf.getTransactionsByCustomerCode(customerCode);
	}
	
	@GetMapping("/getByCustomerAndTranstype/{customerCode}/{transactionType}")
	public List<Transaction> getTransactionsByCustomerCodeAndTransactionType(@PathVariable int customerCode, @PathVariable String transactionType){
		return intf.getTransactionsByCustomerCodeAndTransactionType(customerCode, transactionType);
	}
	
	@GetMapping("/getByranstype/{transactionType}")
	public List<Transaction> getTransactionsByTansactionsType(@PathVariable String transactionType){
		return intf.getTransactionsByTansactionsType(transactionType);
	}

}
