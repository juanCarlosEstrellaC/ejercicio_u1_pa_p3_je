package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.carro.modelo.Propietario;
import com.example.demo.carro.modelo.Vehiculo;
import com.example.demo.carro.service.IMatriculaService;
import com.example.demo.carro.service.IPropietarioService;
import com.example.demo.carro.service.IVehiculoService;

@SpringBootApplication
public class EjercicioU1PaP3JeApplication implements CommandLineRunner{

	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3JeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Propietario propietario1 = new Propietario();
		propietario1.setNombre("Carlos");
		propietario1.setApellido("Caizer");
		propietario1.setCedula("145685482");
		propietario1.setFechaNacimiento(LocalDateTime.of(1984, 2, 15, 0, 0));
		
		this.iPropietarioService.ingresar(propietario1);
		System.out.println(propietario1);
		
		
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("Ford");
		vehiculo1.setPlaca("PDB 5865");
		vehiculo1.setPrecio(new BigDecimal(15487));
		vehiculo1.setTipo("liviano");
		
		this.iVehiculoService.ingresar(vehiculo1);
		System.out.println(vehiculo1);

		vehiculo1.setMarca("Chevy");
		vehiculo1.setPlaca("P 45");
		this.iVehiculoService.actualizar(vehiculo1);
		
		this.iMatriculaService.matriculacion(propietario1.getCedula(), vehiculo1.getPlaca());
	}

}
