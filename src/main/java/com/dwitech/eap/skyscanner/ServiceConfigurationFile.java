package com.dwitech.eap.skyscanner;

import org.apache.deltaspike.core.api.config.PropertyFileConfig;

public class ServiceConfigurationFile implements PropertyFileConfig {
    @Override
    public String getPropertyFileName() {
        return "service.properties";
    }

    @Override
    public boolean isOptional() {
        return false;
    }
}
