package com.hospital;


import com.hospital.entities.drugs.Medicament;
import com.hospital.entities.patients.PatientCounter;
import com.hospital.entities.patients.PatientGroup;
import com.hospital.entities.patients.Patients;

import java.util.List;

public class Quarantine {

    /**
     * To perform this exercise, you will use a readable, maintainable & pragmatic coding style.
     * Please remember that how it's done is as important as the end result.
     */

    final List<Patients> patients;

    public Quarantine(String patients) {
        this.patients = PatientGroup.placing(patients);
    }

    public void antibiotic() {
        Medicament.Antibiotic.giveFor(patients);
    }

    public void insulin() {
        Medicament.Insulin.giveFor(patients);
    }

    public void paracetamol() {
        Medicament.Paracetamol.giveFor(patients);
    }

    public void aspirin() {
        Medicament.Aspirin.giveFor(patients);
    }

    public void wait40Days() {
        int days = 40;
        patients.forEach(s->s.addTimeInQuarantine(days));
    }

    public String report() {
        PatientCounter counter = new PatientCounter();
        counter.count(patients);
        return counter.report();
    }
}
