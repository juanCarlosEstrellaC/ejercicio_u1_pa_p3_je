package com.example.demo.carro.service;

import com.example.demo.carro.modelo.Matricula;

public interface IMatriculaService {

	public void matriculacion(String cedula, String placa);
	
	public Matricula buscar(String id);
	public void borrar(String id);
	public void actualizar(Matricula matri);
	public void ingresar(Matricula matri);
	
}
