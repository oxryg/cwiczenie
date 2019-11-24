package data;

public class Address {
    String town;
    String postcode;
    String street;
    String house;
    String apartment;

    public Address(String town, String postcode, String street, String house, String apartment) {
        this(town, postcode, street, house);
        this.apartment = apartment;
    }

    public Address(String town, String postcode, String street, String house) {
        this.town = town;
        this.postcode = postcode;
        this.street = street;
        this.house = house;
    }
   
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
