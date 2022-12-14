package com.example.demo.carro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.carro.modelo.Vehiculo;
import com.example.demo.carro.repository.IVehiculoRepository;

@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	
	@Override
	public Vehiculo buscar(String id) {
		return this.iVehiculoRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.iVehiculoRepository.borrar(id);
	}

	@Override
	public void actualizar(Vehiculo vehi) {
		this.iVehiculoRepository.actualizar(vehi);
	}

	@Override
	public void ingresar(Vehiculo vehi) {
		this.iVehiculoRepository.ingresar(vehi);
	}

}
