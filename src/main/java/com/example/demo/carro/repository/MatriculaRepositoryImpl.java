package com.example.demo.carro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.carro.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	private static List<Matricula> baseDatos = new ArrayList<>();
	
	
	@Override
	public Matricula buscar(String id) {
		Matricula miMatricula = null;
		for (Matricula matricula : baseDatos) {
			if (matricula.getId().equals(id)) {
				miMatricula = matricula;
			}
		}
		return miMatricula;
	}

	@Override
	public void borrar(String id) {
		baseDatos.remove(buscar(id));
	}

	@Override
	public void actualizar(Matricula matri) {
		Matricula miMatricula = null;
		for (Matricula matricula : baseDatos) {
			if (matricula.getId().equals(matri.getId())) {
				miMatricula = matricula;
			}
		}
		baseDatos.remove(miMatricula);
		baseDatos.add(matri);
		System.out.println("Se actualizo "+matri );
	}

	@Override
	public void ingresar(Matricula matri) {
		baseDatos.add(matri);
	}

	
}
