package com.exam.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Entity: Loan → ℓ
//Loan Fields
//
//Loan Id (auto-increment, primary key)
//
//Loan Name
//
//Loan Type – ENUM (HOME, PERSONAL, EDUCATION, BUSINESS)
//
//Principal Amount
//
//Interest Rate
//
//Start Date
//
//End Date
//
//Borrower Name
//
//Validation Rules
//
//Principal Amount must be > 0
//
//Interest Rate must be ≥ 5%
//
//Start Date < End Date
//
//Borrower Name not null
//
//Operations to Implement
//
//Add a new Loan
//
//Fetch all Loans
//
//Fetch Loans by Type (e.g., HOME/EDUCATION)
//
//If Principal Amount > 5,00,000 → increase Interest Rate by 2%
//
//Delete Loan by ID
//
//Search Loan by Loan Name
//
//Global Exception Handling
//
//Handle LoanNotFoundException
//
//Handle Validation errors
//
//Handle Any other exception
//
//Payload to Accept
//
//loanName
//
//loanType
//
//startDate
//
//endDate
//
//principalAmount
//
//interestRate
//
//borrowerName
//
//Validate them using:
//
//@Valid
//
//@NotNull
//
//@Positive
//
//Custom date validator (optional)

//annotation
@Entity
@Table(name="loan")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class loan {

	//Loan Id (auto-increment, primary key)
	//
	//Loan Name
	//
	//Loan Type – ENUM (HOME, PERSONAL, EDUCATION, BUSINESS)
	//
	//Principal Amount
	//
	//Interest Rate
	//
	//Start Date
	//
	//End Date
	//
	//Borrower Name
	//
	
	
	
	//datamember
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 20, unique = true, nullable = false)
	private String name;
	@Enumerated(EnumType.STRING)
	private Type type;
	@Column(nullable = false)
	private double pAmount;
	@Column(nullable = false)
	private double iAmount;
	@Column(nullable = false)
	private LocalDate startDate;
	@Column(nullable = false)
	private LocalDate endDate;
	@Column(nullable = false)
	private String bname;
}
