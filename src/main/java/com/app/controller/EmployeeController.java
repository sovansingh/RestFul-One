package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping("/show")
	public ResponseEntity<String> showData(){
		ResponseEntity<String> resp=new ResponseEntity<String>("Hello from Get",HttpStatus.OK);
		return resp;
	}
	
	@PostMapping("/data")
	public ResponseEntity<Employee> viewinfo(@RequestBody Employee e){
		e.setEmpName("Hello :"+e.getEmpName());
		e.setEmpSal(e.getEmpSal()+e.getEmpSal()*10/100.0);
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
	}
}
