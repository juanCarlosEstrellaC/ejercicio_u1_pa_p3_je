package com.example.demo.carro.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.carro.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	private static List<Vehiculo> baseDatos = new ArrayList<Vehiculo>();
	
	
	@Override
	public Vehiculo buscar(String id) {
		Vehiculo miVehiculo = null;
		for (Vehiculo vehiculo : baseDatos) {
			if (vehiculo.getPlaca().equals(id)) {
				miVehiculo = vehiculo;
			}
		}
		return miVehiculo;
	}

	@Override
	public void borrar(String id) {
		baseDatos.remove(buscar(id));
	}

	@Override
	public void actualizar(Vehiculo vehi) {
		Vehiculo miVehiculo = null;
		for (Vehiculo vehiculo : baseDatos) {
			if (vehiculo.getPlaca().equals(vehi.getPlaca())) {
				miVehiculo = vehiculo;
			}
		}
		baseDatos.remove(miVehiculo);
		baseDatos.add(vehi);
		System.out.println("Se actualizo "+vehi );
	}

	@Override
	public void ingresar(Vehiculo vehi) {
		baseDatos.add(vehi);
	}

	
	
}
