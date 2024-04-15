package com.proyecto.dominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.dominio.dao.EmpleadosDao;
import com.proyecto.dominio.entity.Empleados;


//creo la clase EmpleadosServiceImpl y le especifico el @Services para especificar la capa servicio
@Service
public class EmpleadosServiceImpl implements EmpleadosService{
	
	// uso la anotacion @Autowired para especificar que usaremos EmpleadosDao para inyectarlo en nuestro metodos
	@Autowired
	private EmpleadosDao empleadosDao;
	
	
	// creo los metodos que se podran sobre escribir para poder usarlos despues
	// uso la anotacion @Transactional para especificar que la tranzacion es de solo lectura
	@Override
	@Transactional(readOnly = true)
	public List<Empleados> findAll() {
		return (List<Empleados>) empleadosDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empleados findById(long id) {
		return empleadosDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Empleados save(Empleados empleado) {
		return empleadosDao.save(empleado);
	}

	@Override
	@Transactional
	public void Delete(Long id) {
		empleadosDao.deleteById(id);
		
	}

}
