package com.hospital.entities.patients.status;


import com.hospital.entities.patients.Patients;

public enum HealthCondition {
    Healthy("H") {
        @Override
        public Patients addPatient() {
            return new Patients(new Healthy());
        }
    }, Fever("F") {
        @Override
        public Patients addPatient() {
            return new Patients(new Fever());
        }
    }, Diabetes("D") {
        @Override
        public Patients addPatient() {
            return new Patients(new Diabetes());
        }
    }, Tuberculosis("T") {
        @Override
        public Patients addPatient() {
            return new Patients(new Tuberculosis());
        }
    }, Died("X") {
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
