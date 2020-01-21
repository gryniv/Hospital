package com.hospital.entities.patients.drugs;

import com.hospital.entities.patients.patients.Patient;

import java.util.List;

import static com.hospital.entities.patients.drugs.Medicament.ANTIBIOTIC;

public class Antibiotic implements Drugs {


    @Override
    public List<Patient> giveFor(List<Patient> patients) {
        patients.forEach(s -> s.applyMedicament(ANTIBIOTIC));
        return patients;
    }
}
