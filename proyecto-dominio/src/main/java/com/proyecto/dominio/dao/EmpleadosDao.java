package com.proyecto.dominio.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.dominio.entity.Empleados;


//creo el Dao y ya que le agrego la extencion de CrudRepository no tengo que especificar
public interface EmpleadosDao extends CrudRepository<Empleados, Long>{

}
