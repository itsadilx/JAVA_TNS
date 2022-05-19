package com.tns.placement.repository;

import com.tns.placement.entities.College;

public interface ICollegeRepository 
{
	 public College addCollege (College college);
	 public College updateCollege (College college);
	 public College searchCollege (int id);
	 public boolean deleteCollege (int id);
	   
	  public abstract void beginTransaction();
	  public abstract void commitTransaction();
}
