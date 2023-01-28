package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "renta")
public class Renta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ren_seq")
	@SequenceGenerator(name = "ren_seq",sequenceName = "ren_seq",allocationSize = 1)
	@Column(name = "ren_id")
	private Integer id;
	
	@Column(name = "ren_fecha")
	private LocalDateTime fecha;
	
	@Column(name = "ren_numDias")
	private Integer numDias;
	
	@Column(name = "ren_valor")
	private BigDecimal valor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ren_placa_aut")
	private Automovil automovil;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ren_cedula_cli")
	private Cliente cliente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ren_id_pag")
	private Pago pago;
	
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public Integer getNumDias() {
		return numDias;
	}

	public void setNumDias(Integer numDias) {
		this.numDias = numDias;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Automovil getAutomovil() {
		return automovil;
	}

	public void setAutomovil(Automovil automovil) {
		this.automovil = automovil;
	}
	
	
	
}
