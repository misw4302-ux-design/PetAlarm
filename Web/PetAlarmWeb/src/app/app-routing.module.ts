import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearAlarmaComponent } from './crear-alarma/crear-alarma.component';
import { GestorAlarmasComponent } from './gestor-alarmas/gestor-alarmas.component';
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
    path: 'crearalarma',
    component: CrearAlarmaComponent,

  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
