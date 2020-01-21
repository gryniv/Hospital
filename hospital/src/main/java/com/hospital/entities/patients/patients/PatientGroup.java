package com.hospital.entities.patients.patients;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hospital.entities.patients.patients.status.HealthCondition.TUBERCULOSIS;
import static com.hospital.entities.patients.patients.status.HealthCondition.HEALTHY;
import static com.hospital.entities.patients.patients.status.HealthCondition.DIABETES;
import static com.hospital.entities.patients.patients.status.HealthCondition.FEVER;


public class PatientGroup {

    private final static Logger LOG = LogManager.getLogger(PatientGroup.class);
    private final static String COMMA = ",";

    private PatientGroup() {
    }

    public static List<Patient> placing(String input) {
        System.out.println(input);
        List<Patient> patients = new ArrayList<>();
        Arrays.stream(input.split(COMMA)).forEach(s -> patients.add(checkPatientsGroups(s)));
        System.out.println(patients);
        return patients;
    }

    private static Patient checkPatientsGroups(String input) {
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
