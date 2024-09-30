package com.vw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vw.dto.CustomerDto;
import com.vw.entity.Customer;
import com.vw.intf.CustomerIntf;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:4200")
public class CustomerController {
	
	@Autowired
	private CustomerIntf intf;
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody CustomerDto dto) {
		return intf.addCustomer(dto);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return intf.getAllCustomers();
	}
	
	@GetMapping("/id/{customerCode}")
	public ResponseEntity<Customer> getSingleCustomer(@PathVariable int customerCode){
		return intf.getSingleCustomer(customerCode);
	}
	
	@PutMapping("/update/{customerCode}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int customerCode, @RequestBody CustomerDto dto){
		return intf.updateCustomer(customerCode, dto);
	}
	
	@DeleteMapping("/delete/{customerCode}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int customerCode){
		return intf.deleteCustomer(customerCode);
	}


}
