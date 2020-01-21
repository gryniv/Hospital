package com.hospital.strategy;


import com.hospital.entities.drugs.Drug;
import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;
import com.hospital.factory.StateFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

import static com.hospital.entities.drugs.Drug.PARACETAMOL;
import static com.hospital.entities.drugs.Drug.ANTIBIOTIC;
import static com.hospital.entities.drugs.Drug.INSULIN;
import static com.hospital.entities.drugs.Drug.ASPIRIN;

public class Healthy implements StateStrategy {
    private final static Logger LOG = LogManager.getLogger(StateFactory.class);
    @Override
    public void useDrugs(Patient patient) {
        final int days = patient.getDays();
        final List<Drug> drugs = patient.getDrugs();
        if ((days >= 40 && drugs.contains(ANTIBIOTIC) && drugs.contains(INSULIN))) {
            LOG.info("[!] {} patient now - is Fever.", patient.getName());
            patient.setHealthCondition(HealthCondition.FEVER);
        } else if (drugs.contains(ASPIRIN) && drugs.contains(PARACETAMOL)) {
            LOG.info("[X] {} patient now - is Died.", patient.getName());
            patient.setHealthCondition(HealthCondition.DIED);
        } else {
            LOG.info("[+] {} patient is Healthy.", patient.getName());
        }
    }

}
