package com.example.demo.carro.service;

import com.example.demo.carro.modelo.Propietario;

public interface IPropietarioService {

	public Propietario buscar(String id);
	public void borrar(String id);
	public void actualizar(Propietario prop);
	public void ingresar(Propietario prop);
	
}
