package com.example.demo.carro.repository;

import com.example.demo.carro.modelo.Vehiculo;

public interface IVehiculoRepository {

	public Vehiculo buscar(String id);
	public void borrar(String id);
	public void actualizar(Vehiculo vehi);
	public void ingresar(Vehiculo vehi);
	
}
