package com.hospital.entities.patients;


import com.hospital.entities.patients.status.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.hospital.entities.patients.status.HealthCondition.*;

public class PatientCounter {

    private static final String fever = Fever.condition;
    private static final String healthy = Healthy.condition;
    private static final String diabetes = Diabetes.condition;
    private static final String tuberculosis = Tuberculosis.condition;
    private static final String died = Died.condition;
    private static Map<String, Integer> healthCounter;

    public PatientCounter() {
        healthCounter = new LinkedHashMap<>();
        healthCounter.put(fever, 0);
        healthCounter.put(healthy, 0);
        healthCounter.put(diabetes, 0);
        healthCounter.put(tuberculosis, 0);
        healthCounter.put(died, 0);
    }

    public void count(List<Patients> patients) {
        for (Patients patient : patients) {
            if (patient.getHealthState() instanceof Fever)
                healthCounter.replace(fever, healthCounter.get(fever) + 1);
            else if (patient.getHealthState() instanceof Healthy)
                healthCounter.replace(healthy, healthCounter.get(healthy) + 1);
            else if (patient.getHealthState() instanceof Diabetes)
                healthCounter.replace(diabetes, healthCounter.get(diabetes) + 1);
            else if (patient.getHealthState() instanceof Tuberculosis)
                healthCounter.replace(tuberculosis, healthCounter.get(tuberculosis) + 1);
            else if (patient.getHealthState() instanceof Dead)
                healthCounter.replace(died, healthCounter.get(died) + 1);
        }
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        healthCounter.forEach((key, value) -> builder.append(key).append(":").append(value).append(" "));
        return builder.toString().replaceAll(" $", "");
    }

}
