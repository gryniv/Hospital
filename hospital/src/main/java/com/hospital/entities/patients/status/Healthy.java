package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.Antibiotic;
import static com.hospital.entities.drugs.Medicament.Insulin;

public class Healthy extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && medicament.contains(Antibiotic) && medicament.contains(Insulin)) {
            patient.setHealthState(new Fever());
        }
        checkParacetamolPlusAspirin(patient);
    }

}
