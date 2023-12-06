package org.jsp.merchantproductOTM.exception;

public class MerchantNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Merchant Not Found";
	}
}
