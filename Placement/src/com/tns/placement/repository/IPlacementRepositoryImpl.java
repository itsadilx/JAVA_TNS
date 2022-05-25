package com.tns.placement.repository;

import javax.persistence.EntityManager;

import com.tns.placement.entities.Certificate;
import  com.tns.placement.entities.Placement;

public class IPlacementRepositoryImpl implements IPlacementRepository {

	private EntityManager entityManager;
	
	public IPlacementRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		entityManager.remove(placement);
		return placement;
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
}
