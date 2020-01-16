package com.hospital.entities.patients;

public class TuberculosisPatient {

    private static String shortStatus = HealthCondition.Tuberculosis.condition;
    private static String status = HealthCondition.Tuberculosis.name();

    public static String getShortStatus() {
        return shortStatus;
    }

    public static String getStatus() {
        return status;
    }
}
