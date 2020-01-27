package com.hospital.tests;

import com.hospital.entity.Patient;
import com.hospital.strategy.Diabetes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.hospital.entity.Drug.ASPIRIN;
import static com.hospital.entity.HealthCondition.DIABETES;
import static com.hospital.entity.HealthCondition.DIED;

public class DiabetesTest {
    private Diabetes diabetes;
    private Patient diabetesPatient;

    @Before
    public void setUp() {
        this.diabetesPatient = new Patient(DIABETES);
        this.diabetes = new Diabetes();
    }

    @Test
    public void diabetesShouldBeStillSick() {
        diabetesPatient.getDrugs().add(ASPIRIN);
        diabetes.useDrugs(diabetesPatient);
        Assert.assertEquals(diabetesPatient.getHealthCondition(), DIABETES);
    }

    @Test
    public void diabetesShouldBeDied() {
        diabetesPatient.getDrugs().add(ASPIRIN);
        diabetesPatient.setDays(40);
        diabetes.useDrugs(diabetesPatient);
        Assert.assertEquals(diabetesPatient.getHealthCondition(), DIED);
    }
}
