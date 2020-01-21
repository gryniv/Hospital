package com.hospital.factory;


import com.hospital.entities.patients.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hospital.constant.QuarantineConstants.*;
import static com.hospital.entities.patients.status.HealthCondition.TUBERCULOSIS;
import static com.hospital.entities.patients.status.HealthCondition.HEALTHY;
import static com.hospital.entities.patients.status.HealthCondition.DIABETES;
import static com.hospital.entities.patients.status.HealthCondition.FEVER;


public class PatientFactory {

    private final static Logger LOG = LogManager.getLogger(PatientFactory.class);

    private PatientFactory() {
    }

    public static List<Patient> placing(String input) {
        List<Patient> patients = new ArrayList<>();
        Arrays.stream(input.split(COMMA)).forEach(s -> patients.add(getPatient(s)));
        return patients;
    }

    public static Patient getPatient(String patientCondition) {
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
            default:
                LOG.info("New Healthy patient is come.");
                return new Patient(HEALTHY);
        }
    }
}
