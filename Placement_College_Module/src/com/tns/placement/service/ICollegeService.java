package com.tns.placement.service;

import com.tns.placement.entities.College;

public interface ICollegeService
{
   public College addCollege (College college);
   public College updateCollege (College college);
   public College searchCollege (College college);
   public boolean deleteCollege (int id);
   //public boolean schedulePlacement (Placement placement );
}
