package com.hospital.strategy;


import com.hospital.entities.patients.patients.Patient;

import static com.hospital.entities.patients.drugs.Medicament.PARACETAMOL;
import static com.hospital.entities.patients.drugs.Medicament.ANTIBIOTIC;
import static com.hospital.entities.patients.drugs.Medicament.ASPIRIN;

public class Tuberculosis extends HealthState {

    @Override
    public void changeState(Patient patient) {
        if (days >= 40 && medicament.contains(ANTIBIOTIC)) {
            patient.setHealthState(new Healthy());
        } else if (medicament.contains(ASPIRIN) && medicament.contains(PARACETAMOL)) {
            patient.setHealthState(new Dead());
        }
    }

}
