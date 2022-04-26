package com.tnsif.Appication;

import com.tnsif.Framework.NormalAcc;
import com.tnsif.Framework.PrimeAcc;
import com.tnsif.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isSalaried) 
	{
		GSPrimeAcc gsprime=new GSPrimeAcc(AccNo, accNm, charges, isSalaried);
		return gsprime;
	}
	{
		
	}
	public NormalAcc getNewNormalAccount11(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal=new GSNormalAcc(AccNo,accNm,charges,deliveryCharges);
		return gsnormal;
	}
	{
		
	}
	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, float isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

}
