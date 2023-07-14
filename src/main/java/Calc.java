/**
 * @author Вячсеслав Кузеванов
 */

public class Calc {

    public double StartCal(String num1, String num2, char op) {

        double ans = 0;

        try {
            Double.parseDouble(num1.replace(",", "."));
            Double.parseDouble(num2.replace(",", "."));

            if (String.valueOf(op).matches("[^+-/*]")) {
                throw new RuntimeException("Wrong OP!!!");
            }
        } catch (NumberFormatException e) {
            System.err.println("Numbers contains wrong simbols!!!\n");
        } catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

        if (String.valueOf(op).matches("[^+-/*]")) {
            throw new RuntimeException("Wrong OP!!!");
        }

        double num1d = Double.parseDouble(num1.replace(",", "."));
        double num2d = Double.parseDouble(num2.replace(",", "."));

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

        try{
            if (ans == Double.POSITIVE_INFINITY) {
                throw new ArithmeticException("Divided by zero!!!");
            }
        } catch (ArithmeticException e){
                    System.err.println(e.getMessage());
        }

        if (ans == Double.POSITIVE_INFINITY) {
            throw new ArithmeticException("Divided by zero!!!");
        }

        return ans;
    }
}

