package com.hospital.factory;


import com.hospital.entity.Patient;
import com.hospital.exception.UnknownHealthConditionException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.hospital.constant.QuarantineConstants.*;
import static com.hospital.entity.HealthCondition.*;


public class PatientFactory {

    private final static Logger LOG = LogManager.getLogger(PatientFactory.class);

    public PatientFactory() {
    }

    public static Patient getPatient(String patientCondition) throws UnknownHealthConditionException {
        switch (patientCondition) {
            case F:
                LOG.info("New Fever patient is come.");
                return new Patient(FEVER);
            case D:
                LOG.info("New Diabetes patient is come.");
                return new Patient(DIABETES);
            case T:
                LOG.info("New Tuberculosis patient is come.");
                return new Patient(TUBERCULOSIS);
            case H:
                LOG.info("New health patient is come.");
                return new Patient(HEALTHY);
            case X:
                throw new UnknownHealthConditionException("New patient arrived already dead.");
            default:
                throw new UnknownHealthConditionException("Patient with unknown health condition is come.");
        }
    }
}
