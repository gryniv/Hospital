package com.hospital.strategy;


import com.hospital.entities.drugs.Drug;
import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;

import java.util.List;

import static com.hospital.entities.drugs.Drug.ASPIRIN;
import static com.hospital.entities.drugs.Drug.PARACETAMOL;

public class Fever implements StateStrategy {

    @Override
    public void useDrugs(Patient patient) {
        final int days = patient.getDays();
        final List<Drug> drugs = patient.getDrugs();
        if (days >= 40 && (drugs.contains(PARACETAMOL) || drugs.contains(ASPIRIN))) {
            patient.setHealthCondition(HealthCondition.HEALTHY);
        } else if (drugs.contains(ASPIRIN) && drugs.contains(PARACETAMOL)) {
            patient.setHealthCondition(HealthCondition.DIED);
        }
    }

}
