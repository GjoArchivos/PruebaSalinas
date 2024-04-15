package com.proyecto.dominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dominio.entity.Empleados;
import com.proyecto.dominio.service.EmpleadosService;


//creo el controller y le especifico la anotacion @RestController para especificar que estoy creando un servicio REST
//@CrossOrigin para especificar  el dominio desde que aceptara datos, en este caso el 4200 es comunmente usado en angular, en este caso no es necesario pero igual queda bonito XD

@CrossOrigin(origins= {"http://localhost:4200"} )
@RestController
@RequestMapping("/api")
public class EmpleadosController {
	
	// especifico el servicio que sera sobre escrito para la inyeccion
	@Autowired
	private EmpleadosService empleadosService;
	
	// uso @GetMapping para especificar la direccion en este caso seria "http://localhost:4200/api/empleados"
	@GetMapping("/empleados")
	public List<Empleados> index(){
		return empleadosService.findAll();
	}
	
	// ejeplo de la id 1. la direccion en este caso seria "http://localhost:4200/api/empleados/1"
	//@ResponseStatus para tener la respuesta que se pudo encontrar la peticion en este caso 200
	@GetMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Empleados show(@PathVariable Long id) {
		return empleadosService.findById(id);
	}
	
	// aqui se crea un nuevo usuario. la direccion en este caso seria "http://localhost:4200/api/empleado" mas los datos que se envian
	//@ResponseStatus para tener la respuesta que se pudo encontrar la peticion en este caso 201 Created
	@PostMapping("empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleados create(@RequestBody Empleados empleados) {
		//cliente.setCreateAt(new Date());
		return empleadosService.save(empleados);
	}
	
	// aqui se actualiza un usuario. la direccion en este caso seria "http://localhost:4200/api/empleado/id" mas los datos que se envian
		//@ResponseStatus la respuesta aqui tambien es 201 Created
	@PutMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Empleados  update(@RequestBody Empleados empleados, @PathVariable Long id) {
		Empleados actualizarEmpleado = empleadosService.findById(id);
		
		actualizarEmpleado.setPrimerNombre(empleados.getPrimerNombre());
		actualizarEmpleado.setSegundoNombre(empleados.getSegundoNombre());
		actualizarEmpleado.setApellidoPaterno(empleados.getApellidoPaterno());
		actualizarEmpleado.setApellidoMaterno(empleados.getApellidoMaterno());
		actualizarEmpleado.setEdad(empleados.getEdad());
		actualizarEmpleado.setSexo(empleados.getSexo());
		actualizarEmpleado.setFechaNacimiento(empleados.getFechaNacimiento());
		actualizarEmpleado.setPuesto(empleados.getPuesto());
		
		return empleadosService.save(actualizarEmpleado);
	}
	
	// aqui se borra un usuario. la direccion en este caso seria "http://localhost:4200/api/empleado/id"
	//@ResponseStatus la respuesta aqui tambien es 200 para confirmar la transaccion exitosa
	@DeleteMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		empleadosService.Delete(id);
	}
	
	
	
	

}