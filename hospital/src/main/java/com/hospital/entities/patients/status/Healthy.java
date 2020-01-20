package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.ANTIBIOTIC;
import static com.hospital.entities.drugs.Medicament.INSULIN;

public class Healthy extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && medicament.contains(ANTIBIOTIC) && medicament.contains(INSULIN)) {
            patient.setHealthState(new Fever());
        }
        checkParacetamolPlusAspirin(patient);
    }

}
