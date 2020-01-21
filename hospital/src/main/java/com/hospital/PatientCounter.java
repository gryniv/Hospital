package com.hospital;


import com.hospital.entities.patients.patients.Patient;
import com.hospital.entities.patients.patients.status.*;
import com.hospital.strategy.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class PatientCounter {

    private final static Logger LOG = LogManager.getLogger(PatientCounter.class);
    private final static Map<String, Integer> HEALTH_COUNTER = new LinkedHashMap<>();
    private final static String TUBERCULOSIS = HealthCondition.TUBERCULOSIS.getCondition();
    private final static String DIABETES = HealthCondition.DIABETES.getCondition();
    private final static String HEALTHY = HealthCondition.HEALTHY.getCondition();
    private final static String FEVER = HealthCondition.FEVER.getCondition();
    private final static String DIED = HealthCondition.DIED.getCondition();
    private final static String SPACE = " ";
    private final static String COLON = ":";

    public PatientCounter() {
        HEALTH_COUNTER.put(FEVER, 0);
        HEALTH_COUNTER.put(HEALTHY, 0);
        HEALTH_COUNTER.put(DIABETES, 0);
        HEALTH_COUNTER.put(TUBERCULOSIS, 0);
        HEALTH_COUNTER.put(DIED, 0);
    }

    public String count(List<Patient> patients) {
        LOG.info("++++ Hospital gives for all patients medication:");
        for (Patient patient : patients) {
            if (patient.getHealthState() instanceof Fever) {
                LOG.info("{} patient now - is ill Fever.", patient.getName());
                HEALTH_COUNTER.replace(FEVER, HEALTH_COUNTER.get(FEVER) + 1);
            } else if (patient.getHealthState() instanceof Healthy) {
                LOG.info("{} patient now - is Healthy.", patient.getName());
                HEALTH_COUNTER.replace(HEALTHY, HEALTH_COUNTER.get(HEALTHY) + 1);
            } else if (patient.getHealthState() instanceof Diabetes) {
                LOG.info("{} patient now - is ill Diabetes.", patient.getName());
                HEALTH_COUNTER.replace(DIABETES, HEALTH_COUNTER.get(DIABETES) + 1);
            } else if (patient.getHealthState() instanceof Tuberculosis) {
                LOG.info("{} patient now - is ill Tuberculosis.", patient.getName());
                HEALTH_COUNTER.replace(TUBERCULOSIS, HEALTH_COUNTER.get(TUBERCULOSIS) + 1);
            } else if (patient.getHealthState() instanceof Dead) {
                LOG.info("{} patient now - is Died.", patient.getName());
                HEALTH_COUNTER.replace(DIED, HEALTH_COUNTER.get(DIED) + 1);
            }
        }
        LOG.info("Done. Result is {} \n", report());
        return report();
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        HEALTH_COUNTER.forEach((key, value) -> builder.append(key).append(COLON).append(value).append(SPACE));
        return builder.toString().trim();
    }

}
