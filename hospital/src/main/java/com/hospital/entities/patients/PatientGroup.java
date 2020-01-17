package com.hospital.entities.patients;


import com.hospital.entities.patients.status.HealthCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PatientGroup {

    public static List<Patients> placing(String input) {
        List<Patients> patients = new ArrayList<>();
        Arrays.stream(input.split(",")).forEach(s -> patients.add(checkPatientsGroups(s)));
        return patients;
    }

    private static Patients checkPatientsGroups(String input) {
        switch (input.toCharArray()[0]) {
            case 'F':
                return HealthCondition.Fever.addPatient();
            case 'D':
                return HealthCondition.Diabetes.addPatient();
            case 'T':
                return HealthCondition.Tuberculosis.addPatient();
            default:
                return HealthCondition.Healthy.addPatient();
        }
    }
}
