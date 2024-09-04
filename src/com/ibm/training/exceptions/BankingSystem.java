package com.ibm.training.exceptions;

public class BankingSystem {
	
	int idRangeSTart = 10;
	int curBal = 10000;
	public void withdrawMoney(int actId,int amt) {
		
		if(actId < idRangeSTart) {
			InvalidAccountIdException errorToBeSentToCaller = new InvalidAccountIdException();
			throw errorToBeSentToCaller;
		}
		
		if(amt > curBal) {
			InsuficcientFundsException err = new  InsuficcientFundsException();
			throw err;
		}
	}

}


