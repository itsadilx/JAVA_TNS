package com.tns.placement.repository;

import  com.tns.placement.entities.College;
import  com.tns.placement.entities.Placement;

public interface IPlacementRepository {
	public Placement addPlacement(Placement placement);  // C
	public Placement updatePlacement(Placement placement); // U
	public Placement searchPlacement(int id); // R
	public Placement deletePlacement(Placement placement); // D
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
