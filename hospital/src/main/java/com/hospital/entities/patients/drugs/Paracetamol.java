package com.hospital.entities.patients.drugs;

import com.hospital.entities.patients.patients.Patient;

import java.util.List;

import static com.hospital.entities.patients.drugs.Medicament.PARACETAMOL;

public class Paracetamol implements Drugs {


    @Override
    public List<Patient> giveFor(List<Patient> patients) {
        patients.forEach(s -> s.applyMedicament(PARACETAMOL));
        return patients;
    }
}
