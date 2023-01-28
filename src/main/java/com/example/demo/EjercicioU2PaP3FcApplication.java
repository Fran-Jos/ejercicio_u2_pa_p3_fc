package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Cliente;

import com.example.demo.modelo.Renta;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;

@SpringBootApplication
public class EjercicioU2PaP3FcApplication implements CommandLineRunner{

	@Autowired
	private IRentaService iRentaService;
	
	@Autowired
	private IAutomovilService automovilService;
	@Autowired
	private IClienteService clienteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU2PaP3FcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Automovil automovil1= new Automovil();
		automovil1.setPlaca("psu-643");
		automovil1.setValorDia(new BigDecimal(25));
		
		Cliente cliente = new Cliente();
		cliente.setCedula("1232321");
		cliente.setNombre("Gabriela");
		
		//Pago pago = new Pago();
		
		
		Renta renta = new Renta();
		renta.setAutomovil(automovil1);
		renta.setCliente(cliente);
		renta.setFecha(LocalDateTime.now());
		renta.setNumDias(3);
		renta.setValor(new BigDecimal(123));
		
		List<Renta>r1 = new ArrayList<>();
		
		r1.add(renta);
		
		automovil1.setRentas(r1);
		cliente.setRentas(r1);
		
		this.iRentaService.rentar(renta);
		
//		Automovil automovilN= this.automovilService.buscar("psu-643");
//		Cliente clienteN = this.clienteService.buscar("1232321");
//		
		
		
	}

}
