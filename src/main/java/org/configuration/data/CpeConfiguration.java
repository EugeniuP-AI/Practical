package org.configuration.data;

import org.configuration.interfaces.Configuration;

public class CpeConfiguration implements Configuration {
    private String cpeName;
    private int cpeId;

    public CpeConfiguration(String cpeName, int cpeId) {
        this.cpeName = cpeName;
        this.cpeId = cpeId;
    }

    @Override
    public String toString() {
        return "Cpe{" +
                "cpeName='" + cpeName + '\'' +
                ", cpeId=" + cpeId +
                '}';
    }
}
