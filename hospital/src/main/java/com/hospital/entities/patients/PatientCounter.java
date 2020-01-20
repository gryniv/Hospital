package com.hospital.entities.patients;


import com.hospital.entities.patients.status.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.hospital.entities.patients.status.HealthCondition.*;

public class PatientCounter {

    private static final Logger LOG = LogManager.getLogger(PatientCounter.class);
    private static final String fever = FEVER.condition;
    private static final String healthy = HEALTHY.condition;
    private static final String diabetes = DIABETES.condition;
    private static final String tuberculosis = TUBERCULOSIS.condition;
    private static final String died = DIED.condition;
    private static final Map<String, Integer> HEALTH_COUNTER = new LinkedHashMap<>();
    private static final String SPACE = " ";
    private static final String COLON = ":";

    public PatientCounter() {
        HEALTH_COUNTER.put(fever, 0);
        HEALTH_COUNTER.put(healthy, 0);
        HEALTH_COUNTER.put(diabetes, 0);
        HEALTH_COUNTER.put(tuberculosis, 0);
        HEALTH_COUNTER.put(died, 0);
    }

    public void count(List<Patients> patients) {
        for (Patients patient : patients) {
            if (patient.getHealthState() instanceof Fever){
                LOG.info(patient + " now - is Fever.");
                HEALTH_COUNTER.replace(fever, HEALTH_COUNTER.get(fever) + 1);}
            else if (patient.getHealthState() instanceof Healthy){
                LOG.info(patient + " now - is Healthy.");
                HEALTH_COUNTER.replace(healthy, HEALTH_COUNTER.get(healthy) + 1);}
            else if (patient.getHealthState() instanceof Diabetes){
                LOG.info(patient + " now - is Diabetes.");
                HEALTH_COUNTER.replace(diabetes, HEALTH_COUNTER.get(diabetes) + 1);}
            else if (patient.getHealthState() instanceof Tuberculosis){
                LOG.info(patient + " now - is Tuberculosis.");
                HEALTH_COUNTER.replace(tuberculosis, HEALTH_COUNTER.get(tuberculosis) + 1);}
            else if (patient.getHealthState() instanceof Dead){
                LOG.info(patient + " now - is Died.");
                HEALTH_COUNTER.replace(died, HEALTH_COUNTER.get(died) + 1);}
        }
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        HEALTH_COUNTER.forEach((key, value) -> builder.append(key).append(COLON).append(value).append(SPACE));
        return builder.toString().trim();
    }

}
