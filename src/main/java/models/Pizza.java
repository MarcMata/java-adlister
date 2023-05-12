package models;

public class Pizza {
    private String size;
    private String crust;
    private String sauce;
    private String toppings;
    private String Address;

    public Pizza(String size, String crust, String sauce, String toppings, String address) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
        Address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Pizza(String crust, String sauce, String toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public Pizza() {
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }
}
