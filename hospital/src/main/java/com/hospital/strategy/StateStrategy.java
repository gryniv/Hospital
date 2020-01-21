package com.hospital.strategy;


import com.hospital.entity.Patient;

public interface StateStrategy {

    void useDrugs(Patient patient);
}
