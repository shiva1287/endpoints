package com.pms.exception;

import com.pms.entity.Product;

public class PMSErrorType extends Product{

	
	private String errorMessage;
	
	public PMSErrorType(final String errString){
		this.errorMessage = errString;
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	
	
}
