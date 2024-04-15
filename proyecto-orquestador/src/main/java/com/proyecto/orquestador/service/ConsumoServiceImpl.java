package com.proyecto.orquestador.service;

import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto.orquestador.dao.ConsumoDao;
import com.proyecto.orquestador.entity.Consumo;
@Service
public class ConsumoServiceImpl implements ConsumoService{

		@Autowired
		private ConsumoDao consumoDao;
		
		@Override
		@Transactional(readOnly = true)
		public List<Consumo> findAll() {
			return (List<Consumo>) consumoDao.findAll();
			
		}

		@Override
		@Transactional(readOnly = true)
		public Consumo findById(long id) {
			return consumoDao.findById(id).orElse(null);
		}

		@Override
		@Transactional
		public Consumo save(Consumo consumo) {
			return consumoDao.save(consumo);
		}

		@Override
		@Transactional
		public void Delete(Long id) {
			consumoDao.deleteById(id);
			
		}
}
