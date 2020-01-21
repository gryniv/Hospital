package com.hospital.strategy;


import com.hospital.entities.drugs.Drug;
import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;

import java.util.List;

import static com.hospital.entities.drugs.Drug.INSULIN;
import static com.hospital.entities.drugs.Drug.ASPIRIN;
import static com.hospital.entities.drugs.Drug.PARACETAMOL;

public class Diabetes implements StateStrategy {

    @Override
    public void useDrugs(Patient patient) {
        final int days = patient.getDays();
        final List<Drug> drugs = patient.getDrugs();
        if ((days >= 40 && !drugs.contains(INSULIN)) || drugs.contains(ASPIRIN) && drugs.contains(PARACETAMOL)) {
            patient.setHealthState(HealthCondition.DIED);
        }
    }
}
