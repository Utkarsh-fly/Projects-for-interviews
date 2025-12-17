package com.exam.service;

import java.util.List;

import com.exam.dao.loanDao;
import com.exam.dto.loanDto;
import com.exam.entity.loan;

public interface LoanService {

	String addLoan(loanDto dto);

	List<loanDao> displayLoan(loanDto dto);

	List<loanDao> displayLoanType(String type);

	String updateLoanAmount();

	String UpdateLoanType(String type);

	String DeleteLoan(Long id);

}
