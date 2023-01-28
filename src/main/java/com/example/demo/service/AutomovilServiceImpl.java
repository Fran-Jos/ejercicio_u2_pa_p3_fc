package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscar(String placa) {
		// TODO Auto-generated method stub
		return 
				
				this.automovilRepo.buscar(placa);
	}

	@Override
	public Automovil buscarP_C(String placa, String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

}
