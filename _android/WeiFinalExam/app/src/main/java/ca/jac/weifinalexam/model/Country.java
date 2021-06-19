package ca.jac.weifinalexam.model;


import androidx.annotation.NonNull;

/**
 * Created by masoud on 2017-04-13.
 */

public class Country implements Comparable {

    private String countryName;
    private String capital;

    public Country(String countryName, String capital) {
        this.countryName = countryName;
        this.capital = capital;
    }

    public String getCountryName() {
        return countryName.toUpperCase();
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapital() {
        return capital.substring(0,1).toUpperCase() + capital.substring(1).toLowerCase();
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return  getCountryName() + ", " + getCapital();
    }

    @Override
    public int compareTo(@NonNull Object o) {
        Country otherCountry = (Country) o;
        return getCountryName().compareTo(otherCountry.getCountryName());
    }
}
