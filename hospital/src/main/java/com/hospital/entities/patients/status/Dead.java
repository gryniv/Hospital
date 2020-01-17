package com.hospital.entities.patients.status;

import com.hospital.entities.patients.Patients;

public class Dead extends HealthState {

    @Override
    public void changeState(Patients patient) {
        patient.setHealthState(this);
    }
}
