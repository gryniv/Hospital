package com.hospital.strategy;

import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;

public class Dead implements StateStrategy {

    @Override
    public void useDrugs(Patient patient) {
        patient.setHealthState(HealthCondition.DIED);
    }
}
