package com.hospital.entities.patients;

public class FeverPatient {

    private static String shortStatus = HealthCondition.Fever.condition;
    private static String status = HealthCondition.Fever.name();

    public static String getShortStatus() {
        return shortStatus;
    }

    public static String getStatus() {
        return status;
    }
}
