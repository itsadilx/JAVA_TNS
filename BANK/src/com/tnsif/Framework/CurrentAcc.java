package com.tnsif.Framework;

public class CurrentAcc extends BankAcc
{
	  
   protected final float creaditLimit;
 
public CurrentAcc(int accNo, String accNm, float accBal, float creaditLimit) {
	super(accNo, accNm, accBal);
	this.creaditLimit = creaditLimit;
}

public  void withdraw (float accBal)
 {
	 
 }

@Override
public String toString() {
	return "CurrentAcc [creaditLimit=" + creaditLimit + ", accNo=" + getAccNo() + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

protected String getaccNo() {
	return null;
}
}
