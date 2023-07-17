package sweets;

import logic.SweetsJ;

public class Jellybean implements SweetsJ {
    String name;
    int price;
    int weight;

    String country;

    public Jellybean(String name, int price, int weight, String country){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountryOfManufacture() {
        return country;
    }

    public void setCountryOfManufacture(String country) {
        this.country = country;
    }
}