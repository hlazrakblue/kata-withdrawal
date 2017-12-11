package com.services.impl;

import com.services.IOperationsBank;
/**
 * 
 * @author hlazrak
 *
 */
public class OPerationsBankImpl implements IOperationsBank {
	
	//the maximum amount that can be withdrawn
	public static double WITH_DRAWAL_CEILING = 2000;
	
	public static double TOTAL_AMOUNT_OF_THE_ACCOUNT = 4000;

	public boolean withdrawal(Double amount) {
		throw new UnsupportedOperationException("this fonction it's not disponible.");
	}

	public boolean deposit(Double amount) {
		throw new UnsupportedOperationException("this fonction it's not disponible.");
	}

	public Double getMontantOfAccount() {
		throw new UnsupportedOperationException("this fonction it's not disponible.");
	}

}
