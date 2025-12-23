package org.configuration.data;

import org.configuration.interfaces.Configuration;

public class MgConfiguration implements Configuration {
    private String name;
    private int id;

    public MgConfiguration(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MgConfiguration{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
