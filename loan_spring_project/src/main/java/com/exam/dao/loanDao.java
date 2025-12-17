package com.exam.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Type;
import com.exam.entity.loan;

public interface loanDao extends JpaRepository<loan, Long> {

	boolean existsByName(String name);

	List<loan>findByType(Type valueOf);

}
