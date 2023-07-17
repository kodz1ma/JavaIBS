/**
 * @author Вячеслав Кузеванов
 */

import logic.SweetsC;
import logic.SweetsJ;
import logic.SweetsL;
import logic.SweetsN;
import sweets.Candy;
import sweets.Jellybean;
import sweets.Lollipop;
import sweets.None;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<SweetsC> sweetCandys = new ArrayList<>();
        ArrayList<SweetsJ> sweetJellybeans = new ArrayList<>();
        ArrayList<SweetsL> sweetLollipops = new ArrayList<>();
        ArrayList<SweetsN> sweetNone = new ArrayList<>();

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
                    sweetCandys.add(candy);
                    totalPrice += candy.getPrice();
                    totalWeight += candy.getWeight();
                    System.out.println("Candy \"Птичье молоко\" add in a gift");
                    break;
                case "2":
                    Jellybean jellybean = new Jellybean("Jellybean \"Мармеладные бобы\"", 200, 350, "USA");
                    sweetJellybeans.add(jellybean);
                    totalPrice += jellybean.getPrice();
                    totalWeight += jellybean.getWeight();
                    System.out.println("Jellybean \"Мармеладные бобы\" add in a gift");
                    break;
                case "3":
                    Lollipop lollipop = new Lollipop("Lollipop \"Петушки\"", 60, 80, "Caramel");
                    sweetLollipops.add(lollipop);
                    totalPrice += lollipop.getPrice();
                    totalWeight += lollipop.getWeight();
                    System.out.println("Lollipop \"Петушки\" add in a gift");
                    break;
                case "0":
                    end = true;
                    if ((totalPrice == 0) && (totalWeight == 0)){
                        None none = new None("No sweets have been selected", 0,0, "repeat enter of sweets!");
                        sweetNone.add(none);
                        totalPrice += none.getPrice();
                        totalWeight += none.getWeight();
                        System.out.println("No sweets have been selected!");
                    }
                    break;
            }
        }

        int count = 0;

        System.out.println("\nGift:");
        for (SweetsC sweetC:sweetCandys) {
            count++;
            System.out.println(count + ". " + sweetC.getName() + " - " + sweetC.getCalories() + " cal");
        }
        for (SweetsL sweetL:sweetLollipops){
            count++;
            System.out.println(count + ". " + sweetL.getName() + " - " + "Falvor: " + sweetL.getFlavor());
        }
        for (SweetsJ sweetJ:sweetJellybeans){
            count++;
            System.out.println(count + ". " + sweetJ.getName() + " - " + "From country: " + sweetJ.getCountryOfManufacture());
        }
        for (SweetsN sweetN:sweetNone){
            count++;
            System.out.println(count + ". " + sweetN.getName() + " - " + sweetN.getAdditionalInformation());
        }

        System.out.println(String.format("\nWeight of the gift: %s g.\nPrise of the gift: %s rub.", totalWeight, totalPrice));
    }
}

