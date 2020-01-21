package com.hospital.strategy;

import com.hospital.entities.patients.patients.Patient;

public class Dead extends HealthState {

    @Override
    public void changeState(Patient patient) {
        patient.setHealthState(this);
    }
}
