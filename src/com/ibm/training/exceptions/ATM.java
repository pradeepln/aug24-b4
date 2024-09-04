package com.ibm.training.exceptions;

public class ATM {
	
	
	public void performOperation() {
		BankingSystem bs = new BankingSystem();
		
		try {
			bs.withdrawMoney(9, 1000);
			System.out.println("Successfully withdrawn....");
			try {
				printReceipt();
			}catch (OutOfPaperException e) {
				System.out.println("Sorry, can't print receipt. Plese refer to SMS");
			}
		}catch (InvalidAccountIdException e) {
			System.out.println("Please ceck your acc num....");
		}catch (InsuficcientFundsException e) {
			System.out.println("Not enuf money");
		}
	}

	private void printReceipt() {
		boolean paper = false;
		
		if(!paper) {
			throw new OutOfPaperException();
		}
		
	}

}
