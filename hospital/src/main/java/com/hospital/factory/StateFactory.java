package com.hospital.factory;


import com.hospital.entities.patients.status.HealthCondition;
import com.hospital.exception.UnknownHealthConditionException;
import com.hospital.strategy.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.hospital.constant.QuarantineConstants.*;
import static com.hospital.constant.QuarantineConstants.H;


public class StateFactory {

    private final static Logger LOG = LogManager.getLogger(StateFactory.class);

    public StateFactory() {

    }

    public static StateStrategy getStrategy(String healthCondition) {
        switch (healthCondition) {
            case F:
//                LOG.info("{} patient now - is ill Fever.", patient.getName());
                return new Fever();
            case D:
//                LOG.info("{} patient now - is ill Diabetes.", patient.getName());
                return new Diabetes();
            case T:
//                LOG.info("{} patient now - is ill Tuberculosis.", patient.getName());
                return new Tuberculosis();
            case H:
//                LOG.info("{} patient now - is Healthy.", patient.getName());
                return new Healthy();
            default:
                LOG.error("Patient with unknown health condition is come.");
                throw new UnknownHealthConditionException();
        }
    }



}
