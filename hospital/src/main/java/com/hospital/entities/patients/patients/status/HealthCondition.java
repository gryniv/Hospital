package com.hospital.entities.patients.patients.status;


import com.hospital.entities.patients.patients.Patient;
import com.hospital.strategy.*;

public enum HealthCondition {
    HEALTHY("H") {
        @Override
        public Patient addPatient() {
            return new Patient(new Healthy());
        }
    },
    FEVER("F") {
        @Override
        public Patient addPatient() {
            return new Patient(new Fever());
        }
    },
    DIABETES("D") {
        @Override
        public Patient addPatient() {
            return new Patient(new Diabetes());
        }
    },
    TUBERCULOSIS("T") {
        @Override
        public Patient addPatient() {
            return new Patient(new Tuberculosis());
        }
    },
    DIED("X") {
        @Override
        public Patient addPatient() {
            return new Patient(new Dead());
        }
    };

    private String condition;

    HealthCondition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }

    public abstract Patient addPatient();
}
