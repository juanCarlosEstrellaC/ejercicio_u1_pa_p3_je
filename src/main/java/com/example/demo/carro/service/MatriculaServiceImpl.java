package com.example.demo.carro.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.carro.modelo.Matricula;
import com.example.demo.carro.modelo.Propietario;
import com.example.demo.carro.modelo.Vehiculo;
import com.example.demo.carro.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Override
	public void matriculacion(String cedula, String placa) {
		//Logica del negocio:
		Propietario miPropietario = this.iPropietarioService.buscar(cedula);
		Vehiculo miVehiculo = this.iVehiculoService.buscar(placa);
		
		Matricula matricu = new Matricula();
		matricu.setFechaMatricula(LocalDateTime.now());
		matricu.setPropietario(miPropietario);
		matricu.setVehiculo(miVehiculo);
		matricu.setId("123");
		
		if (miVehiculo.getTipo().equals("liviano")) {
			BigDecimal valor = new BigDecimal(0.10);
			matricu.setValorMatricula(miVehiculo.getPrecio().multiply(valor));
		} else { // cuando sea "pesado"
			BigDecimal valor = new BigDecimal(0.15);
			matricu.setValorMatricula(miVehiculo.getPrecio().multiply(valor));
		}
		
		BigDecimal valor2 = new BigDecimal(2000);
		if (matricu.getValorMatricula().compareTo(valor2) == 1) {
			BigDecimal descuento = new BigDecimal(0.07);

			matricu.setValorMatricula(matricu.getValorMatricula().subtract(matricu.getValorMatricula().multiply(descuento)));

		}
		
		this.iMatriculaRepository.ingresar(matricu);
		System.out.println(matricu);
		
		
	}
	
	
	@Override
	public Matricula buscar(String id) {
		return this.iMatriculaRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.iMatriculaRepository.borrar(id);
	}

	@Override
	public void actualizar(Matricula matri) {
		this.iMatriculaRepository.actualizar(matri);
	}

	@Override
	public void ingresar(Matricula matri) {
		this.iMatriculaRepository.ingresar(matri);
	}



}
