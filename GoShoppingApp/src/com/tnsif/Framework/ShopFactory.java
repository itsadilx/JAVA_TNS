package com.tnsif.Framework;

public interface ShopFactory 
{
     public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, float isPrime); 
	
     public abstract  NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges);
  
}
