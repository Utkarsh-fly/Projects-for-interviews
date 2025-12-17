package com.exam.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.data.convert.DtoInstantiatingConverter;
import org.springframework.stereotype.Service;

import com.exam.dao.loanDao;
import com.exam.dto.loanDto;
import com.exam.entity.Type;
import com.exam.entity.loan;
import com.exam.exception.ResourseNotFoundException;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class LoanServiceImpl implements LoanService {
	
	private final loanDao dao;
	private final ModelMapper mapper;
	
	
	@Override
	public String addLoan(loanDto dto) {
		
		if(dao.existsByName(dto.getName()))
		{
			throw new ResourseNotFoundException("resourse already exists");
		}
		
		if(dto.getIAmount()>0 && dto.getStartDate().isBefore(dto.getEndDate())) {
		loan map1 = mapper.map(dto, loan.class);
		loan save = dao.save(map1);
		return "succ : "+save;
		}
		return null;
	}

	@Override
	public List<loanDao> displayLoan(loanDto dto) {
		
		List<loan> all = dao.findAll();
		
		List<loanDao> list = all.stream().map(p->mapper.map(p, loanDao.class)).toList();
		return list;
	}

	@Override
	public List<loanDao> displayLoanType(String type) {
		
		Type valueOf = Type.valueOf(type);
		List<loan> byType = dao.findByType(valueOf);
		
		return byType.stream().map(p->mapper.map(p, loanDao.class)).toList();
		 
	}

	@Override
	public String updateLoanAmount() {
		
		List<loan> all = dao.findAll();
		all.stream().filter(p->p.getIAmount() > 700000).forEach(p->p.setIAmount(p.getIAmount()*1.7));
		return "succ updation";
	}

	@Override
	public String UpdateLoanType(String type) {
		
		Type valueOf = Type.valueOf(type);
		List<loan> byType = dao.findByType(valueOf);
		
		 byType.stream().forEach(p->p.setName("utkrash"));
		 
		 return "updation done";
	}

	@Override
	public String DeleteLoan(Long id) {
		
		dao.deleteById(id);
		return "succ deleted";
	}

	
}
