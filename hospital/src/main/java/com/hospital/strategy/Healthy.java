package com.hospital.strategy;


import com.hospital.entities.patients.patients.Patient;

import static com.hospital.entities.patients.drugs.Medicament.PARACETAMOL;
import static com.hospital.entities.patients.drugs.Medicament.ANTIBIOTIC;
import static com.hospital.entities.patients.drugs.Medicament.INSULIN;
import static com.hospital.entities.patients.drugs.Medicament.ASPIRIN;

public class Healthy extends HealthState {

    @Override
    public void changeState(Patient patient) {
        if (days >= 40 && medicament.contains(ANTIBIOTIC) && medicament.contains(INSULIN)) {
            patient.setHealthState(new Fever());
        } else if (medicament.contains(ASPIRIN) && medicament.contains(PARACETAMOL)) {
            patient.setHealthState(new Dead());
        }
    }

}
