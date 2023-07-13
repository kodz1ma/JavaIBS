/**
 * @author Вячсеслав Кузеванов
 */

import java.util.Scanner;

public class Calc {
    public double StartCal(double num1, double num2, char op) {

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
