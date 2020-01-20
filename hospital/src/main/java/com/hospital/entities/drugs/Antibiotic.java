package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

import static com.hospital.entities.drugs.Medicament.ANTIBIOTIC;

public class Antibiotic implements Drugs {

    public Antibiotic() {

    }

    @Override
    public List<Patients> giveFor(List<Patients> patients) {
        patients.forEach(s -> s.applyMedicament(ANTIBIOTIC));
        return patients;
    }
}
