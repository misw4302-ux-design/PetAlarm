import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login.component';
import { GestorAlarmasComponent } from './gestor-alarmas/gestor-alarmas.component';
import { GestorIotComponent } from './gestor-iot/gestor-iot.component';
import { GestorActividadesComponent } from './gestor-actividades/gestor-actividades.component';
import { GestorAudioComponent } from './gestor-audio/gestor-audio.component';
import { CrearAlarmaComponent } from './crear-alarma/crear-alarma.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    GestorAlarmasComponent,
      GestorIotComponent,
      GestorActividadesComponent,
      GestorAudioComponent,
      CrearAlarmaComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
