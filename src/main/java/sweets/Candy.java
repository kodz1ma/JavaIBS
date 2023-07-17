package sweets;

import logic.SweetsC;

public class Candy implements SweetsC {

    String name;
    int price;
    int weight;

    int calories;

    public Candy(String name, int price, int weight, int calories){
        this.name = name;
        this.price = price;
        this.weight =  weight;
        this.calories = calories;
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

}