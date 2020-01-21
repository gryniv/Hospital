package com.hospital.factory;


import com.hospital.exception.UnknownHealthConditionException;
import com.hospital.strategy.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.hospital.constant.QuarantineConstants.*;
import static com.hospital.constant.QuarantineConstants.H;


public class StateFactory {

    private final static Logger LOG = LogManager.getLogger(StateFactory.class);

    public StateFactory() {

    }

    public static StateStrategy getStrategy(String healthCondition) {
        switch (healthCondition) {
            case F:
                return new Fever();
            case D:
                return new Diabetes();
            case T:
                return new Tuberculosis();
            case H:
                return new Healthy();
            case X:
                return new Dead();
            default:
                LOG.error("Patient with unknown health condition is come.");
                throw new UnknownHealthConditionException();
        }
    }


}
