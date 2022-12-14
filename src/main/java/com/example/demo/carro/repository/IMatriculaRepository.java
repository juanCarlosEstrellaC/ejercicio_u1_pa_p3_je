package com.example.demo.carro.repository;

import com.example.demo.carro.modelo.Matricula;

public interface IMatriculaRepository {

	public Matricula buscar(String id);
	public void borrar(String id);
	public void actualizar(Matricula matri);
	public void ingresar(Matricula matri);
	
}
