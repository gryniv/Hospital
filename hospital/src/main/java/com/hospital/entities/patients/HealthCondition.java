package com.hospital.entities.patients;

public enum HealthCondition {
    Healthy("H"), Fever("F"), Diabetes("D"), Tuberculosis("T"), Died("X");

    public String condition;

    HealthCondition(String condition) {
        this.condition = condition;
    }
}
