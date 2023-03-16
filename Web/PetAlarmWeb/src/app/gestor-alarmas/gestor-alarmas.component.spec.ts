import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestorAlarmasComponent } from './gestor-alarmas.component';

describe('GestorAlarmasComponent', () => {
  let component: GestorAlarmasComponent;
  let fixture: ComponentFixture<GestorAlarmasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestorAlarmasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GestorAlarmasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
