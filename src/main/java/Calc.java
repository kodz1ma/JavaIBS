/**
 * @author Вячсеслав Кузеванов
 */

import java.util.Scanner;

public class Calc {

    public void StartCal() throws ArithmeticException {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.print("\nChoose an operator(+,-,*,/): ");
        char op = in.next().charAt(0);

        double result = calculate(num1, num2, op);

        try {
            if (result == Double.POSITIVE_INFINITY){
                throw new ArithmeticException("Divided by zero!!!");
            }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("\nThe result of operation:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + String.format("%.4f", result));

        in.close();
    }
        public double calculate(double num1, double num2, char op) {

            double ans = 0;

            switch (op) {
                case '+':
                    ans = num1 + num2;
                    break;
                case '-':
                    ans = num1 - num2;
                    break;
                case '*':
                    ans = num1 * num2;
                    break;
                case '/':
                    ans = num1 / num2;
                    break;
                default:
            }

            return ans;
        }
}
