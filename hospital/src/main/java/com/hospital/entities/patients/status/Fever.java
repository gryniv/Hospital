package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.ASPIRIN;
import static com.hospital.entities.drugs.Medicament.PARACETAMOL;

public class Fever extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && (medicament.contains(PARACETAMOL) || medicament.contains(ASPIRIN))) {
            patient.setHealthState(new Healthy());
        } else if (medicament.contains(ASPIRIN) && medicament.contains(PARACETAMOL)) {
            patient.setHealthState(new Dead());
        }
    }

}
