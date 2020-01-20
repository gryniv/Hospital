package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

public enum HealthCondition {
    HEALTHY("H") {
        @Override
        public Patients addPatient() {
            return new Patients(new Healthy());
        }
    }, FEVER("F") {
        @Override
        public Patients addPatient() {
            return new Patients(new Fever());
        }
    }, DIABETES("D") {
        @Override
        public Patients addPatient() {
            return new Patients(new Diabetes());
        }
    }, TUBERCULOSIS("T") {
        @Override
        public Patients addPatient() {
            return new Patients(new Tuberculosis());
        }
    }, DIED("X") {
        @Override
        public Patients addPatient() {
            return new Patients(new Dead());
        }
    };

    public String condition;

    HealthCondition(String condition) {
        this.condition = condition;
    }

    public abstract Patients addPatient();
}
