package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository 
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		
		this.entityManager.persist(automovil);
	}

	@Override
	public void actualizar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.merge(automovil);
		
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return 
				this.entityManager.find(Automovil.class, placa)
				;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Automovil automovil = this.buscar(placa);
		
		this.entityManager.remove(automovil);
		
	}

}
