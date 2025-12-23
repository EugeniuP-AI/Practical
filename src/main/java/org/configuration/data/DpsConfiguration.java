package org.configuration.data;

import org.configuration.interfaces.Configuration;

public class DpsConfiguration implements Configuration {
    private String dpsName;
    private int dpsId;

    public DpsConfiguration(String dpsName, int dpsId) {
        this.dpsName = dpsName;
        this.dpsId = dpsId;
    }

    @Override
    public String toString() {
        return "DpsConfiguration{" +
                "dpsName='" + dpsName + '\'' +
                ", dpsId=" + dpsId +
                '}';
    }
}
