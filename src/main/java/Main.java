/**
 * @author Вячеслав Кузеванов
 */

import logic.Sweets;
import sweets.Candy;
import sweets.Jellybean;
import sweets.Lollipop;
import sweets.None;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Sweets> sweet = new ArrayList<>();

        int totalPrice = 0;
        int totalWeight = 0;
        boolean end = false;

        System.out.println("Enter the number of sweet in the gift:");
        System.out.println("'1' - sweets.Candy");
        System.out.println("'2' - sweets.Jellybean");
        System.out.println("'3' - sweets.Lollipop");
        System.out.println("'0' - end of enter");

        while (!end) {

            String num = in.nextLine();

            switch (num){
                case "1":
                    Candy candy = new Candy("Candy \"Птичье молоко\"", 100, 500, 359);
                    sweet.add(candy);
                    totalPrice += candy.getPrice();
                    totalWeight += candy.getWeight();
                    System.out.println("Candy \"Птичье молоко\" add in a gift");
                    break;
                case "2":
                    Jellybean jellybean = new Jellybean("Jellybean \"Мармеладные бобы\"", 200, 350, "USA");
                    sweet.add(jellybean);
                    totalPrice += jellybean.getPrice();
                    totalWeight += jellybean.getWeight();
                    System.out.println("Jellybean \"Мармеладные бобы\" add in a gift");
                    break;
                case "3":
                    Lollipop lollipop = new Lollipop("Lollipop \"Петушки\"", 60, 80, "Caramel");
                    sweet.add(lollipop);
                    totalPrice += lollipop.getPrice();
                    totalWeight += lollipop.getWeight();
                    System.out.println("Lollipop \"Петушки\" add in a gift");
                    break;
                case "0":
                    end = true;
                    if ((totalPrice == 0) && (totalWeight == 0)){
                        None none = new None("No sweets have been selected", 0,0, "repeat enter of sweets!");
                        sweet.add(none);
                        totalPrice += none.getPrice();
                        totalWeight += none.getWeight();
                        System.out.println("No sweets have been selected!");
                    }
                    break;
            }
        }

        int count = 0;

        System.out.println("\nGift:");
        for (Sweets sweets:sweet) {
            count++;
            if (sweets.getAdditionalInformation() != null){
            System.out.println(sweets.getName() + ": " + sweets.getAdditionalInformation());
            } else if (sweets.getCalories() != 0) {
                System.out.println(count + ". " + sweets.getName() + " - " + sweets.getCalories() + " cal (in 100 g.)");
            } else if (sweets.getCountryOfManufacture() != null) {
                System.out.println(count + ". " + sweets.getName() + " - " + "From country: " + sweets.getCountryOfManufacture());
            } else if (sweets.getFlavor() != null) {
                System.out.println(count + ". " + sweets.getName() + " - " + "Falvor: " + sweets.getFlavor());
            }
        }

        System.out.println(String.format("\nWeight of the gift: %s g.\nPrise of the gift: %s rub.", totalWeight, totalPrice));
    }
}

