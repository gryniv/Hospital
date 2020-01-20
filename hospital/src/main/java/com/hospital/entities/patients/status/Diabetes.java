package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.INSULIN;
import static com.hospital.entities.drugs.Medicament.ASPIRIN;
import static com.hospital.entities.drugs.Medicament.PARACETAMOL;

public class Diabetes extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && !medicament.contains(INSULIN)) {
            patient.setHealthState(new Dead());
        } else if (medicament.contains(ASPIRIN) && medicament.contains(PARACETAMOL)) {
            patient.setHealthState(new Dead());
        }
    }
}
