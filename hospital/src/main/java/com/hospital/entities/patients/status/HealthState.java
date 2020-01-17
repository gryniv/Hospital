package com.hospital.entities.patients.status;


import com.hospital.entities.drugs.Medicament;
import com.hospital.entities.patients.Patients;

import java.util.ArrayList;
import java.util.List;

public abstract class HealthState {
    protected final List<Medicament> medicament;
    protected int days;

    public HealthState() {
        medicament = new ArrayList<>();
        days = 0;
    }

    public void applyMedicament(Medicament medicament) {
        this.medicament.add(medicament);
    }

    public void addPeriod(int days) {
        this.days += days;
    }

    protected void checkParacetamolPlusAspirin(Patients patient) {
        if (medicament.contains(Medicament.Aspirin) && medicament.contains(Medicament.Paracetamol)) {
            patient.setHealthState(new Dead());
        }
    }

    public abstract void changeState(Patients patient);
}
