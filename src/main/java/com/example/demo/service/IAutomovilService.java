package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {

	public void agregar(Automovil automovil);
	
	public Automovil buscar(String placa);
	public Automovil buscarP_C(String placa , String cedula);
	
}
