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
import static com.hospital.entities.drugs.Drug.ASPIRIN;

public class Tuberculosis implements StateStrategy {
    private final static Logger LOG = LogManager.getLogger(StateFactory.class);

    @Override
    public void useDrugs(Patient patient) {
        final int days = patient.getDays();
        final List<Drug> drugs = patient.getDrugs();
        if (days >= 40 && drugs.contains(ANTIBIOTIC)) {
            LOG.info("[+] {} patient now - is Healthy", patient.getName());
            patient.setHealthCondition(HealthCondition.HEALTHY);
        } else if (drugs.contains(ASPIRIN) && drugs.contains(PARACETAMOL)) {
            LOG.info("[X] {} patient now - is Died", patient.getName());
            patient.setHealthCondition(HealthCondition.DIED);
        } else {
            LOG.info("[-] {} patient is still sick", patient.getName());
        }
    }

}
