package com.banking.lms.service;

import com.banking.lms.request.BorrowerRequest;
import com.banking.lms.response.BorrowerResponse;

public interface BorrowerService {

	public BorrowerResponse getStepOne(BorrowerRequest brRequest) throws Exception;
	
	 

}
