import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FeacturesComponent } from './feactures.component';

describe('FeacturesComponent', () => {
  let component: FeacturesComponent;
  let fixture: ComponentFixture<FeacturesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FeacturesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FeacturesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
