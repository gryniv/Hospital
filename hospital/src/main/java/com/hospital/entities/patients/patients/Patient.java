package com.hospital.entities.patients.patients;


import com.hospital.entities.patients.drugs.Medicament;
import com.hospital.strategy.HealthState;

public class Patient {

    private final String name;
    private HealthState healthState;

    public Patient(HealthState healthState) {
        this.healthState = healthState;
        this.name = healthState.getClass().getSimpleName();
    }

    public HealthState getHealthState() {
        return healthState;
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public void addTimeInQuarantine(int days) {
        healthState.addPeriod(days);
        healthState.changeState(this);
    }

    public void applyMedicament(Medicament medicament) {
        healthState.applyMedicament(medicament);
        healthState.changeState(this);
    }

    public String getName() {
        return name;
    }
}
