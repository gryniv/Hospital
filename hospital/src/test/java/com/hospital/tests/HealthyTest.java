package com.hospital.tests;

import com.hospital.entity.Patient;
import com.hospital.strategy.Healthy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.hospital.entity.Drug.*;
import static com.hospital.entity.HealthCondition.*;

public class HealthyTest {
    private Healthy healthy;
    private Patient healthyPatient;

    @Before
    public void setUp() {
        this.healthyPatient = new Patient(HEALTHY);
        this.healthy = new Healthy();
    }

    @Test
    public void healthyShouldBeStillHealthy() {
        healthyPatient.getDrugs().add(PARACETAMOL);
        healthy.useDrugs(healthyPatient);
        Assert.assertEquals(healthyPatient.getHealthCondition(), HEALTHY);
    }

    @Test
    public void healthyShouldBeFever() {
        healthyPatient.getDrugs().add(ANTIBIOTIC);
        healthyPatient.getDrugs().add(INSULIN);
        healthyPatient.setDays(40);
        healthy.useDrugs(healthyPatient);
        Assert.assertEquals(healthyPatient.getHealthCondition(), FEVER);
    }

    @Test
    public void healthyTakeAspirinAndParacetamolShouldBeDied() {
        healthyPatient.getDrugs().add(ASPIRIN);
        healthyPatient.getDrugs().add(PARACETAMOL);
        healthy.useDrugs(healthyPatient);
        Assert.assertEquals(healthyPatient.getHealthCondition(), DIED);
    }
}
