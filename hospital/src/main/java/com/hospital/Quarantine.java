package com.hospital;


import com.hospital.entities.patients.drugs.Drugs;
import com.hospital.entities.patients.drugs.Paracetamol;
import com.hospital.entities.patients.drugs.Antibiotic;
import com.hospital.entities.patients.drugs.Aspirin;
import com.hospital.entities.patients.drugs.Insulin;
import com.hospital.entities.patients.patients.PatientGroup;
import com.hospital.entities.patients.patients.Patient;

import java.util.List;

public class Quarantine {

    /**
     * To perform this exercise, you will use a readable, maintainable & pragmatic coding style.
     * Please remember that how it's done is as important as the end result.
     */

    final List<Patient> patients;
    final static Drugs paracetamol = new Paracetamol();
    final static Drugs antibiotic = new Antibiotic();
    final static Drugs aspirin = new Aspirin();
    final static Drugs insulin = new Insulin();
    private static PatientCounter counter;

    public Quarantine(String patients) {
        this.patients = PatientGroup.placing(patients);
        counter = new PatientCounter();
    }

    public void aspirin() {
        aspirin.giveFor(patients);
    }

    public void antibiotic() {
        antibiotic.giveFor(patients);
    }

    public void insulin() {
        insulin.giveFor(patients);
    }

    public void paracetamol() {
        paracetamol.giveFor(patients);
    }

    public void wait40Days() {
        patients.forEach(s -> s.addTimeInQuarantine(40));
    }

    public String report() {
        return counter.count(patients);
    }
}
