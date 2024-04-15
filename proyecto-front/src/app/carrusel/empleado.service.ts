import { Injectable } from '@angular/core';
import { Empleados } from './empleados';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmpleadoService {

  // este endpoint llama a dominio, lo use para pruebas
  // ya no pude hacer que el orquesrtador funcionara por eso lo deje conectado directo a dominio
  private miEndPoint:string= 'http://localhost:8082/api/empleados';
  // este endpoint es de orquestador  no logre que funcionara
  //private miEndPoint:string= 'http://localhost:8081/consumo/lista';
  
  constructor( private http: HttpClient) { }

  //getEmpleados(): Observable<Empleados[]>{
  //  return this.http.get<Empleados[]>(this.miEndPoint)
  //}
  getEmpleados(): Observable<Empleados[]>{
    return this.http.get(this.miEndPoint).pipe(
      map(response => response as Empleados[])
    );
  }


 
  

}
