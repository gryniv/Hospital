package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

import static com.hospital.entities.drugs.Medicament.Aspirin;
import static com.hospital.entities.drugs.Medicament.Paracetamol;

public class Fever extends HealthState {

    @Override
    public void changeState(Patients patient) {
        if(days>=40 && (medicament.contains(Paracetamol) || medicament.contains(Aspirin))){
            patient.setHealthState(new Healthy());
        }
        checkParacetamolPlusAspirin(patient);
    }

}
