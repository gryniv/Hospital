package com.hospital.entities.patients.drugs;

import com.hospital.entities.patients.patients.Patient;

import java.util.List;

import static com.hospital.entities.patients.drugs.Medicament.ASPIRIN;

public class Aspirin implements Drugs {


    @Override
    public List<Patient> giveFor(List<Patient> patients) {
        patients.forEach(s -> s.applyMedicament(ASPIRIN));
        return patients;
    }
}
