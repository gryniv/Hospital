package com.hospital.entities.patients;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hospital.entities.patients.status.HealthCondition.TUBERCULOSIS;
import static com.hospital.entities.patients.status.HealthCondition.HEALTHY;
import static com.hospital.entities.patients.status.HealthCondition.DIABETES;
import static com.hospital.entities.patients.status.HealthCondition.FEVER;


public class PatientGroup {

    private static final Logger LOG = LogManager.getLogger(PatientCounter.class);

    private PatientGroup() {
    }

    public static List<Patients> placing(String input) {
        List<Patients> patients = new ArrayList<>();
        Arrays.stream(input.split(",")).forEach(s -> patients.add(checkPatientsGroups(s)) );
        return patients;
    }

    private static Patients checkPatientsGroups(String input) {
        switch (input.toCharArray()[0]) {
            case 'F':
                LOG.info("New Fever patient is come.");
                return FEVER.addPatient();
            case 'D':
                LOG.info("New Diabetes patient is come.");
                return DIABETES.addPatient();
            case 'T':
                LOG.info("New Tuberculosis patient is come.");
                return TUBERCULOSIS.addPatient();
            default:
                LOG.info("New Healthy patient is come.");
                return HEALTHY.addPatient();
        }
    }
}
