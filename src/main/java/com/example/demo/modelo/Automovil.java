package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "automovil")
public class Automovil {

@Id
@Column(name = "aut_placa")	
private String placa;

@Column(name = "aut_valorDia")	
private BigDecimal ValorDia;

@OneToMany(mappedBy = "automovil" , cascade = CascadeType.ALL)
private List<Renta> rentas;



public List<Renta> getRentas() {
	return rentas;
}

public void setRentas(List<Renta> rentas) {
	this.rentas = rentas;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public BigDecimal getValorDia() {
	return ValorDia;
}

public void setValorDia(BigDecimal valorDia) {
	ValorDia = valorDia;
}


	
}
