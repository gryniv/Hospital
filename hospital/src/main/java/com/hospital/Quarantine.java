package com.hospital;


import com.hospital.entities.drugs.*;
import com.hospital.factory.StateFactory;
import com.hospital.factory.PatientFactory;
import com.hospital.entities.patients.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.hospital.constant.QuarantineConstants.COMMA;

public class Quarantine {

    /**
     * To perform this exercise, you will use a readable, maintainable & pragmatic coding style.
     * Please remember that how it's done is as important as the end result.
     */

    final List<Patient> patientList = new ArrayList<>();


    public Quarantine(String patients) {
        parsePatients(patients);
    }

    private void parsePatients(final String patients) {
        Arrays.stream(patients.split(COMMA)).forEach(s -> patientList.add(PatientFactory.getPatient(s)));
    }

    public void aspirin() {
        patientList.forEach(p -> p.getDrugs().add(Drug.ASPIRIN));
    }

    public void antibiotic() {
        patientList.forEach(p -> p.getDrugs().add(Drug.ANTIBIOTIC));
    }

    public void insulin() {
        patientList.forEach(p -> p.getDrugs().add(Drug.INSULIN));
    }

    public void paracetamol() {
        patientList.forEach(p -> p.getDrugs().add(Drug.PARACETAMOL));
    }

    public void wait40Days() {
        patientList.forEach(s -> s.setDays(40));
    }

    public String report() {
        patientList.forEach(p -> StateFactory.getStrategy(p.getHealthCondition().getCondition()).useDrugs(p));
        return new PatientCalculator().calculate(patientList);
    }
}
