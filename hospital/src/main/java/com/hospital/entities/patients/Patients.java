package com.hospital.entities.patients;


import com.hospital.entities.drugs.Medicament;
import com.hospital.entities.patients.status.HealthState;

public class Patients {

    private HealthState healthState;

    public Patients(HealthState healthState) {
        this.healthState = healthState;
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

}
