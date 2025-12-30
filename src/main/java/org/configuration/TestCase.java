package org.configuration;

import org.configuration.helper.CpeHelper;
import org.configuration.helper.DpsHelper;
import org.configuration.helper.MgHelper;
import org.configuration.interfaces.Configuration;
import org.configuration.interfaces.Retrievable;

import java.util.List;

public class TestCase {

    public static void main(String[] args) {
        CpeHelper cpeHelper = new CpeHelper("CPE-2-1", 2);
        DpsHelper dpsHelper = new DpsHelper("DPS-1-1", 1);
        MgHelper mgHelper = new MgHelper("MG-3-1", 3);
//        System.out.println(cpeHelper.getConfiguration());
//        System.out.println(dpsHelper.getConfiguration());
//        System.out.println(mgHelper.getConfiguration());
        List<Retrievable> retrievables = List.of(cpeHelper, dpsHelper, mgHelper);
        for (Retrievable retrievable : retrievables) {
            Configuration configuration = retrievable.getConfiguration();
        }
    }
}