package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

public interface Drugs {

    List<Patients> giveFor(List<Patients> patients);
}
