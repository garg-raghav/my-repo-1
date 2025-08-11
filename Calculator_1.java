import java.util.Scanner;

public class Calculator_1 {

    public static void Add(double a, double b) {
        System.out.println("Result: " + (a + b));
    }

    public static void Sub(double a, double b) {
        System.out.println("Result: " + (a - b));
    }

    public static void Multi(double a, double b) {
        System.out.println("Result: " + (a * b));
    }

    public static void Divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }

    public static void Exp(double a, double b) {
        System.out.println("Result: " + Math.pow(a, b));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String again;

        do {
            System.out.print("");
            
            double a = input.nextDouble();
            char op = input.next().charAt(0);
            double b = input.nextDouble();

            switch (op) {
                case '+': Add(a, b); break;
                case '-': Sub(a, b); break;
                case '*': Multi(a, b); break;
                case '/': Divide(a, b); break;
                case '^': Exp(a, b); break;
                default: System.out.println("Invalid operation! Use +, -, *, /, ^");
            }

            System.out.print("Do you want to calculate again? (yes/no): ");
            again = input.next().toLowerCase();

        } while (again.equals("yes"));

        System.out.println("Calculator closed. Goodbye!");
    }
}
