package com.example.demo.carro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.carro.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	private static List<Propietario> baseDatos = new ArrayList<>();
	
	
	@Override
	public Propietario buscar(String id) {
		Propietario miPropietario = null;
		for (Propietario propietario : baseDatos) {
			if (propietario.getCedula().equals(id)) {
				miPropietario = propietario;
			}
		}
		return miPropietario;
	}

	@Override
	public void borrar(String id) {
		baseDatos.remove(buscar(id));
	}

	@Override
	public void actualizar(Propietario prop) {
		Propietario miPropietario = null;
		for (Propietario propietario : baseDatos) {
			if (propietario.getCedula().equals(prop.getCedula())) {
				miPropietario = propietario;
			}
		}
		baseDatos.remove(miPropietario);
		baseDatos.add(prop);
		System.out.println("Se actualizo "+prop );
	}

	@Override
	public void ingresar(Propietario prop) {
		baseDatos.add(prop);
	}

	
}
