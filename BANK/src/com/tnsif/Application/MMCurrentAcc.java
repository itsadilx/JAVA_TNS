package com.tnsif.Application;

import com.tnsif.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{
    public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal, accBal);
		
	}

	public void withdraw(float accBal)
    {
    	
    }

	@Override
	public String toString() {
		return "MMCurrentAcc [creaditLimit=" + creaditLimit + ", accNo=" + getAccNo() + ", accNm=" + accNm + ", accBal="
				+ accBal + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	@Override
	protected String getAccNo() {
		// TODO Auto-generated method stub
		return null;
	}
}
