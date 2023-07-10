/**
 * @author Вячсеслав Кузеванов
 */

import java.util.Scanner;

public class Calc {
    public void StartCal() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        System.out.print("\nChoose an operator(+,-,*,/): ");
        char op = in.next().charAt(0);

        if (op != '+' && op != '-' && op !='*' && op != '/'){
            System.err.printf("Wrong op");
            return;
        }

        double result = calculate(num1, num2, op);
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
