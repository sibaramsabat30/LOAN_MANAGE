package com.banking.lms.exception;

import lombok.Data;

@Data
public class LMSException  extends Exception{
	
	private String errorCode;
	private String errorMsg;
	

}
