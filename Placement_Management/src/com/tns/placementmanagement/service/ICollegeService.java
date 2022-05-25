package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entities.College;

public interface ICollegeService
{
   public College addCollege (College college);
   public College updateCollege (College college);
   public College searchCollege (int id);
   public boolean deleteCollege (int id);
   //public boolean schedulePlacement (Placement placement );
College searchCollege(College college);
public College searchCollegeById(int i);


}
