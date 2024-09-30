package com.vw.intf;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vw.dto.TransactionDto;
import com.vw.entity.Transaction;

//@FeignClient(name="Transaction-Service", url="http://localhost:8082/transaction")
@FeignClient(name="Transaction-Service", url="http://localhost:9000/transaction")
public interface TransactionIntf {
	
	@PostMapping("/add")
	public String addTransactions(@RequestBody TransactionDto dto);
	
	@GetMapping("/all")
	public List<Transaction> getAllTransactions();
	
	@GetMapping("/id/{transactionId}")
	public Transaction getSingleTransaction(@PathVariable int transactionId);
	
	@PutMapping("/update/{transactionId}")
	public Transaction updateTransaction(@PathVariable int transactionId, @RequestBody TransactionDto dto);
	
	@DeleteMapping("/delete/{transactionId}")
	public String deleteTransactions(@PathVariable int transactionId);
	
	//assigns
	@GetMapping("/getByCustomer/{customerCode}")
	public List<Transaction> getTransactionsByCustomerCode(@PathVariable int customerCode);
	
	@GetMapping("/getByCustomerAndTranstype/{customerCode}/{transactionType}")
	public List<Transaction> getTransactionsByCustomerCodeAndTransactionType(@PathVariable int customerCode, @PathVariable String transactionType);
	
	@GetMapping("/getByranstype/{transactionType}")
	public List<Transaction> getTransactionsByTansactionsType(@PathVariable String transactionType);

}
