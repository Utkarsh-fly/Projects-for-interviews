package com.exam.globalExceptionalHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.exam.dto.ApiResponse;
import com.exam.exception.ResourseNotFoundException;



@RestControllerAdvice
public class GlobalExceptionHandle {

	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<?> HandleResourseNotFoundException(ResourseNotFoundException e)
	{
		return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(new ApiResponse(e.getMessage(),"not found"));
	}
}
