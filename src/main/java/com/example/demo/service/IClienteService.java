package com.example.demo.service;


import com.example.demo.modelo.Cliente;

public interface IClienteService {
	
public void agregar(Cliente cliente);
	
	public Cliente buscar(String cedula);
	public Cliente buscarC_p( String cedula,String placa );
	

}
