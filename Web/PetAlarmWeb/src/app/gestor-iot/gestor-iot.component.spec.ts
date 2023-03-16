/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { GestorIotComponent } from './gestor-iot.component';

describe('GestorIotComponent', () => {
  let component: GestorIotComponent;
  let fixture: ComponentFixture<GestorIotComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GestorIotComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GestorIotComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
