package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

public enum Medicament {

    ASPIRIN {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(ASPIRIN));
            return patients;
        }
    }, INSULIN {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(INSULIN));
            return patients;
        }
    }, ANTIBIOTIC {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(ANTIBIOTIC));
            return patients;
        }
    }, PARACETAMOL {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(PARACETAMOL));
            return patients;
        }
    };

    public abstract List<Patients> giveFor(List<Patients> patients);

}
