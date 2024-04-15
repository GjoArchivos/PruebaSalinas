package com.proyecto.dominio.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//creo la clase Empleados para mapear los datos de la base de datos
//uso la anotacion @Table mas la especificacion del nombre de la tabla para asegurarse ede usar la tabla correcta
@Entity
@Table(name="empleados")
public class Empleados implements Serializable{
	
	// se espesifica que esta clase tendra autoincremetable en el ID gracias a la estrategia
	// Anoto la anotacion @ Id para especificar que este dato sera el ID
	// se especifican las columnas con @Column para saber que dato va en que columna de la tabla, si la tabla tiene el mismo nombre que el campo, no se necesita @Column pero es mejor ponerlo por practica
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="primer_nombre")
	private String  primerNombre;
	@Column(name="segundo_nombre")
	private String segundoNombre;
	@Column(name="apellido_paterno")
	private String apellidoPaterno;
	@Column(name="apellido_materno")
	private String apellidoMaterno;
	@Column(name="edad")
	private Integer edad;
	@Column(name="sexo")
	private String sexo;
	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;
	@Column(name="puesto")
	private String puesto;
	
	// creo los constructores que voy a usar, el constructor vacio por defecto, y dos contructores con datos, para usar en el Update y create
	public Empleados() {
		// TODO Auto-generated constructor stub
	}
	public Empleados(Long id, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
			Integer edad, String sexo, String fechaNacimiento, String puesto) {
		super();
		this.id = id;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.puesto = puesto;
	}
	
	
	public Empleados(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
			Integer edad, String sexo, String fechaNacimiento, String puesto) {
		super();
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.puesto = puesto;
	}
	
	// se crean los getter y setter para poder manipular los datos
	public Long getIdInteger() {
		return id;
	}
	public void setIdInteger(Long id) {
		this.id = id;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
