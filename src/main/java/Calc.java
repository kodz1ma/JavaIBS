import java.util.Scanner;

public class Calc {
    public void StartCal(){
        double num1;
        double num2;
        double ans;
        char op;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        System.out.print("\nChoose an operator(+,-,*,/): ");
        op = in.next().charAt(0);

        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.printf("Wrong op");
                return;
        }

        System.out.print("The result of operation:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + String.format("%.4f", ans));
    }
}
