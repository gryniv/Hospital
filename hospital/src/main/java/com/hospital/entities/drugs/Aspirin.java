package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

import static com.hospital.entities.drugs.Medicament.ASPIRIN;

public class Aspirin implements Drugs {


    @Override
    public List<Patients> giveFor(List<Patients> patients) {
        patients.forEach(s -> s.applyMedicament(ASPIRIN));
        return patients;
    }
}
