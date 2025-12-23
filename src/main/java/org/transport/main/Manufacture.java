package org.transport.main;

public class Manufacture {
    private String companyName;
    private String country;
    private int yearFounded;

    public Manufacture(String companyName, String country, int yearFounded) {
        this.companyName = companyName;
        this.country = country;
        this.yearFounded = yearFounded;
    }

    public String getCompanyName() {
        return companyName;
    }
    public String getCountry() {
        return country;
    }
    public int getYearFounded() {
        return yearFounded;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "companyName='" + companyName + '\'' +
                ", country='" + country + '\'' +
                ", yearFounded=" + yearFounded +
                '}';
    }
}
