package com.hospital.entities.patients;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hospital.entities.patients.status.HealthCondition.Tuberculosis;
import static com.hospital.entities.patients.status.HealthCondition.Healthy;
import static com.hospital.entities.patients.status.HealthCondition.Diabetes;
import static com.hospital.entities.patients.status.HealthCondition.Fever;


public class PatientGroup {

    public static List<Patients> placing(String input) {
        List<Patients> patients = new ArrayList<>();
        Arrays.stream(input.split(",")).forEach(s -> patients.add(checkPatientsGroups(s)));
        return patients;
    }

    private static Patients checkPatientsGroups(String input) {
        switch (input.toCharArray()[0]) {
            case 'F':
                return Fever.addPatient();
            case 'D':
                return Diabetes.addPatient();
            case 'T':
                return Tuberculosis.addPatient();
            default:
                return Healthy.addPatient();
        }
    }
}
