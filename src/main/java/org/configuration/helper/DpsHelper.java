package org.configuration.helper;

import org.configuration.data.DpsConfiguration;
import org.configuration.interfaces.Configuration;
import org.configuration.interfaces.Retrievable;

public class DpsHelper implements Retrievable {
    private final String dpsName;
    private final int dpsId;

    public DpsHelper(String dpsName, int dpsId) {
        this.dpsName = dpsName;
        this.dpsId = dpsId;
    }

    @Override
    public Configuration getConfiguration() {
        return new DpsConfiguration(dpsName, dpsId);
    }
}

