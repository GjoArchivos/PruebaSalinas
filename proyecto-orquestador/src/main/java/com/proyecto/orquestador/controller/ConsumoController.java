package com.proyecto.orquestador.controller;

import java.io.Closeable;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.apache.tomcat.util.json.JSONParser;
import org.hibernate.cache.spi.support.CollectionReadOnlyAccess;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
import org.springframework.web.client.RestTemplate;

import com.proyecto.orquestador.entity.Consumo;
import com.proyecto.orquestador.service.ConsumoService;

@CrossOrigin(origins= {"http://localhost:4200"} )
@RestController
@RequestMapping("/consumo")
public class ConsumoController {
	@Autowired
	private ConsumoService consumoService;
	
	@GetMapping("/lista")
	public StringBuilder index(){
		try {
			URL url =  new URL("http://localhost:8082/api/empleados"); 
			
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			
			Integer respuesta = conn.getResponseCode();
			
			if(respuesta != 200) {
				throw new RuntimeException("codigo de respues: " + respuesta);
			}else {
				StringBuilder infoCadena = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());
				
				while(scanner.hasNext()) {
					infoCadena.append(scanner.nextLine());
				}
				
				scanner.close();
				
				return infoCadena;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	        
	    
		//return consumoService.findAll();
	}
	
	@GetMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Consumo show(@PathVariable Long id) {
		
		http://localhost:8082/api/empleados
		return consumoService.findById(id);
	}
	
	@PostMapping("empleado")
	@ResponseStatus(HttpStatus.CREATED)
	public Consumo create(@RequestBody Consumo consumo) {
		//cliente.setCreateAt(new Date());
		return consumoService.save(consumo);
	}
	
	@PutMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Consumo  update(@RequestBody Consumo consumo, @PathVariable Long id) {
		Consumo consumirDato = consumoService.findById(id);
		
		consumirDato.setPrimerNombre(consumo.getPrimerNombre());
		consumirDato.setSegundoNombre(consumo.getSegundoNombre());
		consumirDato.setApellidoPaterno(consumo.getApellidoPaterno());
		consumirDato.setApellidoMaterno(consumo.getApellidoMaterno());
		consumirDato.setEdad(consumo.getEdad());
		consumirDato.setSexo(consumo.getSexo());
		consumirDato.setFechaNacimiento(consumo.getFechaNacimiento());
		consumirDato.setPuesto(consumo.getPuesto());
		
		return consumoService.save(consumirDato);
	}
	
	@DeleteMapping("/empleado/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		consumoService.Delete(id);
	}

}
