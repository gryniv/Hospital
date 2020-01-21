package com.hospital.strategy;


import com.hospital.entities.drugs.Drug;
import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;

import java.util.List;

import static com.hospital.entities.drugs.Drug.PARACETAMOL;
import static com.hospital.entities.drugs.Drug.ANTIBIOTIC;
import static com.hospital.entities.drugs.Drug.INSULIN;
import static com.hospital.entities.drugs.Drug.ASPIRIN;

public class Healthy implements StateStrategy {

    @Override
    public void useDrugs(Patient patient) {
        final int days = patient.getDays();
        final List<Drug> drugs = patient.getDrugs();
        if (days >= 40 && drugs.contains(ANTIBIOTIC) && drugs.contains(INSULIN)) {
            patient.setHealthCondition(HealthCondition.FEVER);
        } else if (drugs.contains(ASPIRIN) && drugs.contains(PARACETAMOL)) {
            patient.setHealthCondition(HealthCondition.DIED);
        }
    }

}
