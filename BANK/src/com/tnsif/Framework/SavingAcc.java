package com.tnsif.Framework;

public abstract class SavingAcc extends BankAcc
{
   
private boolean isSalary;

public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
	super(accNo, accNm, accBal);
	this.isSalary = isSalary;
}



   static final private float MINBAL=0;
   public void withdraw (float accBal)
   {
	   
   }




@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}




public static float getMinbal() {
	return MINBAL;
}
   


}