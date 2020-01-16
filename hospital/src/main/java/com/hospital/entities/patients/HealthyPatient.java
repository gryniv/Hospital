package com.hospital.entities.patients;

public class HealthyPatient {

    private static String shortStatus = HealthCondition.Healthy.condition;
    private static String status = HealthCondition.Healthy.name();

    public static String getShortStatus() {
        return shortStatus;
    }

    public static String getStatus() {
        return status;
    }
}
