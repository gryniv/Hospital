package com.hospital.entities.patients;


import com.hospital.entities.patients.status.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PatientCounter {

    private static final String Fever = HealthCondition.Fever.condition;
    private static final String Healthy = HealthCondition.Healthy.condition;
    private static final String Diabetes = HealthCondition.Diabetes.condition;
    private static final String Tuberculosis = HealthCondition.Tuberculosis.condition;
    private static final String Died = HealthCondition.Died.condition;
    private static Map<String, Integer> healthCounter;

    public PatientCounter() {
        healthCounter = new LinkedHashMap<>();
        healthCounter.put(Fever, 0);
        healthCounter.put(Healthy, 0);
        healthCounter.put(Diabetes, 0);
        healthCounter.put(Tuberculosis, 0);
        healthCounter.put(Died, 0);
    }

    public void count(List<Patients> patients) {
        for (Patients patient : patients) {
            if (patient.getHealthState() instanceof Fever)
                healthCounter.replace(Fever, healthCounter.get(Fever) + 1);
            else if (patient.getHealthState() instanceof Healthy)
                healthCounter.replace(Healthy, healthCounter.get(Healthy) + 1);
            else if (patient.getHealthState() instanceof Diabetes)
                healthCounter.replace(Diabetes, healthCounter.get(Diabetes) + 1);
            else if (patient.getHealthState() instanceof Tuberculosis)
                healthCounter.replace(Tuberculosis, healthCounter.get(Tuberculosis) + 1);
            else if (patient.getHealthState() instanceof Dead)
                healthCounter.replace(Died, healthCounter.get(Died) + 1);
        }
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        healthCounter.forEach((key, value) -> builder.append(key).append(":").append(value).append(" "));
        return builder.toString().replaceAll(" $", "");
    }

}
