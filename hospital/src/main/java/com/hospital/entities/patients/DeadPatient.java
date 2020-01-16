package com.hospital.entities.patients;

public class DeadPatient {

    private static String shortStatus = HealthCondition.Died.condition;
    private static String status = HealthCondition.Died.name();

    public static String getShortStatus() {
        return shortStatus;
    }

    public static String getStatus() {
        return status;
    }
}
