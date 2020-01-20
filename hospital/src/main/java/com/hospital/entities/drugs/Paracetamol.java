package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

import static com.hospital.entities.drugs.Medicament.PARACETAMOL;

public class Paracetamol implements Drugs {

    public Paracetamol() {

    }

    @Override
    public List<Patients> giveFor(List<Patients> patients) {
        patients.forEach(s -> s.applyMedicament(PARACETAMOL));
        return patients;
    }
}
