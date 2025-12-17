package com.exam.exception;

public class ResourseNotFoundException  extends RuntimeException{

	public ResourseNotFoundException(String mesg)
	{
		super(mesg);
	}
}
