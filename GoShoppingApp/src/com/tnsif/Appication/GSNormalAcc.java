package com.tnsif.Appication;

import com.tnsif.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{
  public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		
	}

   public void bookProduct(float charges)
  {
	  
  }

@Override
public String toString() {
	return "GSNormalAcc [deliveryCharges=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
			+ charges + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}
}
