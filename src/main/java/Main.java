/**
 * @author Вячеслав Кузеванов
 * @see Calc
 * @see Words
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int ch;
    System.out.print("Enter number of task: (1 - calculator, 2 - string array)\n");
    Scanner in = new Scanner(System.in);
    ch = in.next().charAt(0);

    if (ch == '1') {

        Calc calc = new Calc();
        calc.StartCal();

        } else if (ch == '2') {

            Words words = new Words();
            words.WordsStart();
            } else {
            System.err.println("Wrong number of task");
        }
    in.close();
    }
}
