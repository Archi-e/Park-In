package model;

public class Address {
    private String blockNumber;
    private String lane_name;
    private String city;
    private String country;
    private String zipcode;

    public Address(String blockNumber, String lane_name, String city, String country, String zipcode) {
        this.blockNumber = blockNumber;
        this.lane_name = lane_name;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String getBlock_number() {
        return blockNumber;
    }

    public void setBlock_number(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getLane_name() {
        return lane_name;
    }

    public void setLane_name(String lane_name) {
        this.lane_name = lane_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
