package com.tnsif.client;



import com.tnsif.Application.MMBankFactory;
import com.tnsif.Application.MMCurrentAcc;
import com.tnsif.Application.MMSavingAcc;

public class Client1 {
	public static void main(String[] args) 
	{
		MMBankFactory mmbankfactory=new MMBankFactory();
		mmbankfactory.getNewSavingAccount(111, "Adil", 1000, true);
		mmbankfactory.getNewCurrentAccount(123, "Rahul", 3456, 50);
        
        MMSavingAcc mmsaving=new MMSavingAcc(111, "Adil", 1000, true);
        mmsaving.getaccNo();
        mmsaving.getaccNm();
        mmsaving.getaccBal();
        mmsaving.isSalary();
        mmsaving.toString();
        
       MMCurrentAcc mmcurrent=new  MMCurrentAcc (123, "Rahul", 3456, 50);
       mmcurrent.getaccNo();
       mmcurrent.getaccNm();
       mmcurrent.getaccBal();
       mmcurrent.creaditLimit();
       mmcurrent.toString();
        
	}

}
