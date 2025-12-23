package org.transport.enums;

public enum Engine {
    DIESEL,
    PETROL,
    ELECTRIC,
    HYBRID,
    GASOLINE;


    public String getType() {
        return this.name();
    }
}
