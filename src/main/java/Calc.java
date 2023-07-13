/**
 * @author Вячсеслав Кузеванов
 */

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {

    public double StartCal(String num1, String num2, char op) {

        double ans = 0;

        try {
            Pattern pattern = Pattern.compile("[a-zA-Z]");
            Matcher matcher = pattern.matcher(num1);
            Matcher matcher2 = pattern.matcher(num2);

            if (matcher.find() || matcher2.find()) {
                throw new NumberFormatException("Wrong numbers!!!");
            }
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
            return ans;
        }

        double num1d = Double.parseDouble(num1.replace(",","."));
        double num2d = Double.parseDouble(num2.replace(",","."));

            switch (op) {
                case '+':
                    ans = num1d + num2d;
                    break;
                case '-':
                    ans = num1d - num2d;
                    break;
                case '*':
                    ans = num1d * num2d;
                    break;
                case '/':
                    ans = num1d / num2d;
                    break;
                default:
            }

        try {
            if (ans == Double.POSITIVE_INFINITY){
                throw new ArithmeticException("Divided by zero!!!");
            }
            if (String.valueOf(op).matches("[^+-/*]")){
                throw new Exception("Wrong operator!!!");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        return ans;

    }
}

