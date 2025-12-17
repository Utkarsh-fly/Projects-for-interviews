package com.exam.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.NotBlank;

import com.exam.entity.Type;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class loanDto {

	@NonNull @NotBlank
	private String name;
	@NonNull
	private Type type;
	@NonNull
	private double pAmount;
	@NonNull
	private double iAmount;
	@NonNull
	private LocalDate startDate;
	@NonNull
	private LocalDate endDate;
	@NonNull
	private String bname;
}
