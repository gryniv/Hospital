package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

public interface Drug {

    void applyMedicament(Medicament medicament, List<Patients> patients);

}
