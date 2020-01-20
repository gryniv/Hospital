package com.hospital.entities.patients.status;


import com.hospital.entities.drugs.Medicament;
import com.hospital.entities.patients.Patients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import static com.hospital.entities.drugs.Medicament.ASPIRIN;
import static com.hospital.entities.drugs.Medicament.PARACETAMOL;

public abstract class HealthState {

    private static final Logger LOG = LogManager.getLogger(HealthState.class);
    protected final List<Medicament> medicament;
    protected int days;

    public HealthState() {
        medicament = new ArrayList<>();
        days = 0;
    }

    public void applyMedicament(Medicament medicament) {
        this.medicament.add(medicament);
    }

    public void addPeriod(int days) {
        this.days += days;
    }

    protected void checkParacetamolPlusAspirin(Patients patient) {
        if (medicament.contains(ASPIRIN) && medicament.contains(PARACETAMOL)) {
            LOG.info("You take for patient Aspirin and Paracetamol.");
            patient.setHealthState(new Dead());
        }
    }

    public abstract void changeState(Patients patient);
}
