import java.util.Scanner;

class Calculator {
    double a, b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double add() {
        return a + b;
    }

    double subtract() {
        return a - b;
    }

    double multiply() {
        return a * b;
    }

    double divide() {
        if (b != 0)
            return a / b;
        else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();

        Calculator calc = new Calculator(a, b);

        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + calc.add());
                break;
            case "subtract":
                System.out.println("Result: " + calc.subtract());
                break;
            case "multiply":
                System.out.println("Result: " + calc.multiply());
                break;
            case "divide":
                System.out.println("Result: " + calc.divide());
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}
