package com.tnsif.Appication;

import com.tnsif.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float charges=0;
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}

	
    public void bookProduct(float charges)
    {
       System.out.println("Dear Prime User,Your product charges"+charges);
    }

	public String toString() {
		return "GSPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public float getCharges() {
		return charges;
	}
}
