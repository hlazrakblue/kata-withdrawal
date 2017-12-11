package com.services.impl;

import com.services.IOperationsBank;
/**
 * 
 * @author hlazrak
 *
 */
public class OPerationsBankImpl implements IOperationsBank {
	
	//the maximum amount that can be withdrawn
	private static double WITH_DRAWAL_CEILING = 2000;
	
	private static double TOTAL_AMOUNT_OF_THE_ACCOUNT = 4000;

	public boolean withdrawal(Double amount) {
		if(amount < 0 || amount > TOTAL_AMOUNT_OF_THE_ACCOUNT || amount > WITH_DRAWAL_CEILING){
			return false;
		}
		TOTAL_AMOUNT_OF_THE_ACCOUNT = TOTAL_AMOUNT_OF_THE_ACCOUNT - amount;
		return true;
	}

	public boolean deposit(Double amount) {
		throw new UnsupportedOperationException("this fonction it's not disponible.");
	}

	public Double getMontantOfAccount() {
		return TOTAL_AMOUNT_OF_THE_ACCOUNT;
	}
	
}
