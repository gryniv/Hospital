package com.hospital.strategy;

import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;
import com.hospital.factory.StateFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dead implements StateStrategy {

    private final static Logger LOG = LogManager.getLogger(StateFactory.class);

    @Override
    public void useDrugs(Patient patient) {
        LOG.info("[X] {} the patient arrived dead. Drugs won't help anymore.", patient.getName());
        patient.setHealthState(HealthCondition.DIED);
    }
}
