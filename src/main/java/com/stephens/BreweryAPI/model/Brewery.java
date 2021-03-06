package com.stephens.BreweryAPI.model;


import java.sql.Timestamp;

public class Brewery {
    private String id;
    private String name;
    private String brewery_type;
    private String street;
    private String address_2;
    private String address_3;
    private String city;
    private String state;
    private String county_province;
    private String postal_code;
    private String country;
    private String longitude;
    private String latitude;
    private String phone;
    private String website_url;
    private Timestamp updated_at;
    private Timestamp created_at;

    public Brewery() {
        id = "1";
        name = "OrangeTree";
    }

    public Brewery(String id, String name, String brewery_type, String street, String address_2, String address_3, String city, String state, String county_province, String postal_code, String country, String longitude, String latitude, String phone, String website_url, Timestamp updated_at, Timestamp created_at) {
        this.id = id;
        this.name = name;
        this.brewery_type = brewery_type;
        this.street = street;
        this.address_2 = address_2;
        this.address_3 = address_3;
        this.city = city;
        this.state = state;
        this.county_province = county_province;
        this.postal_code = postal_code;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.website_url = website_url;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrewery_type() {
        return brewery_type;
    }

    public void setBrewery_type(String brewery_type) {
        this.brewery_type = brewery_type;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getAddress_3() {
        return address_3;
    }

    public void setAddress_3(String address_3) {
        this.address_3 = address_3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty_province() {
        return county_province;
    }

    public void setCounty_province(String county_province) {
        this.county_province = county_province;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String Stringitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
