package com.hospital.entities.patients;

public class DiabetesPatient {

    private static String shortStatus = HealthCondition.Diabetes.condition;
    private static String status = HealthCondition.Diabetes.name();

    public static String getShortStatus() {
        return shortStatus;
    }

    public static String getStatus() {
        return status;
    }
}
