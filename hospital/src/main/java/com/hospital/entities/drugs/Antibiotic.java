package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

public class Antibiotic implements Drug {

    public void applyMedicament(Medicament medicament, List<Patients> patients) {
        for (Patients patient : patients) {
            patient.applyMedicament(medicament);
        }
    }
}
