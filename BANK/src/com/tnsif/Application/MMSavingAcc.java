package com.tnsif.Application;

import com.tnsif.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
    public MMSavingAcc(int accNo, String accNm, float accBal,boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
    static final private float MINBAL=0;
   public void withdraw (float accBal) 
    {
    	
    }

	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public static float getMinbal() {
		return MINBAL;
	}
}
