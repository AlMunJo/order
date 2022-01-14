package com.joachim.order.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public final class Address {
    private String streetName;
    private String houseNumber;
    private String postalCode;
    private String city;

    public Address(String streetName,
                   String houseNumber,
                   String postalCode,
                   String city) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public Address() {

    }

    public String streetName() {
        return streetName;
    }

    public String houseNumber() {
        return houseNumber;
    }

    public String postalCode() {
        return postalCode;
    }

    public String city() {
        return city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Address) obj;
        return Objects.equals(this.streetName, that.streetName) &&
                Objects.equals(this.houseNumber, that.houseNumber) &&
                Objects.equals(this.postalCode, that.postalCode) &&
                Objects.equals(this.city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, houseNumber, postalCode, city);
    }

    @Override
    public String toString() {
        return "Address[" +
                "streetName=" + streetName + ", " +
                "houseNumber=" + houseNumber + ", " +
                "postalCode=" + postalCode + ", " +
                "city=" + city + ']';
    }

}