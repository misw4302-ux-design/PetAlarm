import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
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


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
