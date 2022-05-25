package com.tns.placement.service;

import com.tns.placement.entities.Certificate;
import com.tns.placement.entities.Placement;
import com.tns.placement.repository.IPlacementRepository;
import com.tns.placement.repository.IPlacementRepositoryImpl;

public class IPlacementServiceImpl implements IPlacementService {

	IPlacementRepository dao;

	public IPlacementServiceImpl() {
		dao = new IPlacementRepositoryImpl();
	}
	
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		dao.beginTransaction();
		dao.deletePlacement(placement);
		dao.commitTransaction();
			return placement;
		}


}
