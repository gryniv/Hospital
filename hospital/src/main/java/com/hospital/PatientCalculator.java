package com.hospital;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import com.hospital.entities.patients.Patient;
import com.hospital.entities.patients.status.HealthCondition;

import static com.hospital.constant.QuarantineConstants.COLON;
import static com.hospital.constant.QuarantineConstants.SPACE;

public class PatientCalculator {

    public String calculate(List<Patient> patientList) {
        Map<String, Integer> result = new LinkedHashMap<>();
        for (HealthCondition value : HealthCondition.values()) {
            result.put(value.getCondition(), 0);
        }
        patientList.forEach(p -> result.computeIfPresent(p.getHealthCondition().getCondition(), (k, v) -> ++v));
        StringJoiner stringJoiner = new StringJoiner(SPACE);
        result.forEach((key, value) -> stringJoiner.add(key + COLON + value));
        return stringJoiner.toString();
    }
}
