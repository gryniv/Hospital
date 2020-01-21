package com.hospital.entities.patients;


import com.hospital.entities.drugs.Drug;
import com.hospital.entities.patients.status.HealthCondition;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private int days;
    private List<Drug> drugs;
    private HealthCondition healthCondition;

    public Patient(HealthCondition healthCondition) {
        this.drugs = new ArrayList<>();
        this.healthCondition = healthCondition;
    }

    public HealthCondition getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(final HealthCondition healthCondition) {
        this.healthCondition = healthCondition;
    }

    public void setHealthState(final HealthCondition healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getDays() {
        return days;
    }

    public void setDays(final int days) {
        this.days = days;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }
    public void setDrugs(final List<Drug> drugs) {
        this.drugs = drugs;
    }
}
