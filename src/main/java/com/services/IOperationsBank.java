package com.services;

/**
 * 
 * @author hlazrak
 *
 */
public interface IOperationsBank {
	public boolean withdrawal(Double amount);
	public boolean deposit(Double amount);
	public Double getMontantOfAccount();
}
