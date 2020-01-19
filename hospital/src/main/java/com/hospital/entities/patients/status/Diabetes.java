package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.Insulin;

public class Diabetes extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && !medicament.contains(Insulin)) {
            patient.setHealthState(new Dead());
        }
        checkParacetamolPlusAspirin(patient);
    }
}
