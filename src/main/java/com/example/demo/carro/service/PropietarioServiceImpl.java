package com.example.demo.carro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.carro.modelo.Propietario;
import com.example.demo.carro.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	
	
	@Override
	public Propietario buscar(String id) {
		return this.iPropietarioRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.iPropietarioRepository.borrar(id);
	}

	@Override
	public void actualizar(Propietario prop) {
		this.iPropietarioRepository.actualizar(prop);
	}

	@Override
	public void ingresar(Propietario prop) {
		this.iPropietarioRepository.ingresar(prop);
	}

}
