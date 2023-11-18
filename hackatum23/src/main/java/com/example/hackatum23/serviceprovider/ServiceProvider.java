package com.example.hackatum23.serviceprovider;

public class ServiceProvider {
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private String street;
    private int houseNumber;
    private float lon;
    private float lan;
    private int maxDrivingDistance;
    public ServiceProvider() {
        }

    public ServiceProvider(long id, String firstName, String lastName, String city, String street, int houseNumber,
                           float lon, float lan, int maxDrivingDistance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.lon = lon;
        this.lan = lan;
        this.maxDrivingDistance = maxDrivingDistance;
    }

    public ServiceProvider(String firstName, String lastName, String city, String street, int houseNumber, float lon,
                           float lan, int maxDrivingDistance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.lon = lon;
        this.lan = lan;
        this.maxDrivingDistance = maxDrivingDistance;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLan() {
        return lan;
    }

    public void setLan(float lan) {
        this.lan = lan;
    }

    public int getMaxDrivingDistance() {
        return maxDrivingDistance;
    }

    public void setMaxDrivingDistance(int maxDrivingDistance) {
        this.maxDrivingDistance = maxDrivingDistance;
    }

    @Override
    public String toString() {
        return "ServiceProvider{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", lon=" + lon +
                ", lan=" + lan +
                ", maxDrivingDistance=" + maxDrivingDistance +
                '}';
    }
}

