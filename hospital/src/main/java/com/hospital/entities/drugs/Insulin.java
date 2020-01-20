package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

import static com.hospital.entities.drugs.Medicament.INSULIN;

public class Insulin implements Drugs {

    public Insulin() {

    }

    @Override
    public List<Patients> giveFor(List<Patients> patients) {
        patients.forEach(s -> s.applyMedicament(INSULIN));
        return patients;
    }
}
