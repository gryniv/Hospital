package com.hospital.tests;

import com.hospital.entity.Patient;
import com.hospital.strategy.Tuberculosis;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.hospital.entity.Drug.*;
import static com.hospital.entity.HealthCondition.*;

public class TuberculosisTest {
    private Tuberculosis tuberculosis;
    private Patient tuberculosisPatient;

    @Before
    public void setUp() {
        this.tuberculosisPatient = new Patient(TUBERCULOSIS);
        this.tuberculosis = new Tuberculosis();
    }

    @Test
    public void tuberculosisShouldBeStillSick() {
        tuberculosisPatient.getDrugs().add(PARACETAMOL);
        tuberculosis.useDrugs(tuberculosisPatient);
        Assert.assertEquals(tuberculosisPatient.getHealthCondition(), TUBERCULOSIS);
    }

    @Test
    public void tuberculosisShouldBeHealthy() {
        tuberculosisPatient.getDrugs().add(ANTIBIOTIC);
        tuberculosisPatient.setDays(40);
        tuberculosis.useDrugs(tuberculosisPatient);
        Assert.assertEquals(tuberculosisPatient.getHealthCondition(), HEALTHY);
    }

    @Test
    public void tuberculosisTakeAspirinAndParacetamolShouldBeDied() {
        tuberculosisPatient.getDrugs().add(ASPIRIN);
        tuberculosisPatient.getDrugs().add(PARACETAMOL);
        tuberculosis.useDrugs(tuberculosisPatient);
        Assert.assertEquals(tuberculosisPatient.getHealthCondition(), DIED);
    }

}
