package com.proyecto.orquestador.service;

import java.util.List;

import com.proyecto.orquestador.entity.Consumo;

public interface ConsumoService {

	public List <Consumo> findAll();
	public Consumo findById(long id);
	public Consumo save(Consumo consumo);
	public void Delete(Long id);
}
