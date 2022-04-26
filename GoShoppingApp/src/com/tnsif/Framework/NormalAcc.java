package com.tnsif.Framework;

public class NormalAcc extends ShopAcc
{

protected final float deliveryCharges;

  
  public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	super(accNo, accNm, charges);
	this.deliveryCharges = deliveryCharges;
}

public void bookProduct(float charges)
  {
	  
  }

@Override
public String toString() {
	return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
}
