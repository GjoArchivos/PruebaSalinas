import { Component, OnInit } from '@angular/core';
import { Empleados } from './empleados';
import { EmpleadoService } from './empleado.service';

@Component({
  selector: 'app-carrusel',
  templateUrl: './carrusel.component.html',
  styleUrls: ['./carrusel.component.css']
})
export class CarruselComponent implements OnInit{
  
  empleados: Empleados[] = [];

  constructor(private empleadoService: EmpleadoService){

  }

  ngOnInit(){
    this.empleadoService.getEmpleados().subscribe(
      empleados => this.empleados = empleados  
    );
    
  }

 // empleados: Empleados[]= [
  //  {id: 1, primerNombre: "uno", segundoNombre: "", apellidoPaterno: "String", apellidoMaterno: "String", edad: 21, sexo: "String", fechaNacimiento: "12-12-1012", puesto :"gerente"},
  //  {id: 2, primerNombre: "dos", segundoNombre: "", apellidoPaterno: "String", apellidoMaterno: "String", edad: 21, sexo: "String", fechaNacimiento: "12-12-1012", puesto :"programador"}
 // ] 

  
}
