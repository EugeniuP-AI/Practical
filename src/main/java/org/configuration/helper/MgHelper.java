package org.configuration.helper;

import org.configuration.data.MgConfiguration;
import org.configuration.interfaces.Configuration;
import org.configuration.interfaces.Retrievable;

public class MgHelper implements Retrievable {
    private final String mgName;
    private final int mgId;

    public MgHelper(String mgName, int mgId){
        this.mgName = mgName;
        this.mgId = mgId;
    }

    @Override
    public Configuration getConfiguration(){
        return new MgConfiguration(mgName,mgId);
    }
}
