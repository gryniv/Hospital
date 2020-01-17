package com.hospital.entities.patients.status;


import com.hospital.entities.drugs.Medicament;
import com.hospital.entities.patients.Patients;

public class Tuberculosis extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if (days >= 40 && medicament.contains(Medicament.Antibiotic)) {
            patient.setHealthState(new Healthy());
        }
        checkParacetamolPlusAspirin(patient);
    }

}
