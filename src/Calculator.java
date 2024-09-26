import java.util.Scanner;

public class Calculator {
    public static double addNumbers(double a, double b) {
        return a + b;
    }
    public static double subtractNumbers(double a, double b) {
        return a - b;
    }
    public static double multiplyNumbers(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice !=1 && choice !=2 && choice !=3) {
            System.out.println("Invalid input. Try again. ");
            scanner.close();
            return;
        }

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (choice == 1) {
            double sum = addNumbers(num1, num2);
            System.out.println("The sum of the two numbers is: " + sum);
        }
        if (choice == 2) {
            double difference = subtractNumbers(num1, num2);
            System.out.println("The difference of the two numbers is: " + difference);
        }
        else if (choice == 3) {
            double multiplication = multiplyNumbers(num1, num2);
            System.out.println("The result of the two numbers is: " + multiplication);
        }

        scanner.close();
    }
}

