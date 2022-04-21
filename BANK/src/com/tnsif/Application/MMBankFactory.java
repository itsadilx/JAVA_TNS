package com.tnsif.Application;

import com.tnsif.Framework.BankFactory;
import com.tnsif.Framework.CurrentAcc;
import com.tnsif.Framework.SavingAcc;

public  class MMBankFactory extends BankFactory
{
	    public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried)
	    {
			return null;
			
	    	
	    }
	 
	   public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creaditLimit)
	   {
		return null;
		
		   
	   }
	  
}
