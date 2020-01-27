package com.hospital.tests;

import com.hospital.entity.Patient;
import com.hospital.strategy.Diabetes;
import com.hospital.strategy.Fever;
import com.hospital.strategy.Healthy;
import com.hospital.strategy.Tuberculosis;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.hospital.entity.Drug.ASPIRIN;
import static com.hospital.entity.Drug.PARACETAMOL;
import static com.hospital.entity.HealthCondition.*;
import static org.junit.Assert.assertEquals;

public class AllPatientsTest {
    private List<Patient> patientList;
    private Diabetes diabetes;
    private Tuberculosis tuberculosis;
    private Healthy healthy;
    private Fever fever;

    @Before
    public void setUp() {
        this.tuberculosis = new Tuberculosis();
        this.diabetes = new Diabetes();
        this.healthy = new Healthy();
        this.fever = new Fever();
        this.patientList = new ArrayList<>();
        this.patientList.add(new Patient(TUBERCULOSIS));
        this.patientList.add(new Patient(DIABETES));
        this.patientList.add(new Patient(HEALTHY));
        this.patientList.add(new Patient(FEVER));
    }

    @Test
    public void anyPeopleShouldBeDied() {
        patientList.forEach(patient -> {
            patient.getDrugs().add(ASPIRIN);
            patient.getDrugs().add(PARACETAMOL);

        });
        patientList.forEach(patient -> {
            diabetes.useDrugs(patient);
            fever.useDrugs(patient);
            healthy.useDrugs(patient);
            tuberculosis.useDrugs(patient);
            assertEquals(patient.getHealthCondition(), DIED);
        });
    }

}
