import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GestorActividadesComponent } from './gestor-actividades/gestor-actividades.component';
import { CrearAlarmaComponent } from './crear-alarma/crear-alarma.component';
import { GestorAlarmasComponent } from './gestor-alarmas/gestor-alarmas.component';
import { GestorAudioComponent } from './gestor-audio/gestor-audio.component';
import { GestorIotComponent } from './gestor-iot/gestor-iot.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [

  {
    path: '',
    component: LoginComponent,
    pathMatch: 'full'
  },

  {
    path: 'gestoralarmas',
    component: GestorAlarmasComponent,

  },
  {
    path: 'gestoriot',
    component: GestorIotComponent,

  },
  {
    path: 'gestoractividades',
    component: GestorActividadesComponent,

  },
  {
    path: 'gestoraudios',
    component: GestorAudioComponent,

  },

  {
    path: 'crearalarma',
    component: CrearAlarmaComponent,

  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
