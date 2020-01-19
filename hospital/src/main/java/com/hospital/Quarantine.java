package com.hospital;


import com.hospital.entities.patients.PatientCounter;
import com.hospital.entities.patients.PatientGroup;
import com.hospital.entities.patients.Patients;

import java.util.List;

import static com.hospital.entities.drugs.Medicament.*;

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
        Antibiotic.giveFor(patients);
    }

    public void insulin() {
        Insulin.giveFor(patients);
    }

    public void paracetamol() {
        Paracetamol.giveFor(patients);
    }

    public void aspirin() {
        Aspirin.giveFor(patients);
    }

    public void wait40Days() {
        patients.forEach(s -> s.addTimeInQuarantine(40));
    }

    public String report() {
        PatientCounter counter = new PatientCounter();
        counter.count(patients);
        return counter.report();
    }
}
