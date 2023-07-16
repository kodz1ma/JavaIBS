/**
 * @author Вячеслав Кузеванов
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Sweets> sweets = new ArrayList<>();

        int totalPrice = 0;
        int totalWeight = 0;
        boolean end = false;

        System.out.println("Enter the number of sweet in the gift:");
        System.out.println("'1' - Candy");
        System.out.println("'2' - Jellybean");
        System.out.println("'3' - Lollipop");
        System.out.println("'0' - end of enter");

        while (!end) {

            String num = in.nextLine();

            switch (num){
                case "1":
                    Candy candy = new Candy("Candy \"Птичье молоко\"", 100, 500, "Very sweet");
                    sweets.add(candy);
                    totalPrice += candy.getPrice();
                    totalWeight += candy.getWeight();
                    System.out.println("Candy \"Птичье молоко\" add in a gift");
                    break;
                case "2":
                    Jellybean jellybean = new Jellybean("Jellybean \"Мармеладные бобы\"", 200, 350, "Lots of bright flavors");
                    sweets.add(jellybean);
                    totalPrice += jellybean.getPrice();
                    totalWeight += jellybean.getWeight();
                    System.out.println("Jellybean \"Мармеладные бобы\" add in a gift");
                    break;
                case "3":
                    Lollipop lollipop = new Lollipop("Lollipop \"Петушки\"", 60, 80, "Taste of childhood");
                    sweets.add(lollipop);
                    totalPrice += lollipop.getPrice();
                    totalWeight += lollipop.getWeight();
                    System.out.println("Lollipop \"Петушки\" add in a gift");
                    break;
                case "0":
                    end = true;
                    if ((totalPrice == 0) && (totalWeight == 0)){
                        None none = new None("No sweets have been selected", 0,0, "repeat enter of sweets!");
                        sweets.add(none);
                        totalPrice += none.getPrice();
                        totalWeight += none.getWeight();
                        System.out.println("No sweets have been selected!");
                    }
                    break;
            }
        }

        int count = 0;

        System.out.println("\nGift:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getAdditionalInformation());
        }

        System.out.println(String.format("\nWeight of the gift: %s g.\nPrise of the gift: %s rub.", totalWeight, totalPrice));
    }
}

