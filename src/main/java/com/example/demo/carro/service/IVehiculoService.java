package com.example.demo.carro.service;

import com.example.demo.carro.modelo.Vehiculo;

public interface IVehiculoService {

	public Vehiculo buscar(String id);
	public void borrar(String id);
	public void actualizar(Vehiculo vehi);
	public void ingresar(Vehiculo vehi);
	
}
