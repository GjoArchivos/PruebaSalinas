import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CarruselComponent } from './carrusel/carrusel.component';
import { FooterComponent } from './footer/footer.component';
import { EmpleadoService } from './carrusel/empleado.service';
import { FeacturesComponent } from './feactures/feactures.component';
import { PricingComponent } from './pricing/pricing.component';
import { RouterModule, Routes } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';


const routes: Routes=[
  //pagina default
  {path: '', redirectTo:'/carrusel',pathMatch:'full'},
  //links para las paginas
  {path: 'carrusel', component: CarruselComponent},
  {path: 'features', component: FeacturesComponent},
  {path: 'pricing', component: PricingComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CarruselComponent,
    FooterComponent,
    FeacturesComponent,
    PricingComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [EmpleadoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
