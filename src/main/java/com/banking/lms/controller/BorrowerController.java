package com.banking.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.lms.exception.LMSException;
import com.banking.lms.request.BorrowerRequest;
import com.banking.lms.response.BorrowerResponse;
import com.banking.lms.response.ErrorResponse;
import com.banking.lms.service.BorrowerService;

@RestController
@RequestMapping("/api/v1")
public class BorrowerController {
	
	@Autowired
	BorrowerService borrowerService;
	
	public Object stepOne(@RequestBody @Validated BorrowerRequest brRequest) {
	BorrowerResponse borrowerResponse= null;	
		
		try {
			
			borrowerResponse = borrowerService.getStepOne(brRequest);
			
		}catch(LMSException le) {
			return new ErrorResponse();
		}
		catch(Exception e) {
			return new ErrorResponse();
		}
		return borrowerResponse;
	}

}
