package com.exam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exam.dao.loanDao;
import com.exam.dto.loanDto;
import com.exam.service.LoanService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class LoanController {

    private final loanDao loanDao;

	private final LoanService loanService;
	
	
	//1)add loan 
	@PostMapping("/addLoan")
	public ResponseEntity<?> addLoan(@Valid @RequestBody loanDto dto) {
		
//		try {
//			return ResponseEntity.ok(loanService.addLoan(dto));
//		} catch (RuntimeException e) {
//			
//			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("failed");
//		}
//	
		return ResponseEntity.ok(loanService.addLoan(dto));}
		
	
	//2) display loan
	@GetMapping("/displayLoan")
public ResponseEntity<?> displayLoan(@Valid @RequestBody loanDto dto) {
		
//		try {
//			return ResponseEntity.ok(loanService.displayLoan(dto));
//		} catch (RuntimeException e) {
//			
//			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("failed");
//		}
//	
		return ResponseEntity.ok(loanService.displayLoan(dto));
	}
	
	//3) display using loan type
	@GetMapping("/displayLoanType/{type}")
public ResponseEntity<?> displayLoanType(@PathVariable String type) {
		
//		try {
//			return ResponseEntity.ok(loanService.displayLoanType(type));
//		} catch (RuntimeException e) {
//			
//			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("failed");
//		}
		return ResponseEntity.ok(loanService.displayLoanType(type));
	}
	
	//4 update loan iAmount
	@PutMapping("/UpdateLoanAmount")
public ResponseEntity<?> updateLoanAmount() {
		
//		try {
//			return ResponseEntity.ok(loanService.updateLoanAmount());
//		} catch (RuntimeException e) {
//			
//			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("failed");
//		}
		return ResponseEntity.ok(loanService.updateLoanAmount());
	}
	
	//5 update amount from type
	@PutMapping("/displayLoanType/{type}")
public ResponseEntity<?> UpdateLoanType(@PathVariable String type) {
		
//		try {
//			return ResponseEntity.ok(loanService.UpdateLoanType(type));
//		} catch (RuntimeException e) {
//			
//			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("failed");
//		}
//	
		return ResponseEntity.ok(loanService.UpdateLoanType(type));}
	
	
	//6 Delete loan
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteLoan(@PathVariable Long id) {
	
		return ResponseEntity.ok(loanService.DeleteLoan(id));
	}
}

