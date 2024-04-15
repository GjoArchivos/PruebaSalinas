package com.proyecto.dominio.service;

import java.util.List;

import com.proyecto.dominio.entity.Empleados;

// creo la interfaz Empleado Service que voy a usar
public interface EmpleadosService {
	
	//creo los metodos a usar, los cuales seran usados por el controller
		public List <Empleados> findAll();
		public Empleados findById(long id);
		public Empleados save(Empleados empleado);
		public void Delete(Long id);

}
