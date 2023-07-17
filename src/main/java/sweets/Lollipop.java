package sweets;

import logic.SweetsL;

public class Lollipop implements SweetsL {
    String name;
    int price;
    int weight;

    String flavor;

    public Lollipop(String name, int price, int weight, String flavor){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.flavor = flavor;
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

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}