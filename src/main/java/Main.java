/**
 * @author Вячеслав Кузеванов
 * @see Calc
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.print("\nChoose an operator(+,-,*,/): ");
        char op = in.next().charAt(0);
        in.close();

        if (op != '+' && op != '-' && op !='*' && op != '/'){
            System.err.printf("Wrong op");
            return;
        }

        Calc calc = new Calc();
        double result = calc.StartCal(num1, num2, op);;
        System.out.print("\nThe result of operation:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + String.format("%.4f", result));
    }
}