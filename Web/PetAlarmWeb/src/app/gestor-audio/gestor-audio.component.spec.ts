/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { GestorAudioComponent } from './gestor-audio.component';

describe('GestorAudioComponent', () => {
  let component: GestorAudioComponent;
  let fixture: ComponentFixture<GestorAudioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GestorAudioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GestorAudioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
