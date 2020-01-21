package com.hospital.strategy;


import com.hospital.entities.patients.Patient;

public interface StateStrategy {

    void useDrugs(Patient patient);
}
