package com.goeuro.model;

/**
 * City Mapper class.
 *
 * Created by max on 14/5/16.
 */
public class City {

    private Integer _id;
    private String key;
    private String name;
    private String fullName;
    private String iata_airport_code;
    private String type;
    private String countryId;
    private String country;
    private GeoPosition geo_position;
    private String locationId;
    private Boolean inEurope;
    private String countryCode;
    private Boolean coreCountry;
    private Integer distance;

    public AlternativeNames getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(AlternativeNames alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    private AlternativeNames alternativeNames;



    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    private Names names;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public GeoPosition getGeo_position() {
        return geo_position;
    }

    public void setGeo_position(GeoPosition geo_position) {
        this.geo_position = geo_position;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIata_airport_code() {
        return iata_airport_code;
    }

    public void setIata_airport_code(String iata_airport_code) {
        this.iata_airport_code = iata_airport_code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public Boolean getInEurope() {
        return inEurope;
    }

    public void setInEurope(Boolean inEurope) {
        this.inEurope = inEurope;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Boolean getCoreCountry() {
        return coreCountry;
    }

    public void setCoreCountry(Boolean coreCountry) {
        this.coreCountry = coreCountry;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
}
