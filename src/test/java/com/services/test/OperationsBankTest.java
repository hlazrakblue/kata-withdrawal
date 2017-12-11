package com.services.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.services.IOperationsBank;
import com.services.impl.OPerationsBankImpl;

/**
 * 
 * @author hlazrak
 *
 */
public class OperationsBankTest {
	private static IOperationsBank operationsBank;
	
	@Before
	public void init(){
		operationsBank = new OPerationsBankImpl();
	}
	
	@Test
	public void doTestAmountNegative(){
		double withdrawal = -145;
		boolean result = operationsBank.withdrawal(withdrawal);
		Assert.assertFalse(result);
	}
	
	@Test
	public void doTestAmountSupOf2000(){
		double withdrawal = 3000;
		boolean result = operationsBank.withdrawal(withdrawal);
		Assert.assertFalse(result);
	}
	
	@Test
	public void doTestAmountSupOfAmountExistInAccount(){
		double withdrawal = 5000;
		boolean result = operationsBank.withdrawal(withdrawal);
		Assert.assertFalse(result);
	}
	
	@Test
	public void doTestAmountInfOfAmountExistInAccountAndInfOfAutorized(){
		double amountOfAccountBeforeWithdrawal = operationsBank.getMontantOfAccount();
		double withdrawal = 500;
		boolean result = operationsBank.withdrawal(withdrawal);
		Assert.assertTrue(result);
		double amountOfAccountAfterWithrawal = operationsBank.getMontantOfAccount();
		Assert.assertEquals((amountOfAccountBeforeWithdrawal - 500), amountOfAccountAfterWithrawal, 0.1);
	}
	
}
