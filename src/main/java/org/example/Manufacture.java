package org.example;

public class Manufacture {
    private String country;
    private String address;

    public Manufacture(String country, String address) {
        this.country = country;
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "country='" + country + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
