package com.tnsif.Appication;

import com.tnsif.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}

	private static final float charges=0;
    public void bookProduct(float charges)
    {
    	
    }

	public String toString() {
		return "GSPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
