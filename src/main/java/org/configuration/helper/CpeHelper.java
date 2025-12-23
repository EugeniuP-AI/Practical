package org.configuration.helper;

import org.configuration.interfaces.Configuration;
import org.configuration.interfaces.Retrievable;

public class CpeHelper implements Retrievable {
    private final String name;
    private final int id;

    public CpeHelper(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public Configuration getConfiguration() {
        return new org.configuration.data.CpeConfiguration(name, id);
    }
}
