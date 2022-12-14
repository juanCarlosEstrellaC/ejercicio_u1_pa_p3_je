package com.example.demo.carro.repository;

import com.example.demo.carro.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario buscar(String id);
	public void borrar(String id);
	public void actualizar(Propietario prop);
	public void ingresar(Propietario prop);
	
}
