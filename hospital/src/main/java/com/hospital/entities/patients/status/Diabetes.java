package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.INSULIN;

public class Diabetes extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && !medicament.contains(INSULIN)) {
            patient.setHealthState(new Dead());
        }
        checkParacetamolPlusAspirin(patient);
    }
}
