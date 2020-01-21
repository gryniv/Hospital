package com.hospital.strategy;


import com.hospital.entities.patients.patients.Patient;

import static com.hospital.entities.patients.drugs.Medicament.INSULIN;
import static com.hospital.entities.patients.drugs.Medicament.ASPIRIN;
import static com.hospital.entities.patients.drugs.Medicament.PARACETAMOL;

public class Diabetes extends HealthState {

    @Override
    public void changeState(Patient patient) {
        if ((days >= 40 && !medicament.contains(INSULIN)) || medicament.contains(ASPIRIN) && medicament.contains(PARACETAMOL)) {
            patient.setHealthState(new Dead());
        }
    }
}
