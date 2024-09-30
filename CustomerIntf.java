package com.vw.intf;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.vw.dto.CustomerDto;
import com.vw.entity.Customer;

//@FeignClient(name="CUSTOMER-SERVICE", url="http://localhost:8081/customer")
@FeignClient(name="CUSTOMER-SERVICE", url="http://localhost:9000/customer")
//@CrossOrigin("http://localhost:4200")
public interface CustomerIntf {
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody CustomerDto dto);
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllCustomers();
	
	@GetMapping("/id/{customerCode}")
	public ResponseEntity<Customer> getSingleCustomer(@PathVariable int customerCode);
	
	@PutMapping("/update/{customerCode}")
	public ResponseEntity<Customer> updateCustomer(@PathVariable int customerCode, @RequestBody CustomerDto dto);
	
	@DeleteMapping("/delete/{customerCode}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int customerCode);

}
