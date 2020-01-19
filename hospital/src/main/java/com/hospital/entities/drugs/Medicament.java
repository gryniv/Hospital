package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

public enum Medicament {

    Aspirin {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(Aspirin));
            return patients;
        }
    }, Insulin {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(Insulin));
            return patients;
        }
    }, Antibiotic {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(Antibiotic));
            return patients;
        }
    }, Paracetamol {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            patients.forEach(s->s.applyMedicament(Paracetamol));
            return patients;
        }
    };

    public abstract List<Patients> giveFor(List<Patients> patients);

}
