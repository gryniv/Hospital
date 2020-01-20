package com.hospital.entities.patients.status;


import com.hospital.entities.drugs.Medicament;
import com.hospital.entities.patients.Patients;

import java.util.ArrayList;
import java.util.List;


public abstract class HealthState {

    protected final List<Medicament> medicament;
    protected int days;

    public HealthState() {
        this.medicament = new ArrayList<>();
        this.days = 0;
    }

    public List<Medicament> getMedicament() {
        return medicament;
    }

    public void applyMedicament(Medicament medicament) {
        this.medicament.add(medicament);
    }

    public void addPeriod(int days) {
        this.days += days;
    }

    public abstract void changeState(Patients patient);
}
