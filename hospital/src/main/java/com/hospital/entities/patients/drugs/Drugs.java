package com.hospital.entities.patients.drugs;

import com.hospital.entities.patients.patients.Patient;

import java.util.List;

public interface Drugs {

    List<Patient> giveFor(List<Patient> patients);
}
