package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "pag_seq")
	@SequenceGenerator(name = "pag_seq",sequenceName = "pag_seq",allocationSize = 1)
	@Column(name = "pag_id")
	private Integer id;
	
	@Column(name = "pag_numTarjeta")
	private String numTarjeta;
	
	@Column(name = "pag_valor")
	private BigDecimal valor;
	
	@OneToOne
	private Renta renta;
	
	
	
}
