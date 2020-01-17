package com.hospital.entities.drugs;

import com.hospital.entities.patients.Patients;

import java.util.List;

public enum Medicament {

    Aspirin {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            aspirin.applyMedicament(Aspirin, patients);
            return patients;
        }
    }, Insulin {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            insulin.applyMedicament(Insulin, patients);
            return patients;
        }
    }, Antibiotic {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            antibiotic.applyMedicament(Antibiotic, patients);
            return patients;
        }
    }, Paracetamol {
        @Override
        public List<Patients> giveFor(List<Patients> patients) {
            paracetamol.applyMedicament(Paracetamol, patients);
            return patients;
        }
    };

    private static final Drug aspirin = new Aspirin();
    private static final Drug insulin = new Insulin();
    private static final Drug antibiotic = new Antibiotic();
    private static final Drug paracetamol = new Paracetamol();

    public abstract List<Patients> giveFor(List<Patients> patients);

}
