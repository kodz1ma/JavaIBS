package sweets;

import logic.Sweets;

public class None implements Sweets {

    String name;
    int price;
    int weight;

    int calories;
    String country;
    String flavor;
    String additionalInformation;

    public None(String name, int price, int weight, String additionalInformation){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.additionalInformation = additionalInformation;
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

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getCountryOfManufacture() {
        return country;
    }

    public void setCountryOfManufacture(String country) {
        this.country = country;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

}