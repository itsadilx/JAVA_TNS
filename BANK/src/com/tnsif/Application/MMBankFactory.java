package com.tnsif.Application;

import com.tnsif.Framework.BankFactory;
import com.tnsif.Framework.CurrentAcc;
import com.tnsif.Framework.SavingAcc;

public class MMBankFactory implements BankFactory
{	
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried)
	    {
	    	MMSavingAcc mmsaving=new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
			return mmsaving;
			
	    	
	    }
	
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creaditLimit)
	   {
		MMCurrentAcc mmcurrent=new MMCurrentAcc(AccNo, accNm, accBal, creaditLimit);
		return mmcurrent;
		   
	   }
}