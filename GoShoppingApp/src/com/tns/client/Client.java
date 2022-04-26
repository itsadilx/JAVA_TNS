package com.tns.client;

import com.tnsif.Appication.GSNormalAcc;
import com.tnsif.Appication.GSPrimeAcc;
import com.tnsif.Appication.GSShopFactory;

public class Client {

	public static void main(String[] args) 
	{
		GSShopFactory gssfactory=new GSShopFactory();
        gssfactory.getNewPrimeAccount(111, "Adil", 1000, true);
        gssfactory.getNewNormalAccount(123, "Rahul", 3456, 50);
        
        GSPrimeAcc gsprime=new GSPrimeAcc(111, "Adil", 1000, true);
        gsprime.getAccNo();
        gsprime.getAccNm();
        gsprime.getCharges();
        gsprime.bookProduct(1000);
        gsprime.toString();
        
        GSNormalAcc gsnormal=new GSNormalAcc (123, "Rahul", 3456, 50);
        gsnormal.getAccNo();
        gsnormal.getAccNm();
        gsnormal.getCharges();
        gsnormal.getdeliveryCharges();
        gsnormal.bookProduct(3456);
        gsnormal.toString();
        
	}

}
