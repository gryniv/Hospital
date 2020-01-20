package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.ANTIBIOTIC;

public class Tuberculosis extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && medicament.contains(ANTIBIOTIC)) {
            patient.setHealthState(new Healthy());
        }
        checkParacetamolPlusAspirin(patient);
    }

}
