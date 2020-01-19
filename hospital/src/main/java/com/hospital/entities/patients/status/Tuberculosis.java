package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.Antibiotic;

public class Tuberculosis extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && medicament.contains(Antibiotic)) {
            patient.setHealthState(new Healthy());
        }
        checkParacetamolPlusAspirin(patient);
    }

}
