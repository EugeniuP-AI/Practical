package org.example.enums;

public enum OperationalSystem {
    ANDROID,
    IOS,
    WINDOWS,
    LINUX,
    MACOS;


    public String getValue() {
        return this.name();
    }

}
